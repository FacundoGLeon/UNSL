Algoritmo P5_ej7_sub
	definir Nro,num como entero
	dimension Nro(10)
	ESCRIBIR "ingresar numero entre 5 y 10"
	leer num 
	Mientras num<=5 o num>=10 Hacer
		ESCRIBIR "mayor que 5 y menor que 10"
		leer num
	Fin Mientras
	Potencia(Nro,num)
	ImprimirR(Nro,num)
FinAlgoritmo
SubAlgoritmo  Potencia(Nro,num)
	definir I como entero
	Para I<-1 Hasta 10 Con Paso 1 Hacer
		Nro(I)<-num^(I-1)
	Fin Para
FinSubAlgoritmo
SubAlgoritmo ImprimirR(Nro,num)
	Para I<-1 Hasta 10 Con Paso 1 Hacer
		escribir num " a la " I-1 " = " Nro(I)
	Fin Para
FinSubAlgoritmo
	