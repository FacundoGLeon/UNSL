# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

agenda = {"2665042742":"Amor", "1127765021" : "Leon","1153173023":"Mama"}

condicion = True
while condicion:
    n = str(input("Ingrese Nombre o Telefono del contacto:" ))
    for clave,valor in agenda.items():
        if n == clave or n == valor:
            print(agenda[clave],":",clave)
            condicion = False
    if condicion == True:
        print("El contacto no esxiste")







# See PyCharm help at https://www.jetbrains.com/help/pycharm/
