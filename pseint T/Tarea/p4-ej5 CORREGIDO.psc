//Dise�ar un programa que informe por pantalla si el n�mero ingresado por el usuario es m�ltiplo de 7 o no.
Algoritmo P4_Ej5
	Definir nro Como Entero
	//pido al usuario que ingrese un n�mero
	Escribir "Ingrese un n�mero"
	Leer nro
	Mientras nro<7 Hacer
		Escribir "Ingrese un n�mero mayor o igual a 7 "
		Leer nro
	Fin Mientras
	//determino si el nro es m�ltiplo de 7
	Si nro mod 7 = 0 entonces
		//informo que si es m�ltiplo de 7
		Escribir "el n�mero ", nro, " SI es m�ltiplo de 7"
	SiNo
		//informo que no es m�ltiplo de 7
		Escribir "el n�mero ", nro, " NO es m�ltiplo de 7"
	FinSi
FinAlgoritmo
//ejecutar el programa y verificar si da soluci�n al problema.