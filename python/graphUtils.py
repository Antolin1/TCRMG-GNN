#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Mar 25 12:29:32 2021

@author: antolin
"""

import matplotlib.pyplot as plt
import networkx as nx
import torch
from torch_geometric.data import Data 

def plot_graph(G):
    
    edge_labels = {}
    for e in list(G.edges.data()):
        edge_labels[(e[0],e[1])] = e[2]['type']
    
    plt.figure(3,figsize=(20,20)) 
    pos = nx.spring_layout(G)

    nx.draw(G,pos,edge_color='black',width=1,linewidths=1,\
    node_size=500,node_color='pink',alpha=0.9,\
    labels = dict(G.nodes.data()))

    #nx.draw(G, labels = dict(G.nodes.data()),with_labels = True)
    nx.draw_networkx_edge_labels(G,pos,edge_labels=edge_labels,font_color='red')
    plt.show()
    
def graph2data(G,tag,vocab_nodes,vocab_edges):
    nodeTypes = []

    for n in G.nodes():
        #types
        nodeType = G.nodes()[n]['type']
        vocab_nodes.add_word(nodeType)
        nodeType = vocab_nodes.word2id_names[nodeType]
        nodeTypes.append(nodeType)  
        
    nodeTypes = torch.tensor(nodeTypes)

            
    ##Edges and inv
    edges = []
    edges_lab = []
    for e in list(G.edges.data()):
        source = e[0]
        target = e[1]
        lab = e[2]['type']
        edges.append([source,target])
        vocab_edges.add_word(lab)
        lab = vocab_edges.word2id_names[lab]
        edges_lab.append(lab)
        
    edges = torch.transpose(torch.tensor(edges), 0, 1)
    edges_lab = torch.unsqueeze(torch.tensor(edges_lab),dim=1)
            
            
    # Read data from `raw_path`.
    return Data(x = nodeTypes,
                edge_index = edges, 
                edge_attr = edges_lab,
               y = torch.tensor(tag))

def data2graph(data,vocab_nodes,vocab_edges):
    G = nx.MultiDiGraph()
    for n,t in enumerate(data.x.numpy()):
        G.add_node(n, type=vocab_nodes.id2word_names[t])
    edges = torch.transpose(data.edge_index, 0, 1)
    for n,e in enumerate(edges.numpy()):
        s = e[0]
        t = e[1]
        n = vocab_edges.id2word_names[torch.squeeze(data.edge_attr[n]).item()]
        G.add_edge(s, t, type=n)
    return G