#include <stdio.h>
#include <stdlib.h>
float oferta3x2(float,float,float);
int main()
{
char enter;
float P1,P2,P3;
 printf("El total a pagar es $%.2f",oferta3x2(P1,P2,P3));
 fflush(stdin);
 scanf("%c",&enter);
return 0;
}

float oferta3x2(float precio1,float precio2,float precio3){

float valor;
   do{
   printf("ingresar precio de la primer prenda\n");
   scanf("%f",&precio1);}
   while(precio1<=0);
   do{
   printf("ingresar precio de la segunda prenda\n");
   scanf("%f",&precio2);}
   while(precio2<=0);
   do{
   printf("ingresar precio de la tercera prenda\n");
   scanf("%f",&precio3);}
   while(precio3<=0);
    if(precio1>precio2 && precio1>precio3)
        valor=precio2+precio3;
    else {
        if(precio2>precio1 && precio2>precio3)
            valor=precio1+precio3;
        else
            valor=precio1+precio2;}

    return valor;}
