#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Mar 25 10:25:34 2021

@author: antolin
"""
import sys
import glob
from sklearn.model_selection import train_test_split
from shutil import copyfile
import ntpath
import os

def main():
    model = sys.argv[1]
    pct = float(sys.argv[2])
    path = '../realGraphs/'+model+'/all/*.json'
    files = glob.glob(path)
    train, test =  train_test_split(files, test_size=pct, random_state=42)
    
    if not os.path.exists('../realGraphs/'+model+'/R1/'):
        os.makedirs('../realGraphs/'+model+'/R1/')
    for f in train:
        copyfile(f, '../realGraphs/'+model+'/R1/'+ntpath.basename(f))
    if not os.path.exists('../realGraphs/'+model+'/R2/'):
        os.makedirs('../realGraphs/'+model+'/R2/')
    for f in test:
        copyfile(f, '../realGraphs/'+model+'/R2/'+ntpath.basename(f))
    

if __name__ == "__main__":
    main()