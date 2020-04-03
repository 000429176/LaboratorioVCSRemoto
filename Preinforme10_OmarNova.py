# -*- coding: utf-8 -*-
"""
Created on Wed Apr  1 20:46:51 2020

@author: Omar
"""

import numpy as np

def utilidad():
    utilidad = np.array([27834, 23789, 30189, 30967, 32501, 32701, 31665, 17155, 4614, 834])
    return utilidad

def difMediaUltPri(utilidad):
    cant=len(utilidad)
    prom1 = (utilidad[cant-1] + utilidad[cant-2])/2
    prom2 = (utilidad[0] + utilidad[1])/2
    dif = prom1 - prom2
    return dif


    





utilidad=utilidad()
print("La diferencia del promedio de los ultimos años y los primeros años es: " + str(difMediaUltPri(utilidad)))