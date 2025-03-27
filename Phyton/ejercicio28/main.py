# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

frase = str(input("Ingrese una frase"))
lis = list(frase)
lis.sort()
let = lis[0]
cont = 1
for i in range(1,len(lis)):
    if let == lis[i]:
        cont = cont + 1
        let = lis[i]
    else:
        print(let,":",cont)
        cont = 1
        let = lis[i]
print(let,":",cont)

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
