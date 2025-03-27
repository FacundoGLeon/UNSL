Algoritmo P5_ej11
	definir DatEduc,I,cont,prom como entero 
	dimension DatEduc(100)
	prom<-0
	cont<-0
	Para I<-1 Hasta 100 Con Paso 2 Hacer
		escribir "ingresar edad de cada persona"
		leer DatEduc(I)
		Mientras DatEduc(I)<0 Hacer
			escribir "ingresar edad correcta"
			leer DatEduc(I)
		Fin Mientras
	Fin Para
	Para I<-2 Hasta 100 Con Paso 2 Hacer
		escribir "ingresar nivel educativo"
		leer DatEduc(I)
		Mientras DatEduc(I)<1 o DatEduc(I)>4 Hacer
			escribir "1=primaria 2=secundaria 3=terciaro 4=universitario"
			leer DatEduc(I)
		Fin Mientras
	Fin Para
	Para I<-1 Hasta 100 Con Paso 2 Hacer
		Si DatEduc(I)>25 y DatEduc(I+1)=3 Entonces
			cont<-cont+1
		Fin Si
	Fin Para
	escribir "Personas mayores a 25 que han alzcanzado nivel terciario:"
	escribir cont
	cont<-0
	Para I<-2 Hasta 100 Con Paso 2 Hacer
		Si DatEduc(I)=4 Entonces
			prom<-prom+DatEduc(I-1)
			cont<-cont+1
		Fin Si
	Fin Para
	prom<-prom/cont
	escribir "Edad promedio de personas que han alcanzado nivel universitario:"
	escribir prom
FinAlgoritmo
