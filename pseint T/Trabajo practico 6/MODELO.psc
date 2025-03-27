SubAlgoritmo  ingreso(secuencia,ls)
	definir I Como Entero
	Para I<-1 Hasta ls Con Paso 1 Hacer
		escribir "ingresar caracter " I
		leer secuencia(I)
	Fin Para
FinSubAlgoritmo
SubAlgoritmo Reemplazo(secuencia,ls)
	definir aux,aux2 Como Caracter
	definir I como entero
	aux2<-"#"
	escribir "que caracter desea reemplazar" 
	leer aux
	Para I<-1 Hasta ls Con Paso 1 Hacer
		Si secuencia(I)=aux Entonces
			secuencia(I)<-aux2
		Fin Si
	Fin Para
FinSubAlgoritmo
SubAlgoritmo cant<-CantReem(secuencia,ls)
	definir cant, I,N Como Entero
	cant<-0
	Para I<-1 Hasta ls Con Paso 1 Hacer
		Si secuencia(I)="#" Entonces
			cant<-cant+1
		Fin Si
	Fin Para
FinSubAlgoritmo
Algoritmo MODELO
	definir secuencia,m como caracter
	definir I,N,ls Como Entero
	dimension secuencia(7)
	ls<-7
	ingreso(secuencia,ls)
	escribir "desea cambiar un caracter?(S/N)"
	leer m
	Mientras m<>"S" Y m<>"N" Hacer
		escribir "S=si o N=no"
		leer m
	Fin Mientras
	Si m="S" Entonces
		Reemplazo(secuencia,ls)
	Fin Si
	N<-CantReem(secuencia,ls)
	Para I<-1 Hasta ls Con Paso 1 Hacer
		escribir secuencia(I)
	Fin Para
	Si N <> 0 Entonces
		escribir"Se realizo " N " reemplazo/s"
	SiNo
		escribir "No se encontro caracter a reemplazar"
	Fin Si
FinAlgoritmo
