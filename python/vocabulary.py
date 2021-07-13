#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Mar 24 11:53:30 2021

@author: antolin
"""

class Vocabulary(object):

    def __init__(self):
        self.word2id_names = {}
        self.id2word_names = {}

    def add_word(self, word):
        if not(word in self.word2id_names.keys()):
            x = len(self.id2word_names)
            self.word2id_names[word] = x
            self.id2word_names[x] = word
    
    def get_id(self,word):
        if word in self.word2id_names.keys():
            return self.word2id_names[word]
        return None
    
    def get_word(self,id):
        return self.id2word_names[id]
    
    def __len__(self):
        return len(self.word2id_names)