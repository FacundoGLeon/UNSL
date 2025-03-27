Algoritmo P6_ej3
	definir comision1,comision2 Como Real
	dimension comision1(10),comision2(10)
	definir I,ls como entero 
	ls<-10
	escribir "con que comision desea trabajar la carga de notas"
	leer I
	Mientras I<>1 y I<>2 Hacer
		escribir "comision 1 o 2 ?"
		leer I
	Fin Mientras
	Si I=1 entonces 
		ingreso(comision1,ls,I)
		I<-I+1
		ingreso(comision2,ls,I)
	SiNo
		ingreso(comision2,ls,I)
		I<-I-1
		ingreso(comision1,ls,I)
	FinSi
	escribir "De cual comision desea ver las notas"
	leer I
	si I=1 entonces 
		MostrarNotas(comision1,ls,I)
	SiNo
		MostrarNotas(comision2,ls,I)
	FinSi
FinAlgoritmo
subalgoritmo ingreso(comision,ls,I)
	definir j Como Entero
	escribir "COMISION: " I 
	Para j<-1 Hasta ls Con Paso 1 Hacer
		escribir "ingresar nota del alumno " j
		leer comision(j)
		Mientras comision(j)<0 o comision(j)>10 Hacer
			escribir "ingresar nota del alumno " j " (del 0 al 10)"
			leer comision(j)
		Fin Mientras
	Fin Para
	
FinSubAlgoritmo
subalgoritmo MostrarNotas(comision,ls,I)
	definir j como entero 
	escribir "Notas de comision: " I
	Para j<-1 Hasta ls Con Paso 1 Hacer
		escribir  j ": " comision(j)
	Fin Para
	Para j<-1 Hasta ls Con Paso 1 Hacer
		Si comision(j)>=comision(1) y comision(j)>=comision(2) y  comision(j)>=comision(3) y comision(j)>=comision(4) y  comision(j)>=comision(5) y comision(j)>=comision(6) y comision(j)>=comision(7) y comision(j)>=comision(8) y comision(j)>=comision(9) y comision(j)>=comision(10) Entonces
			escribir "Nota mas alta: " comision(j)
		Fin Si
	FinPara
FinSubAlgoritmo
	