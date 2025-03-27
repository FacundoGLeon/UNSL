//version 1
//t1:ingresar una secuencia de hasta 10 caracteres 
//t2: permitir al usuario reemplazar todas las apariciones de un caracter en particular por otro a su eleccion 
//version 2
//t1,1: definir un arreglo de tipo caracter de dimension 10 
//t1,2: definir una variable para usar como indice 
//t1,3: definir una variable carac de tipo caracter para el caracter a sustituir 
//t1,4: pedirle al usuario que ingrese un caracter 
//

Algoritmo p5_ej6
	definir car como caracter
	dimension car(10)
	definir I como entero
	definir can como entero 
	definir aux, aux2 Como caracter
	escribir "cuantos caracteres va a ingresar?"
	leer can
	Mientras can>10 O can<0 Hacer
		escribir "cuantos caracteres va a ingresar? - (1 -- 10)"
		leer can
	Fin Mientras
	Para I<-1 Hasta can Con Paso 1 Hacer
		escribir "ingrese un caracter"
		leer car(I)
	Fin Para
	escribir "ingrese el caracter a reemplazar"
	leer aux 
	escribir "ingrese el caracter con el que se va a reemplazar"
	leer aux2
	Para I<-1 Hasta can Con Paso 1 Hacer
		Si car(I)=aux Entonces
			car(I)<-aux2
		Fin Si
	Fin Para
	Para I<-1 Hasta can Con Paso 1 Hacer
		escribir car(I)
	Fin Para
	
	
FinAlgoritmo
