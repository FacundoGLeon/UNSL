#include <stdio.h>
#include <stdlib.h>

void deposito (float*); /*prototipo*/
void retiro () ; /*prototipo*/





int main()
{

   int i ;

  float salario = 3000 ;

while (i!=4) {
  printf(" que desea realizar\n"
         "  <1> consultar saldo\n"
         "  <2> depositar saldo\n"
         "  <3> retirar saldo\n"
         "  <4> salir\n");

 scanf ("%d",&i);


 switch(i) {
 case 1 :
     printf ("su saldo es de: %f\n", salario);break;

 case 2 : deposito (&salario);
 printf("%f", salario);
 break;
 printf("%f", salario);

 case 3 : retiro (&salario);
  printf("%f", salario);
 break;
 printf("%f", salario);

 case 4 : printf("hasta luego\n"); break;
 default: printf("no selecciono 1 , 2 ,3 o 4 \n");
 }
  }


}

void deposito (float *x)
 {


float agr;

 printf ("cuanto desea agregar\n");
 scanf ("%f",&agr);

  *x = *x + agr ;


}


void retiro (float *y)
{

 float ret ;


 printf ("cuanto desea retirar\n");
 scanf ("%f",&ret);

  *y = *y - ret;


}

