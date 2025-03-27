//Diseñar un programa que informe por pantalla si el número ingresado por el usuario es múltiplo de 7 o no.
Algoritmo P4_Ej5
	Definir nro Como Entero
	//pido al usuario que ingrese un número
	Escribir "Ingrese un número"
	Leer nro
	Mientras nro<7 Hacer
		Escribir "Ingrese un número mayor o igual a 7 "
		Leer nro
	Fin Mientras
	//determino si el nro es múltiplo de 7
	Si nro mod 7 = 0 entonces
		//informo que si es múltiplo de 7
		Escribir "el número ", nro, " SI es múltiplo de 7"
	SiNo
		//informo que no es múltiplo de 7
		Escribir "el número ", nro, " NO es múltiplo de 7"
	FinSi
FinAlgoritmo
//ejecutar el programa y verificar si da solución al problema.