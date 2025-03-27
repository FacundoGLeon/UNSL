Algoritmo Detectar_Mayusculas
	definir ingresa Como CARACTER
	dimension ingresa(10)
	definir cont Como Entero
	definir VECES como entero
	cont<-0
	Para VECES<-1 Hasta 10 Con Paso 1 Hacer
		LEER ingresa(VECES)
	Fin Para
	VECES<-1
	Mientras VECES<=10 Hacer
		Si ingresa(VECES)>= "A" Y ingresa(VECES)<= "Z" Entonces
			cont<-cont+1
		Fin Si
		VECES<-VECES + 1
	Fin Mientras
	ESCRIBIR "ingreso " cont " Mayusculas"
FinAlgoritmo
