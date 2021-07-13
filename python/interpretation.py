#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Apr  8 09:56:02 2021

@author: antolin
"""

import matplotlib.pyplot as plt
import matplotlib as mpl
import networkx as nx
import graphviz

def getMapAttention(G,atts):
    colors = {}
    for i,n in enumerate(G.nodes()):
        colors[n] = atts.detach().cpu().numpy()[i]
    return colors


def getColors(map_colors):
    low, *_, high = sorted(map_colors.values())
    norm = mpl.colors.Normalize(vmin=low, vmax=high, clip=True)
    mapper = mpl.cm.ScalarMappable(norm=norm, cmap=mpl.cm.coolwarm)
    color_map_new = {}
    for n in map_colors.keys():
        nc = mapper.to_rgba(map_colors[n], bytes=True)
        color_map_new[n] = '#%02x%02x%02x' % (nc[0],nc[1],nc[2])
    return color_map_new

def heatMap(G,atts,filename,directory,ignore=[]):
    g = graphviz.Digraph(filename='example')
    colors = getColors(getMapAttention(G,atts))
    for e in G.edges:
        if ('_inv' in G[e[0]][e[1]][e[2]]['type']):
            continue
        if (G[e[0]][e[1]][e[2]]['type'] in ignore):
            continue
        g.node(str(e[0]), label = G.nodes[e[0]]['type'], color=colors[e[0]], 
               style='filled',fillcolor = colors[e[0]])
        g.node(str(e[1]), label = G.nodes[e[1]]['type'], color=colors[e[1]], 
               style='filled',fillcolor = colors[e[1]])
        g.edge(str(e[0]), str(e[1]),label=G[e[0]][e[1]][e[2]]['type'])
    g.format = 'pdf'
    g.view(filename,directory)

def plotGraphViz(G,filename,directory):
    g = graphviz.Digraph(filename='example')
    for e in G.edges:
        g.node(str(e[0]), label = G.nodes[e[0]]['type'])
        g.node(str(e[1]), label = G.nodes[e[1]]['type'])
        g.edge(str(e[0]), str(e[1]),label=G[e[0]][e[1]][e[2]]['type'])
    g.format = 'pdf'
    g.view(filename,directory)
    

def knbrs(G,start,k):
    nb = list(set([start]))
    for l in range(k):
        nb = list(set(nb + [z for m in nb for z in G.neighbors(m)]))
    return set([n for n in nb if n!=start])

def subgraph(G,nodes,k):
    nds=[]
    for n in nodes:
        nds = nds + list(knbrs(G,n,k))
    nds = list(set(nds + nodes))
    return G.subgraph(nds)

def importantSubgraph(G, attention, thresh, k):
    colors = {}
    for i,n in enumerate(G.nodes()):
        colors[n] = attention[i]
    ords = dict(sorted(colors.items(), key=lambda item: -item[1]))
    acc = 0
    nodes = []
    for key,v in ords.items():
        acc = acc + v
        nodes.append(key)
        if acc > thresh:
            break
    G_sub = subgraph(G,nodes,k)
    for n in nodes:
        G_sub.nodes[n]['important']= 'True'
    return G_sub

def plot_graph_attention(G, map_colors):
    
    low, *_, high = sorted(map_colors.values())
    norm = mpl.colors.Normalize(vmin=low, vmax=high, clip=True)
    mapper = mpl.cm.ScalarMappable(norm=norm, cmap=mpl.cm.coolwarm)
    
    
    node_list = list(G.nodes())
    node_colors = [mapper.to_rgba(map_colors[i]) 
                    for i in node_list]
    
    edge_labels = {}
    for e in list(G.edges.data()):
        edge_labels[(e[0],e[1])] = e[2]['type']
    
    plt.figure(3,figsize=(20,20)) 
    pos = nx.spring_layout(G)

    nx.draw(G,pos,edge_color='black',width=1,linewidths=1,\
    node_size=500,alpha=0.9,\
    labels = dict(G.nodes.data()),
           nodelist=node_list, node_color = node_colors)

    #nx.draw(G, labels = dict(G.nodes.data()),with_labels = True)
    nx.draw_networkx_edge_labels(G,pos,edge_labels=edge_labels,font_color='red')
    plt.show()