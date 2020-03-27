# -*- coding: utf-8 -*-
"""
Created on Thu Mar 26 14:59:42 2020

@author: Omar
"""

a=int(input("Ingrese el a: "))
c=int(input("Ingrese el b: "))
b=int(input("Ingrese b: "))
d=int(input("Ingrese d: "))

print("El producto de los dos numeros es: " + str(a+c))
print("El doble del primer numero es: " + str(a*2))

print("El cuadrado de b es: " + str(b**2))
print("La raiz cuadrada de d es: " + str(d**(1/2)))

#%% Solucion simple

a = int(input ("Ingrese el valor de a: "))
b = int(input ("Ingrese el valor de b: "))
c = int(input ("Ingrese el valor de c: "))

d = (b*2)-(4*a*c)

if d == 0 :
    print("X1 y X2 equivalen a "+ str(-b/(2*a)))
elif d>0 :
    print("X1 es igual a: " + str(((-b+(d**(1/2)))/(2*a))))
    print("X2 es igual a: " + str(((-b-(d**(1/2)))/(2*a))))

else: 
    print("No presenta solucion dentro del dominio de los reales")

