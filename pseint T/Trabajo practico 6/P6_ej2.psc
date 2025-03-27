subalgoritmo ingreso(capac,dispon,ls)
	definir I como entero
	definir dis como caracter
	Para I<-1 Hasta ls Con Paso 1 Hacer
		escribir "ingrese capcidad de habitacion: " I
		leer capac(I)
		Mientras capac(I)<>2 y  capac(I)<>4 y capac(I)<>6  Hacer
			escribir "ingrese capcidad (2,4 o 6)"
			leer capac(I)
		Fin Mientras
		escribir "indicar disponibilidad de habitacion: " I
		escribir " S=disponible   -   N=no disponible"
		leer dis
		Mientras dis<>"S" y dis<>"N" Hacer
			escribir " S=disponible   -   N=no disponible"
			leer dis
		Fin Mientras
		Si dis="S" Entonces
			dispon(I)<-VERDADERO
		SiNo
			dispon(I)<-FALSO
		Fin Si
	Fin Para
FinSubAlgoritmo
subalgoritmo aux<-porcentaje(dispon,ls)
	definir aux, cont, I Como Real
	cont<-0
	Para I<-1 Hasta ls Con Paso 1 Hacer
		Si dispon(I)=VERDADERO Entonces
			cont<-cont+1
		Fin Si
	Fin Para
	aux<-cont*100/ls
FinSubAlgoritmo
subalgoritmo disponibilidad(capac, dispon,ls)
	definir I como entero 
	escribir "Habitaciones desocupadas: "
	Para I<-1 Hasta ls Con Paso 1 Hacer
		Si dispon(I)=VERDADERO entonces
			escribir "habitacion: " I " -  capacidad: " capac(I)
		Fin Si
	Fin Para
FinSubAlgoritmo
Algoritmo P6_ej2
	definir capac,ls Como Entero
	definir dispon como logico
	dimension capac(15)
	dimension dispon(15)
	ls<-15
	ingreso(capac,dispon,ls)
	escribir "el " porcentaje(dispon,ls) " porciento de las habitaciones estan desocupadas"
	disponibilidad(capac,dispon,ls)
FinAlgoritmo
