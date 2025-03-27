Algoritmo Bingo_Escolar
	definir divisionA,divisionB,N,cant,col,ls Como Entero
	dimension divisionA(10),divisionB(10)
	ls<-10
	cant<-0
	ingreso(divisionA,divisionB,ls)
	N<-Meta(divisionA,divisionB,ls)
	escribir "que color de carton quiere conocer total de ventas?"
	escribir "1=amarillo o 2=azul"
	leer col
	Mientras col<>1 y col<>2 Hacer
		escribir "1=amarillo o 2=azul"
		leer col
	Fin Mientras
	VentaCarton(divisionA,divisionB,col,ls,cant)
	escribir N " curso/s lograron cumplir la meta"
	Si col=1 Entonces
		escribir "se vendieron: " cant " cartones amarillos"
	SiNo
		escribir "se vendieron: " cant " cartones azules"
	Fin Si
FinAlgoritmo
SubAlgoritmo ingreso(DA,DB,ls)
	definir I,A Como Entero
	A<-1
	Para I<-1 Hasta ls Con Paso 2 Hacer
		escribir "cuantos cartones amarillos vendio ",A "° A"
		leer DA(I)
		Mientras DA(I)<0 Hacer
			escribir "cuantos cartones amarillos vendio ",A "° A"
			leer DA(I)
		Fin Mientras
		escribir "cuantos cartones azules vendio ",A "° A"
		leer DA(I+1)
		Mientras DA(I+1)<0 Hacer
			escribir "cuantos cartones azules vendio ",A "° A"
			leer DA(I+1)
		Fin Mientras
		escribir "cuantos cartones amarillos vendio ",A "° B"
		leer DB(I)
		Mientras DB(I)<0 Hacer
			escribir "cuantos cartones amarillos vendio ",A "° B"
			leer DB(I)
		Fin Mientras
		escribir "cuantos cartones azules vendio ",A "° B"
		leer DB(I+1)
		Mientras DB(I+1)<0 Hacer
			escribir "cuantos cartones azules vendio ",A "° B"
			leer DB(I+1)
		Fin Mientras
		A<-A+1
	Fin Para
FinSubAlgoritmo
SubAlgoritmo cont<-Meta(D1,D2,ls)
	definir cont,I Como Entero
	cont<-0
	Para I<-1 Hasta ls Con Paso 2 Hacer
		Si 100<=D1(I)+D1(I+1) Entonces
			cont<-cont+1
		Fin Si
		Si 100<=D2(I)+D2(I+1) Entonces
			cont<-cont+1
		Fin Si
	Fin Para
FinSubAlgoritmo
SubAlgoritmo VentaCarton(CA,CB,col,ls,cant Por Referencia)
	definir I Como Entero
	Si col=1 Entonces
		Para I<-1 Hasta ls Con Paso 2 Hacer
			cant<-cant+CA(I)+CB(I)
		Fin Para
	SiNo
		Para I<-2 Hasta ls Con Paso 2 Hacer
			cant<-cant+CA(I)+CB(I)
		Fin Para
	Fin Si
FinSubAlgoritmo
