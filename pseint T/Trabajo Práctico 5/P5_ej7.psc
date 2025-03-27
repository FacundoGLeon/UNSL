Algoritmo P5_ej7
	definir Nro,I,num como entero 
	dimension Nro(10)
	escribir "ingresar numero entre 5 y 10"
	leer num
	Mientras num<=5 o num>=10 Hacer
		escribir "mayor que 5 y menor que 10"
		leer num
	Fin Mientras
	Para I<-1 Hasta 10 Con Paso 1 Hacer
		Nro(I)<-num^I
	Fin Para
	Para I<-1 Hasta 10 Con Paso 1 Hacer
		escribir  num " a la " I  " = " Nro(I)
	Fin Para
FinAlgoritmo
//> <