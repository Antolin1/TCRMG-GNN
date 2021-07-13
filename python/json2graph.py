# -*- coding: utf-8 -*-
"""
jsonFile to graph
"""

import json
import networkx as nx

def jsonFile2graph(file):
    data = None
    with open(file) as json_file:
        data = json.load(json_file)
    G = nx.MultiDiGraph()
    for n in data['nodes']:
        G.add_node(n, type=data['nodeTypes'][str(n)])
    for e in data['edges']:
        s = e['source']
        t = e['target']
        n = e['name']
        G.add_edge(s, t, type=n)
    return G