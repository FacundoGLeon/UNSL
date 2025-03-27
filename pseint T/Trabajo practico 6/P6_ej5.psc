Algoritmo P6_ej5
	definir secuencia,car como caracter 
	definir N,cant Como Entero
	dimension secuencia(10)
	Ingreso(secuencia,cant)
	escribir "ingresar caracter a analizar"
	leer car 
	N<-CONTARX(car,secuencia,cant)
FinAlgoritmo
SubAlgoritmo Ingreso(secuencia,cant por referencia)
	definir I como entero 
	escribir "cuantos caracteres va a ingresar?"
	leer cant
	Mientras cant<=0 o cant>10 Hacer
		escribir "cuantos caracteres va a ingresar?(1-10)"
		leer cant
	Fin Mientras
	Para I<-1 Hasta cant Con Paso 1 Hacer
		escribir "ingresar caracter ", I
		leer secuencia(I)
	Fin Para
FinSubAlgoritmo
SubAlgoritmo cont<-CONTARX(car,secuencia,cant)
	definir cont,I como entero
	cont<-0
	Para I<-1 Hasta cant Con Paso 1 Hacer
		Si ES_IGUAL(car,secuencia(I)) Entonces
			cont<-cont+1
		Fin Si
	Fin Para
	escribir "el caracter: " car ", se repitio " cont " veces"
FinSubAlgoritmo
SubAlgoritmo aux<-ES_IGUAL(car,secuencia)
	definir aux Como Logico
	Si car=secuencia Entonces
		aux<-VERDADERO
	SiNo
		aux<-FALSO
	Fin Si
FinSubAlgoritmo
