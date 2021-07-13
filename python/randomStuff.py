#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Apr  7 16:00:24 2021

@author: antolin
"""

import matplotlib as mpl

#RandomEmfEcore
files = glob.glob("../syntheticGraphs/RANDOMEMF/Ecore/*.json")
tag = 0

for f in files:
    G = jsonFile2graph(f)
    G = addOpposite(G)
    try:
        data = graph2data(G,0,vocab_nodes,vocab_edges)
    except:
        continue
    
    batch = torch.zeros(len(G)).long()
    atts = model2.getAttentions(data.x.cuda(), data.edge_index.cuda(),
          torch.squeeze(data.edge_attr.cuda(),dim=1),batch.cuda())
    map_colors = getMapAttention(G,atts)
    
    pred = model2(data.x.cuda(), data.edge_index.cuda(),
          torch.squeeze(data.edge_attr.cuda(),dim=1),batch.cuda())
    if pred[0].item() < 0.1:
        plot_graph_attention(G,map_colors)
        plot_graph_attention(importantSubgraph(G, atts.detach().cpu().numpy(), 0.2, 2),map_colors)
        print('--'*80)