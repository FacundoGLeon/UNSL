# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

#1
'''
dic = {}
dic2 = dict()
'''
#2
'''
d={1:"Daniel", 2:"Germán", 3:"Analía", 4:"José", 5:"Gabriel"}
print("El valor asociado con la clave 3, es:",d[3])
print("La longitud del diccionario es:",len(d))
print("Las claves del diccionario son:",d.keys())
print("Los valores del diccionario son:",d.values())
'''
#3
'''
ln = [("Facundo",19),("Luciana",18),("Lautaro",19)]
d = {}
for c,v in ln:
    d[c]=v
print(d)
'''
#4
'''
d = {"Facundo":19,"Luciana":18,"Lautaro":19}
e = int(input("Ingrese un elemento: "))
cont = 0
for valores in d.values():
    if e == valores:
        cont +=1

print(f"El elemento {e} se repite {cont} veces")
'''
#5
'''
d = {}
n= int(input("Ingrese la cantidad de pares clave-valor en el diccionario: "))
for i in range(n):
    clave = input("Ingrese la clave: ")
    valor = input("Ingrese el valor: ")
    d[clave] = valor
c = input("Ingrese una clave: ")
if c in d.keys():
    print(f"La clave {c} existe en el diccionario; y su valor es:",d[c])
else:
    print(f"La clave {c} no existe en el diccionario.")
'''
#6
'''
l =[]
d = {}
n= int(input("Ingrese la cantidad de pares clave-valor en el diccionario: "))
for i in range(n):
    clave = input("Ingrese la clave: ")
    valor = input("Ingrese el valor: ")
    d[clave] = valor
print(d)
for c,v in d.items():
    l.append((c,v))
print(l)
'''
#7
'''
n = 3
persona = dict()
for i in range(n):
    dni = input("Ingrese dni: ")
    nombre = input("Ingrese nombre: ")
    domicilio = input("Ingrese domicilio: ")
    edad = input("Ingrese edad: ")
    persona[dni] = [("Nombre",nombre),("Domicilio",domicilio),("Edad",edad)]
print(persona)
'''
#8
'''
d = {"Facundo":19,"Luciana":18,"Lautaro":19}
print(d)
d["Facundo"] = 20
d.pop("Lautaro")
print(d)
'''
#9
'''
d = {"Facundo":19,"Luciana":18,"Lautaro":19}
print("El valor de un diccionario con la clave 'Lautaro' es:",d["Lautaro"])
print("La longitud del diccionario es:",len(d))
print("Esto sucede si se accede a una clave inexistente:",d["Alejandra"])
'''
#10
'''
d = {}
n= int(input("Ingrese la cantidad de pares clave-valor en el diccionario: "))
for i in range(n):
    clave = input("Ingrese la clave: ")
    valor = input("Ingrese el valor: ")
    d[clave] = valor
a = input("Ingrese un valor a: ")
b = input("Ingrese un valor b: ")
if a in d.values():
    print(f"El valor {a} se encuentra en el diccionario.")
else:
    print(f"El valor {a} no se encuentra en el diccionario.")
if b in d.values():
    print(f"El valor {b} se encuentra en el diccionario.")
else:
    print(f"El valor {b} no se encuentra en el diccionario.")
'''
#11
'''
a = input("ingrese un valor: ")
t = (input("Ingrese el primer valor de la tupla: "),input("Ingrese el primer valor de la tupla: "))
d={a:t}
print(d)
'''
#12
#No se puede sacar rodajas en diccionarios

#13
#No se puede sacar zancadas en diccionarios

#14
'''
def crearVistas(a,b):
    vista_u = set(a.keys() | b.keys())
    vista_i = set(a.keys() & b.keys())
    vista_d = set(a.keys() - b.keys())
    vista_ds = set((a.keys()-b.keys() ) | (b.keys()-a.keys()))
    return vista_u,vista_i,vista_d,vista_ds

a = {}
b = {}
n= int(input("Ingrese la cantidad de pares clave-valor en el diccionario 'a': "))
for i in range(n):
    clave = input("Ingrese la clave: ")
    valor = input("Ingrese el valor: ")
    a[clave] = valor
n = int(input("Ingrese la cantidad de pares clave-valor en el diccionario 'b': "))
for i in range(n):
    clave = input("Ingrese la clave: ")
    valor = input("Ingrese el valor: ")
    b[clave] = valor

vista_u,vista_i,vista_d,vista_ds = crearVistas(a,b)
print("Union entre las claves:",vista_u)
print("Interseccion entre las claves:",vista_i)
print("Diferencia entre las claves de a respecto a b:",vista_d)
print("Diferencia Simetrica entre las claves:",vista_ds)
'''