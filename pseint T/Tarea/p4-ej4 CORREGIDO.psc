//Dise�ar un algoritmo que permita acumular 10 n�meros reales ingresados por el usuario y 
//luego devuelva el valor absoluto de dicha acumulaci�n.
//versi�n 1
//t1: Definir variables
//t2: Ingresar valores y acumularlos
//t3: calcular el valor absoluto de la acumulaci�n 
//t4: informar el resultado
	
Algoritmo p4_ej4_CORREGIDO
	Definir nro, acumul Como Real
	Definir i Como Entero
	acumul <-0
	Para i <- 1 hasta 10 con paso 1 hacer
		Escribir "ingrese un nro"
		Leer nro
		acumul <- acumul + nro
	FinPara
	acumul<-ABS(acumul)
	Escribir acumul
FinAlgoritmo
//Ejecutar elprograma y verificar que d� soluci�n al problema, en caso de detectar errores, corregir.