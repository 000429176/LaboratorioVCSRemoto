# -*- coding: utf-8 -*-
"""
Created on Thu Mar 26 22:09:54 2020

@author: Omar
"""

#%% Punto 2

n=(int(input("Ingrese un numero de 4 cifras: ")))

while n>9999 or n<=999:
    n=(int(input("Ingrese un numero de 4 cifras: ")))

d=n/1000
d1=((d*1000)%10)//1
d2=((d*100)%10)//1
d3=((d*10)%10)//1
d4=n//1000

print("El numero invertido es: " + str(int(d1)) + str(int(d2)) + str(int(d3)) + str(int(d4)))

#%% Punto 4

n=int(input("Ingrese el numero de filas: "))

fila=1

for i in range(1, n+1, 1):
    fila=(fila*10)+i
