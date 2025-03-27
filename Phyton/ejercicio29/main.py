# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

def convertir(d):
    l = list()
    for c,v in d.items():
        if isinstance(v,dict):
            l.append((c,convertir(v)))
        else:
            l.append((c,v))
    return l

d = {2:"si", 3:{5:"estas",6:"diciendo",7:"la"}, 4:"verdad"}
resultado = convertir(d)
print(resultado)


