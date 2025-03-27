# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


n = int(input("Cuantas personas desea cagar:"))
per = dict()
for i in range(n):
    print("Ingrese persona numero",i+1)
    per[str(input("Ingrese DNI:"))] = {"NOMBRE:":str(input("Ingrese Nombre:")),"DOMICILIO:":str(input("Ingrese Domicilio:")),"EDAD:":int(input("Ingrese Edad:"))}
for c,v in per.items():
    print(c,v)
cont = 0
dato = str(input("Ingres el dato de una persona "))

for c,v in per.items():
    if dato == c :
        print(c,v)
        cont = 1
    else:
        if dato in v.values():
            print(c,v)
            cont = 1
if cont == 0:
    print("No existe esa persona")



