# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.
impar=[]
condicion = True
while condicion:
    numero = int(input("Ingrese un número impar (o un número par para finalizar): "))
    if numero%2!=0:
        impar.append(numero)
    else:
        condicion = False

print("Numeros Impares Ingresados:")
for i in impar:
    print(i)

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
