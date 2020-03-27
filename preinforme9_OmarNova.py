# -*- coding: utf-8 -*-
"""
Created on Thu Mar 26 22:09:54 2020

@author: Omar
"""

#%% Punto 2

n=(int(input("Ingrese un numero de 4 cifras: ")))

if n>9999 and n<=999:
    n=(int(input("Ingrese un numero de 4 cifras: ")))

d=n/1000
d1=((d*1000)%10)//1
d2=((d*100)%10)//1
d3=((d*10)%10)//1
d4=n//1000

print("El numero invertido es: " + str(d1) + str(d2) + str(d3) + str(d4))
