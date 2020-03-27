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

fila=0

for i in range(1, n+1, 1):
    fila=(fila*10)+i

print("La fila es: " + str(fila))


#%% Punto 1

#Variables que representan las coordenadas
print("Ingrese los dos valores de la primera coordenada")
x1 = int(input ("Ingrese el valor de X1: "))
y1 = int(input ("Ingrese el valor de Y1: "))
print("Ingrese los dos valores de la segunda coordenada")
x2 = int(input ("Ingrese el valor de X2: "))
y2 = int(input ("Ingrese el valor de Y2: "))

 

print("La distancia euclidiana es: " + str((((x2-x1)**2)+((y2-y1)**2))**(1/2)))

#%% Punto 3

n1 = float(input ("Ingrese el valor de la primera nota: "))
n2 = float(input ("Ingrese el valor de la segunda nota: "))
n3 = float(input ("Ingrese el valor de la tercera nota: "))
n4 = float(input ("Ingrese el valor de la cuarta nota: "))
n5 = float(input ("Ingrese el valor de la quinta nota: "))

 

nf = ((n1*0.15)+(n2*0.20)+(n3*0.15)+(n4*0.30)+(n5*0.20))

 

if nf<2:
    print("La nota final es: " + str(nf))
    print("No podrá habilitar")
elif ((nf>=2.0) and (nf<3.0)):
    print("La nota final es: " + str(nf))
    print("Ha reprobado")
elif ((nf>=3.0) and (nf<=4.5)):
    print("La nota final es: " + str(nf))
    print("Ha aprobado")
elif nf>4.5:
    print("La nota final es: " + str(nf))
    print("Felicitaciones, aprobó")
    
#%% Punto 7

#Ejemplos de los tipos de funciones en Python

#Función Aritmética

n=int(input("Ingrese un numero: "))
va=abs(n)
print(va)

#funcion de cadena

c=input("Ingrese una frase: ")

Lista = c.split()

print (Lista)

#Función importada

from math import pi
x=pi
print(x)

#Función definida por uno
n=int(input("Ingrese un numero: "))
a=int(input("Ingrese un numero: "))
def suma(n,a):
    print(n + a)
suma(n,a)