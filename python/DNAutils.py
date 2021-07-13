#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Mar 25 10:55:39 2021

@author: antolin
"""

import networkx as nx

def positions(G):
    fs = None
    dic = {}
    for n in G:
        if (G[n] != {} and (G.nodes[n]['type']=='A'
                               or G.nodes[n]['type']=='G'
                               or G.nodes[n]['type']=='C'
                               or G.nodes[n]['type']=='T')):
            has = False
            for n2 in G:
                if n!=n2 and G.nodes[n2]['type']!= 'DNA':
                    try:
                        x = G[n2][n]
                        has = True
                    except:
                        continue
            if not has:
                fs = n
    for n in G:
        if (G.nodes[n]['type']=='DNA'):
            dic[n] = 0
    dic[fs] = 1
    i = 2
    last = fs
    while (True):
        try:
            last = list(G[last])[0]
            dic[last] = i
            i = i + 1
        except:
            break
    return dic

def graph2sequence(G):
    pos = positions(G)
    result = ['X']*60
    for n in pos.keys():
        if pos[n] == 0:
            continue
        result[pos[n]-1] = G.nodes[n]['type']
    return ''.join(result)