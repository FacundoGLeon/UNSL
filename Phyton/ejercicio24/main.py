# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

def palabras(l):
    PalabraMasLarga = ""
    for i in l:
        if len(i)>=len(PalabraMasLarga):
            PalabraMasLarga = i
    return PalabraMasLarga

lista = ["hola mundo", "que tal", "Palabra mas larga"]
print("La palabra mas alta de la lista es:",palabras(lista))

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
