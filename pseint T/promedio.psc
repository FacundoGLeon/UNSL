Algoritmo sin_titulo
	definir notas como entero 
	definir suma como real 
	definir prom como real 
	definir n como real 
	definir acum Como Entero
	acum<-1
	suma<-0
	escribir "cuantas notas desea promediar?"
	leer notas 
	Mientras notas<0 Hacer
		escribir "ingresar un valor correcto"
		leer notas 
	Fin Mientras
	Mientras acum <= notas Hacer
		escribir "ingrese la nota numero: " acum
		leer n
		Mientras n<0 O n>10 Hacer
			escribir "ingresar un valor correcto " 
			leer n
		Fin Mientras
		suma<-suma + n
		acum<-acum + 1
	Fin Mientras
	prom<-suma / notas
	escribir " PROMEDIO: " prom
FinAlgoritmo
