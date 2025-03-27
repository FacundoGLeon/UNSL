# This is a sample Python script.
from random import random, randint


# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.
tupla = tuple(randint(1,100) for i in range(5))

print(tupla)
print("La posicion del valor minimo es:",tupla.index(min(tupla)))
print("La posicion del valor maximo es:",tupla.index(max(tupla)))
# See PyCharm help at https://www.jetbrains.com/help/pycharm/
