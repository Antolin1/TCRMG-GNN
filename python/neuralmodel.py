#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Jul 12 15:19:38 2021

@author: antolin
"""

import torch_geometric.nn as pyg_nn
import torch_geometric.utils as pyg_utils
import torch
import torch.nn as nn
import torch.nn.functional as F
from torch_scatter.composite import scatter_softmax

class GNN_MoRec(nn.Module):
    
    def __init__(self,dim_input,hidden_dim,dropout,vocab_nodes,vocab_edges):
        super(GNN_MoRec, self).__init__()
        
        
        self.emb_nodes = nn.Embedding(len(vocab_nodes.word2id_names), dim_input)
        
        
        self.conv_1 =  pyg_nn.RGCNConv(in_channels = dim_input, out_channels = hidden_dim, 
                                num_relations = len(vocab_edges.word2id_names))
        
        self.conv_2 =  pyg_nn.RGCNConv(in_channels = hidden_dim, out_channels = hidden_dim, 
                                num_relations = len(vocab_edges.word2id_names))
                
        
        
        self.d_1 = nn.Dropout(dropout)
        
        self.lin = nn.Linear(hidden_dim, 1)
        
        self.attention_vector = nn.Linear(hidden_dim,1,bias=False)
    
    def forward(self,nodeTypes,edge_index, edge_attr, bs):
        
        
        nodeTypes = self.emb_nodes(nodeTypes)
        
        
        
        nodes_mess_1 = self.conv_1(nodeTypes, edge_index, edge_attr)
        nodes_mess_1 = self.d_1(F.relu(nodes_mess_1))
        
        nodes_mess_1 = F.relu(self.conv_2(nodes_mess_1, edge_index, edge_attr))
        
        
        attentions = scatter_softmax(torch.squeeze(self.attention_vector(nodes_mess_1)), bs)
        
        nodes_mess_1 = torch.unsqueeze(attentions,dim=1) * nodes_mess_1
        
        graph_emb = pyg_nn.global_add_pool(nodes_mess_1, bs)
        
        rtu = self.lin(graph_emb)
        
        return F.sigmoid(rtu)
    
    def getAttentions(self,nodeTypes,edge_index, edge_attr, bs):
        
        nodeTypes = self.emb_nodes(nodeTypes)
        nodes_mess_1 = self.conv_1(nodeTypes, edge_index, edge_attr)
        nodes_mess_1 = self.d_1(F.relu(nodes_mess_1))
        
        nodes_mess_1 = F.relu(self.conv_2(nodes_mess_1, edge_index, edge_attr))
        
        
        attentions = scatter_softmax(torch.squeeze(self.attention_vector(nodes_mess_1)), bs)
        
        return attentions