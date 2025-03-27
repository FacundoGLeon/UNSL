Algoritmo P6_ej4
	definir Nros,I,J,NroP,ls como entero 
	dimension Nros(15),NroP(15)
	ls<-15
	J<-1
	Ingreso(Nros,ls)
	NrosMultiplos(Nros,NroP,ls,J)
	ImprimirMultiplos(NroP,J)
FinAlgoritmo
subalgoritmo 	Ingreso(Nros,ls)
	definir I Como Entero
	Para I<-1 Hasta ls Con Paso 1 Hacer
		escribir " ingresar numero"
		leer Nros(I)
	Fin Para
FinSubAlgoritmo
subalgoritmo NrosMultiplos(Nros,NroP,ls,J por referencia)
	definir I Como Entero
	Para I<-1 Hasta ls Con Paso 1 Hacer
		Si EsMultiplo(Nros(I)) Entonces
			NroP(J)<-Nros(I)
			J<-J+1
		Fin Si
	Fin Para
FinSubAlgoritmo
subalgoritmo aux<-EsMultiplo(Nros)
	definir aux como logico
	Si Nros%5=0 y Nros%2=0 Entonces
		aux<-verdadero
	SiNo
		aux<-falso
	Fin Si
FinSubAlgoritmo
subalgoritmo ImprimirMultiplos(NroP,J)
	definir I como entero 
	Para I<-1 Hasta J-1 Con Paso 1 Hacer
		escribir "El numero " NroP(I) " es multiplo de 5 y de 2"
	Fin Para
FinSubAlgoritmo
	