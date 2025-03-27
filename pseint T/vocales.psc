Algoritmo sin_titulo
	definir car como caracter 
	definir cantV COMO ENTERO 
	definir I como entero
	cantV<-0
	Para I<-1 Hasta 10 Con Paso 1 Hacer
		escribir "ingresar caracter"
		leer car
		Si (car = "a" o car = "e" o car = "o")  Entonces
			cantV<-cantV+1
		Fin Si
	Fin Para
	escribir "la cantidad de vocales abiertas minusculas fue: " cantV
FinAlgoritmo
