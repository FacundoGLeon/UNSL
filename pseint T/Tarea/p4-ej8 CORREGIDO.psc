//El profesor de Historia del colegio "San Martín" necesita calcular el promedio de notas de su mejor estudiante. 
//¿Qué solución le plantearía? ¿Deben realizarse controles en el ingreso de datos en este caso? 
//En caso de que su respuesta sea afirmativa, mencionar cuáles serían, en caso contrario justificar su respuesta.
//Escribir el algoritmo que dé solución a lo planteado
//Realizar el diagrama de flujo de su solución
//versión 1
//t1: definir variables e inicializar en caso de ser necesario
//t2: Preguntarle al usuario cuantas notas quiere ingresar, determinando un rango válido
//t3. ingresar las notas, controlando que cada nota sea válida, y acumulandolas
//t4: dividir las notas cumuladas por la cantidad de notas
//t5: mostrar resultado
Algoritmo p4_ej8
	Definir nota, promedio como real
	Definir can, i como entero
	promedio <- 0
	Escribir "Cuántas notas va a ingresar? de 1 a 15"
	Leer can
	//control para una cantidad válida de notas establecida.
	Mientras (can < 1 o can > 15) hacer
		Escribir "Cuántas notas va a ingresar? de 1 a 15"
		Leer can
	FinMientras
	Para i <- 1 hasta can con paso 1 Hacer
		Escribir "Ingrese nota nro", i
		Leer nota
		//implementar el control correspondiente a una nota válida
		Mientras  nota<0 O nota>10 Hacer
			escribir "ingresar un valor correcto " 
			leer nota
		Fin Mientras
		promedio <- promedio + nota
	FinPara
	promedio <- promedio/can
	Escribir promedio
FinAlgoritmo
//Ejecutar elprograma y verificar que dé solución al problema, en caso de detectar errores, corregir.