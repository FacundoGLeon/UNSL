Algoritmo control_mayuscula
	definir let como caracter 
	definir I como entero
	Dimension let(10)
	Para I<-1 Hasta 10 Con Paso 1 Hacer
		leer let(I)
		Mientras (let(I)>="A" y let(I)<= "Z")=FALSO Hacer
			escribir "ingrese nuevamente"
			leer let(I)
		Fin Mientras
	Fin Para
FinAlgoritmo
