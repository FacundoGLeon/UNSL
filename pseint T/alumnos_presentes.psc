Algoritmo alumnos_presentes
	definir cant como caracter
	definir alum como caracter
	definir acum como entero 
	cant<-"Fin"
	acum<-0
	escribir "ingresar " "Fin" " al finalizar"
	escribir "alumnos presentes: "
	Mientras alum<> cant Hacer
		leer alum
		Si alum<>cant Entonces
			escribir alum
			acum<-acum+1
		Fin Si
	Fin Mientras
	escribir "Alumnos Presentes: " acum
FinAlgoritmo
