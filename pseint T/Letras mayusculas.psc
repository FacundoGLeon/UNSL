Algoritmo sin_titulo
	definir car como caracter 
	definir cantV COMO ENTERO 
	definir I como entero
	cantV<-0
	Para I<-1 Hasta 100 Con Paso 1 Hacer
		escribir "ingresar caracter"
		leer car
		Si (car >= "A" Y car <= "Z" )  Entonces
			cantV<-cantV+1
		Fin Si
	Fin Para
	escribir "la cantidad de letras mayusculas son: " cantV
FinAlgoritmo
