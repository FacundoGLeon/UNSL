# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

def mapear(funcion,lista):
    resultado = []
    for elemento in lista:
        resultado.append(funcion(elemento))
    return resultado

def cuadrado(num):
    return num**2

lista_numeros = [1,2,3,4,5]
resultado = mapear(cuadrado,lista_numeros)
print(lista_numeros)
print(resultado)

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
