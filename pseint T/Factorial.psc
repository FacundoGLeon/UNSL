Algoritmo Factorial
	definir  n como entero 
	definiR I como entero
	definir acum Como Entero
	definir cont como entero
	I<-1
	acum<-1
	cont<-1
	escribir " ingresar numero a factorear"
	leer n
	Mientras cont<=n Hacer
		I<-I*acum
		acum<-acum+1
		cont<-cont+1
	Fin Mientras
	escribir I
FinAlgoritmo
