# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

n = int(input("Cuantas personas desea cagar:"))
per = dict()
for i in range(n):
    print("Ingrese persona numero",i+1)
    per[int(input("Ingrese DNI:"))] = {"NOMBRE:":str(input("Ingrese Nombre:")),"DOMICILIO:":str(input("Ingrese Domicilio:")),"EDAD:":int(input("Ingrese Edad:"))}
for c,v in per.items():
    print(c,v)
# See PyCharm help at https://www.jetbrains.com/help/pycharm/
