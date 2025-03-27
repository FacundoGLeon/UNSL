Algoritmo P5_ej13
	definir cadena1, cadena2 Como Caracter
	dimension cadena1(10)
	dimension cadena2(10)
	definir I, cant como entero 
	escribir "cuantos caracteres va a ingresar?"
	leer cant
	Mientras cant<=0 o cant>10 Hacer
		escribir "cuantos caracteres va a ingresar?(1 - 10)"
		leer cant
	Fin Mientras
	Para I<-1 Hasta cant Con Paso 1 Hacer
		escribir "ingresar caracter " I
		leer cadena1(I)
	Fin Para
	Para I<-1 Hasta cant Con Paso 1 Hacer
		cadena2(I)<-cadena1(cant+1-I)
	Fin Para
FinAlgoritmo
