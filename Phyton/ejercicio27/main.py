# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

def diccionario(lis):
    diccionario = {}

    for tupla in lis:
        c, v = tupla
        if c in diccionario.keys():
            diccionario[c].append(v)
        else:
            diccionario[c] = [v]
    return diccionario



lis = [("facundo",1127765021),("facundo",1153173023),("lautaro",26657491170)]
result = diccionario(lis)
print(result)


# See PyCharm help at https://www.jetbrains.com/help/pycharm/
