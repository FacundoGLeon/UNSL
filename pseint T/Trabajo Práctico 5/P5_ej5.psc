Algoritmo Practico_5_act5
	definir notas Como Real
	dimension notas(7)
	definir I Como Entero
	definir prom como real
	prom<-0
	Para I<-1 Hasta 7 Con Paso 1 Hacer
		LEER notas(I)
	Fin Para
	Para I<-1 Hasta 7 Con Paso 1 Hacer
		Si notas(I)>=7 Entonces
			prom<-prom+1
		Fin Si
	Fin Para
	prom<-prom*100/7
	escribir prom
FinAlgoritmo
