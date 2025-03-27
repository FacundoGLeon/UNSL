Algoritmo sin_titulo
	definir num como entero 
	definir acum Como Entero
	acum<-1
	escribir "que numero desea calcular?"
	leer num 
	escribir num " es divisible por:"
	Mientras acum<=num Hacer
		Si num%acum=0 Entonces
			escribir acum
		Fin Si
		acum<-acum+1
	Fin Mientras
	
FinAlgoritmo
