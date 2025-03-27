# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


d = {"facundo":"43","lautaro":"24"}
print(d)
clave = input("ingrese una clave:  ")
if clave in d.keys():
    d[clave] = input("Ingrese el nuevo valor:  ")
else:
    print("La clave no se encuentra en el diccionario.")
print(d)


