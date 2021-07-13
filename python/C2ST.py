#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Mar 25 10:47:26 2021

@author: antolin
"""
import scipy.stats as st
import math

def C2ST_pvalue(acc,n_test):
    return st.norm.cdf(-(acc-0.5)/(math.sqrt(1/(4*n_test))))