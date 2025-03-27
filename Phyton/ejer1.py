Python 3.11.5 (tags/v3.11.5:cce6ba9, Aug 24 2023, 14:38:34) [MSC v.1936 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.

======================================================= RESTART: C:/Users/USUARIO/Downloads/Phyton/ejer1.py =======================================================
ingresa
Traceback (most recent call last):
  File "C:/Users/USUARIO/Downloads/Phyton/ejer1.py", line 2, in <module>
    l = scan
NameError: name 'scan' is not defined
scanf(l)
Traceback (most recent call last):
  File "<pyshell#0>", line 1, in <module>
    scanf(l)
NameError: name 'scanf' is not defined
l = scan
Traceback (most recent call last):
  File "<pyshell#1>", line 1, in <module>
    l = scan
NameError: name 'scan' is not defined
print("el numero ingresado es ",int(input("ingrese un numero entero")))
ingrese un numero entero34
el numero ingresado es  34

print("el numero ingresado es ",int(input("ingrese un numero entero:")))
ingrese un numero entero:
Traceback (most recent call last):
  File "<pyshell#4>", line 1, in <module>
    print("el numero ingresado es ",int(input("ingrese un numero entero:")))
ValueError: invalid literal for int() with base 10: ''

print("el numero ingresado es: ",int(input("ingrese un numero entero: ")))
ingrese un numero entero: 23
el numero ingresado es:  23

======================================================= RESTART: C:/Users/USUARIO/Downloads/Phyton/ejer1.py =======================================================
ingrese un numero entero: 23
el numero ingresado es:  23
numero = int(4)
numero
4
f = float(4.3)
f
4.3
b = bool(true)
Traceback (most recent call last):
  File "<pyshell#11>", line 1, in <module>
    b = bool(true)
NameError: name 'true' is not defined. Did you mean: 'True'?
b=bool()
b
False
b = bool(True)
b
True
c = complex(4,7)
c
(4+7j)
// ejer 2
SyntaxError: invalid syntax
#ejer 2
n = 3
n=float(n)
n
3.0
s = str("hola mudno")
s
'hola mudno'
f = 3.4
f
3.4
f = str(f)
f
'3.4'
s = "hola mundo"
s
'hola mundo'
s = int(s)
Traceback (most recent call last):
  File "<pyshell#31>", line 1, in <module>
    s = int(s)
ValueError: invalid literal for int() with base 10: 'hola mundo'
s
'hola mundo'
int(s)
Traceback (most recent call last):
  File "<pyshell#33>", line 1, in <module>
    int(s)
ValueError: invalid literal for int() with base 10: 'hola mundo'
s = "123"
s = int(s)
s
123
 n1=int(input("Ingrese entero")) n2=int(input("Ingrese entero")) n1/n2
 
SyntaxError: unexpected indent
SyntaxError: unexpected indent
SyntaxError: incomplete input
 n1=int(input("Ingrese entero"))
 
SyntaxError: unexpected indent
n1=int(input("Ingrese entero:"))
Ingrese entero:3
n2=int(input("Ingrese entero"))
Ingrese entero4
div = int(n1/n2)
div
0
div = n1/n2
div
0.75
n1%n2
3
n1**n2
81
--------------
SyntaxError: incomplete input
#ejer4
txt = str("ingrese un texto: ")
txt = str(input("ingrese un texto: "))
ingrese un texto: holaaaa mundooo
txt
'holaaaa mundooo'
txt[1]
'o'
print(txt[3:5])
aa
print(txt[2:5])
laa
print(txt[2:6])
laaa
txt.join("er")
'eholaaaa mundooor'
txt.join(2,"fefe")
Traceback (most recent call last):
  File "<pyshell#58>", line 1, in <module>
    txt.join(2,"fefe")
TypeError: str.join() takes exactly one argument (2 given)
txt.join("fefe")
'fholaaaa mundoooeholaaaa mundooofholaaaa mundoooe'
txt = "hola mundo"
txt
'hola mundo'
txt.split("h")
['', 'ola mundo']
txt
'hola mundo'
txt.__sizeof__
<built-in method __sizeof__ of str object at 0x000001D16F8FC0F0>
txt.size()
Traceback (most recent call last):
  File "<pyshell#65>", line 1, in <module>
    txt.size()
AttributeError: 'str' object has no attribute 'size'
txt.size
Traceback (most recent call last):
  File "<pyshell#66>", line 1, in <module>
    txt.size
AttributeError: 'str' object has no attribute 'size'
txt.len
Traceback (most recent call last):
  File "<pyshell#67>", line 1, in <module>
    txt.len
AttributeError: 'str' object has no attribute 'len'
txt.lenght
Traceback (most recent call last):
  File "<pyshell#68>", line 1, in <module>
    txt.lenght
AttributeError: 'str' object has no attribute 'lenght'
txt.strip(" ")
'hola mundo'
txt = " dffd dfef "
txt.strip(" ")
'dffd dfef'
txt = "Hola mundo"
len(txt)
10
print("tamaño del string ",len(txt))
tamaño del string  10
txt = lower(txt)
Traceback (most recent call last):
  File "<pyshell#75>", line 1, in <module>
    txt = lower(txt)
NameError: name 'lower' is not defined
txt = txt.lover()
Traceback (most recent call last):
  File "<pyshell#76>", line 1, in <module>
    txt = txt.lover()
AttributeError: 'str' object has no attribute 'lover'. Did you mean: 'lower'?
txt = txt.lower()
txt
'hola mundo'
txt = txt.upper()
txt
'HOLA MUNDO'
txt.index("H")
0
txt[txt.index(input("ingrese la letra que desea cambiar: "))] = input("ingrese la letra a ingresar")
ingrese la letra a ingresarP
ingrese la letra que desea cambiar: H
Traceback (most recent call last):
  File "<pyshell#82>", line 1, in <module>
    txt[txt.index(input("ingrese la letra que desea cambiar: "))] = input("ingrese la letra a ingresar")
TypeError: 'str' object does not support item assignment
txt[txt.index(str(input("ingrese la letra que desea cambiar: ")))] = input("ingrese la letra a ingresar")
ingrese la letra a ingresarP
ingrese la letra que desea cambiar: H
Traceback (most recent call last):
  File "<pyshell#83>", line 1, in <module>
    txt[txt.index(str(input("ingrese la letra que desea cambiar: ")))] = input("ingrese la letra a ingresar")
TypeError: 'str' object does not support item assignment
txt[int(txt.index(str(input("ingrese la letra que desea cambiar: "))))] = input("ingrese la letra a ingresar: ")
ingrese la letra a ingresar: P
ingrese la letra que desea cambiar: H
Traceback (most recent call last):
  File "<pyshell#84>", line 1, in <module>
    txt[int(txt.index(str(input("ingrese la letra que desea cambiar: "))))] = input("ingrese la letra a ingresar: ")
TypeError: 'str' object does not support item assignment
txt[int(txt.index(input("ingrese la letra que desea cambiar: ")))] = input("ingrese la letra a ingresar: ")
ingrese la letra a ingresar: P
ingrese la letra que desea cambiar: H
Traceback (most recent call last):
  File "<pyshell#85>", line 1, in <module>
    txt[int(txt.index(input("ingrese la letra que desea cambiar: ")))] = input("ingrese la letra a ingresar: ")
TypeError: 'str' object does not support item assignment
txt
'HOLA MUNDO'
L = txt.index(input("ingrese la letra que desea cambiar: "))
ingrese la letra que desea cambiar: H
txt[L] = input("ingrese la letra a ingresar: ")
ingrese la letra a ingresar: P
Traceback (most recent call last):
  File "<pyshell#88>", line 1, in <module>
    txt[L] = input("ingrese la letra a ingresar: ")
TypeError: 'str' object does not support item assignment
txt[L] = input("ingrese la letra a ingresar: ")
ingrese la letra a ingresar: P
Traceback (most recent call last):
  File "<pyshell#89>", line 1, in <module>
    txt[L] = input("ingrese la letra a ingresar: ")
TypeError: 'str' object does not support item assignment
txt[L] = str(input("ingrese la letra a ingresar: "))
ingrese la letra a ingresar: P
Traceback (most recent call last):
  File "<pyshell#90>", line 1, in <module>
    txt[L] = str(input("ingrese la letra a ingresar: "))
TypeError: 'str' object does not support item assignment
L
0
txt[0] = "P"
Traceback (most recent call last):
  File "<pyshell#92>", line 1, in <module>
    txt[0] = "P"
TypeError: 'str' object does not support item assignment
txt[0] = 'P'
Traceback (most recent call last):
  File "<pyshell#93>", line 1, in <module>
    txt[0] = 'P'
TypeError: 'str' object does not support item assignment
txt.add(e)
Traceback (most recent call last):
  File "<pyshell#94>", line 1, in <module>
    txt.add(e)
AttributeError: 'str' object has no attribute 'add'
>>> txt.add("e")
Traceback (most recent call last):
  File "<pyshell#95>", line 1, in <module>
    txt.add("e")
AttributeError: 'str' object has no attribute 'add'
>>> txt[0] = "P"
Traceback (most recent call last):
  File "<pyshell#96>", line 1, in <module>
    txt[0] = "P"
TypeError: 'str' object does not support item assignment
>>> txt
'HOLA MUNDO'
>>> txt = list(txt)
>>> txt[0]="P"
>>> txt
['P', 'O', 'L', 'A', ' ', 'M', 'U', 'N', 'D', 'O']
>>> ' '.join(txt)
'P O L A   M U N D O'
>>> txt = str(txt)
>>> txt
"['P', 'O', 'L', 'A', ' ', 'M', 'U', 'N', 'D', 'O']"
>>> txt = "hola mundo"
>>> ' '.join(txt)
'h o l a   m u n d o'
>>> '-1'.join(txt)
'h-1o-1l-1a-1 -1m-1u-1n-1d-1o'
>>> txt = list(txt)
>>> txt
['h', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o']
>>> nuevo = "".join(lista)
Traceback (most recent call last):
  File "<pyshell#109>", line 1, in <module>
    nuevo = "".join(lista)
NameError: name 'lista' is not defined. Did you mean: 'list'?
>>> nuevo = ''.join(lista)
Traceback (most recent call last):
  File "<pyshell#110>", line 1, in <module>
    nuevo = ''.join(lista)
NameError: name 'lista' is not defined. Did you mean: 'list'?
>>> nuevo = ''.join(txt)
>>> nuevo
'hola mundo'
