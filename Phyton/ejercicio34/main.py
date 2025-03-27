# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.
def generaListaCeros(longitud):
    return [0]*longitud

def generaDiccionario(l,v):
    diccionario = {}
    for i in range(len(l)):
        diccionario[l[i]] = v[i]
    return diccionario

l = [1,5,3,67,21,12,2,89,13]
v = generaListaCeros(len(l))
resultado = generaDiccionario(l,v)
print(resultado)