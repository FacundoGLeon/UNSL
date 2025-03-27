# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

def cadenas(texto,longitud):
    palabra = "".join(texto.split(" "))
    lista_cadenas = list()
    indice_final = longitud
    for i in range(0,len(palabra),longitud):
        lista_cadenas.append(palabra[i:indice_final])
        indice_final = indice_final + longitud
    return lista_cadenas

longitud = int(input("Ingrese la longitud de las cadenas: "))
texto = str(input("Ingrese un texto: "))
resultado = cadenas(texto,longitud)
print(resultado)



# See PyCharm help at https://www.jetbrains.com/help/pycharm/
