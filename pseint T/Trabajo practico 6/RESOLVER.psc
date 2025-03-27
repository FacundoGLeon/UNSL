SubAlgoritmo ejemplo(var1,var2 por referencia)
	definir aux Como Entero
	aux<-var1
	var1<-var2
	var2<-aux
FinSubAlgoritmo

Algoritmo RESOLVER
	definir m, nro1,nro2 Como Entero
	Para m<-6 Hasta 2 Con Paso -2 Hacer
		escribir "ingrese un nro:"
		LEER nro1
		escribir "ingrese un nro:"
		LEER nro2
		escribir "los numeros ingresados son: ", nro1, " - ", nro2
		ejemplo(nro1,nro2)
		Si nro1 = nro2 Entonces
			escribir "algo anda mal?? " nro1 " - " nro2
		SiNo
			escribir "obtuvo lo que esperaba" nro1 " - " nro2
		Fin Si
	Fin Para
	
	
FinAlgoritmo
