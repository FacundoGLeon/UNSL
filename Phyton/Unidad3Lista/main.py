# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

#1
'''
l=[10,"hola",2.5,20,"que",3.5,30,"tal",4.5]
print(l[-3])
print(l[1])
print(l[:3])
print(l[1::3])
print(l[2::3])
print(l[::3])
'''

#2
'''
l = [0,0,0]
l1 = [5]
n = 6
l2 = [0]*n
print(l)
print(l1)
print(l2)
'''
#3
'''
l0=[10,20]
l1=[8,20]
r = [l0[0]+l1[0],l0[1]+l1[1]]
print(r)
'''
#4
'''
l=[1,2,3,4]
print(l)
l[0] = 25
l.append(5)
print(l)
'''
#5
'''
t = [2,4,6,7,5,3,1]
n = 5
r = list(x*n for x in t)
print(t)
print(r)
'''
#6
'''
l = list()
n = 3
for i in range(n):
    v=input("ingrese valor:  ")
    l.append(v)
print(l)
'''
#7
'''
l = list()
n = 4
for i in range(n):
    v=float(input("ingrese valor:  "))
    l.append(v)
suma = int(input("Ingrese un valor a sumar: "))
s = [x+suma for x in l]
resta = int(input("Ingrese un valor a restar: "))
r = [x-resta for x in l]
print("Lista l:",l)
print(f"Lista s(cada elemento de l mas {suma}):",s)
print(f"Lista r(cada elemento de l menos {resta}):",r)
'''
#8
'''
l=[1,2,3,4,5]
print("El elemento de l en la posicion 2 es:",l[2])
print("La longitud de l es:",len(l))
print("Lo que sucede si se intenta acceder a una posicion inexistente de una lista es lo siguiente: ",l[10])
'''
#9
'''
l = ["hola","chau"]
a,b = l
print(l)
print("a:",a)
print("b:",b)
'''
#10
'''
a = input("Inrese un valor:  ")
b = input("Inrese un valor:  ")
l = [a,b]
print("a:",a)
print("b:",b)
print(l)
'''
#11
'''
l = ["10","20","hola","30","chau"]
a = input("Ingrese una valor para verificar: ")
if a in l:
    print(True)
else:
    print(False)
'''
#12
'''
l = ["10","20","hola","30","chau"]
a = input("Ingrese una valor para verificar: ")
if a in l:
    print(f"La posicion del valor '{a}' en la lista es:",l.index(a))
else:
    print("-1")
'''
#13
'''
l = ["10","20","hola","30","chau"]
print("Rodaja",l[0:3])
print("Rebanada",l[0::2])
'''
#14
'''
l = ["10","20","hola","30","chau","10"]
a = input("Ingrese una valor para verificar: ")
print(f"El valor {a} se repite {l.count(a)} veces")
'''
#15
'''
n=4
s=list()
l=[34, 3.2, "Juan","Pedro",-2]
string = input("Ingrese un string: ")
l.append(string)
print(l)
a = input("Ingrese una valor para verificar: ")
print(f"El valor {a} se repite {l.count(a)} veces")
print(f"crea un anueva lista con {n} elementos:")
for i in range(n):
    s.append(input("Ingrese valor: "))
l = l+s
print(l)
print(l[::-1])
l.reverse()
print(l)
'''
#16
'''
n = 5
l = list()
for i in range(n):
    l.append(input("Ingrese eneteros: "))
print("Lista l:",l)
l.sort()
mayor = l[len(l)-1]
menor = l[0]

print("Lista l ordenada:",l)
print("Elemento mayor:",mayor)
print("Elemento menor:",menor)
'''
#17
'''
l = ["10","20","hola","30","chau","10"]
print(l)
p = int(input(f"Ingrese un numero entre 0 y {len(l)-1}: "))
e = input("Ingrese el valor a modificar: ")
l[p]=e
print(l)
'''