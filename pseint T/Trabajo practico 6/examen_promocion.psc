Algoritmo examen_promocion
	definir A como entero 
	dimension A(10)
	definir B como entero 
	dimension B(20)
	definir C Como Entero
	dimension C(40) 
	definir LS,P como entero
	definir V1,V2 como entero
	V1<-0
	V2<-20
	ingreso(A,1,10,1,V1,V2)
	escribir "ingresar entero"
	leer P
	V1<-V1+20
	V2<-V2+10
	ingreso(B,1,20,P,V2,V3)
	escribir "ingresar entero"
	leer LS
	V1<-V1+40
	V2<-V2+30
	ingreso(C,1,LS,2,V4,V5)
FinAlgoritmo

SubAlgoritmo ingreso(Arr,Inf,Sup,Pas,C1,C2)
	definir I como entero
	Pas<-validacion(Pas,0,10)
	Sup<-validacion(Sup,0,20)
	Para I<-Inf Hasta Sup Con Paso Pas Hacer
		leer Arr(I)
		Arr(I)<-validacion(Arr(I),C1,C2)
	Fin Para
	
FinSubAlgoritmo
SubAlgoritmo Val<-validacion(L,con1,con2)
	Mientras L<=con1 O L>con2 Hacer
		ESCRIBIR "INGRESE NUEVAMENTE "
		leer L
	Fin Mientras
	Val<-L
FinSubAlgoritmo
