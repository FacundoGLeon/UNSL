Algoritmo P6_ej7
	definir vector, ls,I Como Entero
	dimension vector(30)
	ls<-30
	Para I<-1 Hasta ls Con Paso 1 Hacer
		vector(I)<-Azar(999)
	fin para
	ordenar(vector,ls)
	Para I<-1 Hasta ls Con Paso 1 Hacer
		escribir vector(I)
	Fin Para
FinAlgoritmo
SubAlgoritmo ingreso(arr,ls)
	definir I como entero
	Para I<-1 Hasta ls Con Paso 1 Hacer
		escribir "ingresar numero " I
		leer arr(I)
	Fin Para
FinSubAlgoritmo
SubAlgoritmo ordenar(arr,ls)
	definir I, j, maximo, aux como entero 
	Para I<-1 Hasta ls-1 Con Paso 1 Hacer
		maximo<-I
		Para j<-I+1 Hasta ls Con Paso 1 Hacer
			Si arr(j)>arr(maximo) Entonces
				maximo<-j
			Fin Si
		Fin Para
		aux<-arr(I)
		arr(I)<-arr(maximo)
		arr(maximo)<-aux
	Fin Para
FinSubAlgoritmo
