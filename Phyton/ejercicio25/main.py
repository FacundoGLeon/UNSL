# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

def empaqueta(enteros):
    l = list()
    cant = 1
    num = enteros[0]
    for i in range(1,len(enteros)):
        if num == enteros[i]:
            cant = cant +1
        else:
            l.append((num,cant))
            cant=1
            num=enteros[i]
    l.append((num, cant))
    return l


ent = [1,1,1,3,5,1,1,3,3]
print(empaqueta(ent))

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
