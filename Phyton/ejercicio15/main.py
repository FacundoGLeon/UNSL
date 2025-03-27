# This is a sample Python script.
from random import random, randint

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

numeroSecreto = randint(0,100)
num = int(input("Ingrese numero igual al secreto:"))
while(num!=numeroSecreto):
    if(num<numeroSecreto):
        print("El numero",num,"es menor al numero secreto")
    else:
        print("El numero",num,"es mayor al numero secreto")
    num = int(input("Ingrese Nuevamente: "))
print("El numero secreto es ",num)

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
