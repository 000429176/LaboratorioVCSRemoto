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

def difMayorMenor(utilidad):
    mayor = utilidad[0]
    menor = utilidad[0]
    cant = len(utilidad)
    for i in range(0,cant):
        if mayor<utilidad[i] :
            mayor=utilidad[i]
    for i in range(0,cant):
        if menor>utilidad[i]:
            menor=utilidad[i]
    dif = mayor-menor
    return dif

def mediana(utilidad):
    cant=len(utilidad)
    orden=0
    for j in range(0,cant):
        for i in range(0,cant-1):
            if utilidad[i]>utilidad[i+1]:
                orden=utilidad[i]
                utilidad[i]=utilidad[i+1]
                utilidad[i+1] = orden
    mitad=int(cant/2)
    if cant%2==0 :
        mediana=(utilidad[mitad]+utilidad[mitad-1])/2
    else:
        mediana=utilidad[mitad//1]
    return mediana

def mediaMediana(utilidad):
    median=mediana(utilidad)
    cant=len(utilidad)
    s = 0
    for i in range(0, cant):
        s = s+utilidad[i]
    prom = s/cant
    dif = median - prom
    print("La mediana es " + str(median) + " y el promedio es " + str(prom) + "; la diferencia de la mediana y promedio es: " + str(dif))




utilidad=utilidad()

print("La diferencia del promedio de los ultimos años y los primeros años es: " + str(difMediaUltPri(utilidad)))
print("La diferencia entre las utilidades operaciones del año con mayor utilidad y el de menor utilidad es: " + str(difMayorMenor(utilidad)))
print("La mediana es: " + str(mediana(utilidad)))
mediaMediana(utilidad)