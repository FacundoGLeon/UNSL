Algoritmo  Disyuncion_exclusiva
	DEFINIR P, Q, R como logico
	definir val como caracter
	Escribir "ingresar el valor de P"
	escribir "V = verdadero - F = falso"
	Leer val
	Mientras val<> "V" Y val <> "F" Hacer
		escribir "ingrese nuevamente"
		leer val 
	Fin Mientras
	Si val="V" Entonces
		P<-Verdadero
	SiNo
		P<-Falso
	Fin Si
	Escribir "ingresar el valor de Q"
	Leer val
	Mientras val<> "V" Y val <> "F" Hacer
		escribir "ingrese nuevamente"
		leer val 
	Fin Mientras
	Si val="V" Entonces
		Q<-Verdadero
	SiNo
		Q<-Falso
	Fin Si
	R<-(P Y NO Q) O (Q Y NO P)
	escribir  R
FinAlgoritmo
