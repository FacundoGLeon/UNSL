# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

lista = []
for i in range(int(input("Indique cuandas palabras desea ingresar:" ))):
    lista.append(str(input("Ingrese palabra")))
print("Cuantas palabras tiene la lista? ",len(lista))
if len(lista)!=0:
    for i in range(len(lista)):
        print("Palabra ",i+1," : ",lista[i])
    print("La lista creada es: ",lista)
else:
    print("Error: la lista debe tener minimo un elemento")

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
