# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


#1
'''
d = (0,0)
t = (15,)
tp = (0,)*int(input("Indique cantidad de ceros en la tupla: "))
print(tp)
'''

#2
'''
op0=(10,20)
op1=(8,20)
r = (op0[0]+op1[0],op0[1]+op1[1])
print(r)
'''
#3
'''
mi_tupla = (1,2,3)
mi_tupla[0]=4
'''
#4
'''
t = ("amor",13,"te",8,"amo",2023)
n = int(input("Ingrese un entero:  "))
t = t*n
print(t)
'''
#5
'''
v1 = input("Ingrese un valor: ")
v2 = input("Ingrese un valor: ")
v3 = input("Ingrese un valor: ")
t = (v1,v2,v3)
print(t)
'''
#6
'''
n = 4
numeros = []
for i in range(n):
    num = int(input("Ingrese un numero:  "))
    numeros.append(num)
t = tuple(numeros)
suma = int(input("ingres el valor a sumar:  "))
s = tuple(i+suma for i in t)
# O puedo generar una lista con la suma de cada elemento y despues transformarlo en una tupla
resta = int(input("ingres el valor a restar:  "))
r = []
for elem in t:
    r.append(elem-resta)
r = tuple(r)
print("tupla t: ",t)
print(f"tupla s(cada elemento de t mas {suma} : ",s)
print(f"tupla r(cada elemento de t menos {resta} : ",r)
'''
#7
'''
t = (4,3,6)
print("Para acceder a una posicion de la tupla hay que indicar su indice t[indice]")
print("En la posicion 2 el valor es: ",t[2])
print("Si se intenta acceder a una posicion inexistente tira error IndexError.")
print("La longitud se calcula con el metodo len().")
print("La longirud de la tupla t es: ",len(t))
'''
#8
'''
print("Genere una dupla: ")
v1 = int(input("Ingrese el primer valor: "))
v2 = int(input("Ingrese el segundo valor: "))
d = (v1,v2)
print("d:",d)
a,b = d
print("a:",a)
print("b:",b)
'''
#9
'''
a = input("Ingrese el primer valor: ")
b = input("Ingrese el segundo valor: ")
t = a,b
print(t)
'''
#10
'''
t = ("2","4","hola","5")
a = input("Ingrese un valor para verificar: ")
if a in t:
    print(True)
else:
    print(False)
'''
#11
'''
t = ("2","4","hola","5")
a = input("Ingrese un valor para verificar: ")
if a in t:
    print(f"El valor {a} se encuentra en la posicion",t.index(a))
else:
    print("-1")
'''
#12
'''
#1. Concepto de rebanada:
#La rebanada (o "slicing" en inglés) es una técnica en Python que te permite acceder a partes específicas de una secuencia, como una cadena (string), lista o tupla. Utilizando la notación de rebanada, puedes extraer una porción de la secuencia original especificando un rango de índices. La sintaxis general para realizar una rebanada es [inicio:fin], donde "inicio" es el índice del primer elemento a incluir en la rebanada, y "fin" es el índice del primer elemento que se excluye de la rebanada.

cadena = "Hola, mundo"
rebanada = cadena[0:4]  # Extrae desde el índice 0 hasta el índice 4 (no incluido)
print(rebanada)
#2. Concepto de zancada (stride):
#La zancada (o "stride" en inglés) es otro aspecto de la técnica de rebanada. La zancada te permite especificar el paso o intervalo entre los elementos que deseas incluir en la rebanada. Puedes agregar un tercer número a la notación de rebanada, que indica el tamaño de la zancada. Por defecto, la zancada es 1, lo que significa que se incluyen todos los elementos en la secuencia. Puedes aumentar la zancada para saltar elementos.
secuencia = [1, 2, 3, 4, 5, 6, 7, 8, 9]
rebanada = secuencia[1:7:2]  # Desde el índice 1 hasta el 7 (no incluido), con zancada de 2
print(rebanada)  # Esto imprimirá [2, 4, 6]
'''
#13
'''
t = ("2","4","hola","2")
a = input("Ingrese un valor para verificar: ")
print(f"El valor {a} se repite {t.count(a)} veces")
'''
# 14 y 15

'''
t = ("2","4","hola","5")
e = input("Ingrese un valor para verificar: ")
if e in t:
    print(f"El valor {e} si encuentra en la tupla t")
else:
    print(f"El valor {e} no encuentra en la tupla t")
'''
#16
'''
t = (1,45,"hola","32")
r = (13,8,2023,"SIIIUUUU")
print(t+r)
'''
#17
'''
t = (1,34,56,23,57,44)
par = 0
impar = 0
for i in t:
    if i%2==0:
        par = par + i
    else:
        impar = impar + i
print("Suma Par:",par)
print("Suma Impar:",impar)
'''