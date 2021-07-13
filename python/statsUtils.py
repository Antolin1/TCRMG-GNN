#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import math
import numpy as np
from statsmodels.base.model import GenericLikelihoodModel
from scipy.stats import nbinom, norm, poisson, uniform

class NbinomML(GenericLikelihoodModel):
    def __init__(self, endog, exog=None, verbose=False,**kwds):
        if exog is None:
            exog = np.zeros_like(endog)
            
        super(NbinomML, self).__init__(endog, exog, **kwds)
    
    def nloglikeobs(self, params):
        r = params[0]
        p = params[1]

        return -np.log(nbinom.pmf(self.endog, r, p))
    
    def fit(self, start_params=None, maxiter=10000, maxfun=5000, **kwds):
        if start_params is None:
            p = self.endog.mean() / self.endog.var()
            r = p * self.endog.mean() / (1-p)

            
            start_params = np.array([r, p])
            
        return super(NbinomML, self).fit(start_params=start_params,
                                                    maxiter=maxiter, maxfun=maxfun, **kwds)

class PoissonML(GenericLikelihoodModel):
    def __init__(self, endog, exog=None, verbose=False,**kwds):
        if exog is None:
            exog = np.zeros_like(endog)
            
        super(PoissonML, self).__init__(endog, exog, **kwds)
    
    def nloglikeobs(self, params):
        lambda_ = params[0]

        return -np.log(poisson.pmf(self.endog, lambda_))
    
    def fit(self, start_params=None, maxiter=10000, maxfun=5000, **kwds):
        if start_params is None:
            lambda_ = self.endog.mean()
            start_params = np.array([lambda_])
            
        return super(PoissonML, self).fit(start_params=start_params,
                                                    maxiter=maxiter, maxfun=maxfun, **kwds)

class NormalML(GenericLikelihoodModel):
    def __init__(self, endog, exog=None,verbose=False, **kwds):
        if exog is None:
            exog = np.zeros_like(endog)
            
        super(NormalML, self).__init__(endog, exog, **kwds)
    
    def nloglikeobs(self, params):
        mu = params[0]
        std = params[1]
        return -np.log(norm.pdf(self.endog, mu,std))
    
    def fit(self, start_params=None, maxiter=10000, maxfun=5000, **kwds):
        if start_params is None:
            mu = self.endog.mean()
            std = self.endog.std()
            start_params = np.array([mu,std])
            
        return super(NormalML, self).fit(start_params=start_params,
                                                    maxiter=maxiter, maxfun=maxfun, **kwds)


def whichFitsBetter(samples):
    best_log = -math.inf
    best_dis = {}
    ##nbinom
    try:
        results = NbinomML(samples).fit().params
        r,p = results[0], results[1]
        #print(r)
        r = round(r)
        if r == 0:
            r = 1
        d = np.sum(np.log(nbinom.pmf(samples, r, p, 0)))
        if (d>best_log):
            best_log = d
            best_dis['dis']='nbinom'
            best_dis['params'] = (r,p)
    except Exception as e: 
        print(e)
        print('Can not fit negbin')
    ##norm
    try:
        results = NormalML(samples).fit().params
        mu = results[0]
        st = results[1]
        d = np.sum(np.log(norm.pdf(samples,mu,st)))
        if (d>best_log):
            best_log = d
            best_dis['dis']='norm'
            best_dis['params'] = (mu,st)
    except:
        print('Can not fit normal')
        
    ##poisson
    try:
        results = PoissonML(samples).fit().params
        lb = results[0]
        d = np.sum(np.log(poisson.pmf(samples, lb, 0)))
        if (d>best_log):
            best_log = d
            best_dis['dis']='poisson'
            best_dis['params'] = lb
    except:
        print('Can not fit poisson')
    ##uniform
    b = np.max(samples)
    a = np.min(samples)
    d = np.sum(np.log(uniform.pdf(samples,loc=a,scale=b-a)))
    if (d>best_log):
        best_log = d
        best_dis['dis']='uniform'
        best_dis['params'] = (a,b)
    return best_dis
    