# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

def validacion(correo):
    dominioPermitido=["gmail","hotmail","email","outlook"]
    extencionPermitido=["com","org","net","ar"]
    partes = correo.split("@")
    if(len(partes)!=2):
        return False

    usuario,resto = partes
    if len(usuario.split(" "))>=2:
        return False
    DomExt = resto.split(".")
    if(len(DomExt)!=2):
        return False
    dominio, extencion = DomExt

    if dominio not in dominioPermitido or extencion not in extencionPermitido:
        return False
    return True

condicion = True
while condicion:
    correo = str(input("Ingrese Un Correo:  " ))
    if validacion(correo):
        print("Direccion Valida.")
        condicion = False
    else:
        print("Direccion Invalida.")






# See PyCharm help at https://www.jetbrains.com/help/pycharm/
