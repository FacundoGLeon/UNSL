Algoritmo P5_ej12
	definir capac,I,cont,cont2 como entero 
	dimension capac(100)
	definir dispon Como Logico
	dimension dispon(100)
	definir porcen como real 
	cont<-0
	cont2<-0
	porcen<-0
	Para I<-1 Hasta 100 Con Paso 1 Hacer
		escribir "ingresar capacidad de habitacion: " I
		leer capac(I)
		Mientras capac(I)<>2 y capac(I)<>4 y capac(I)<>6 Hacer
			escribir "ingresar capacidad de habitacion: " I " (2,4 o 6)"
			leer capac(I)
		Fin Mientras
		escribir "indicar disponibilidad de habitacion: " I
		escribir "VERDADERO=SI - FALSO=NO"
		leer dispon(I)
	Fin Para
	escribir "Habitaciones disponibles: "
	Para I<-1 Hasta 100 Con Paso 1 Hacer
		Si dispon(I)=VERDADERO Entonces
			escribir "habitacion: " I "  -  caoacidad: " capac(I)
		Fin Si
		Si dispon(I)=VERDADERO Entonces
			cont<-cont+1
		SiNo
			cont2<-cont2+1
		Fin Si
	Fin Para
	porcen<-cont*100/100
	escribir "habitaciones desocupadas: " porcen "%"
	porcen<-cont2*100/100
	escribir "habitaciones ocupadas: " porcen "%"
FinAlgoritmo
