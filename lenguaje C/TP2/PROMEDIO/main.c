#include <stdio.h>
#include <stdlib.h>
void promedio(float,float,float,float);
int main()
{
char enter;
float n1,n2,n3,n4 ;
promedio(n1,n2,n3,n4);
fflush(stdin);
scanf("%c",&enter);
}

void promedio(float nota1 , float nota2 , float nota3 , float nota4 ){
float promedio;
do {
 printf("ingrese nota 1\n");
scanf("%f", &nota1);}
while (nota1<0 || nota1>10);

do {
 printf("ingrese nota 2\n");
scanf("%f", &nota2);}
while (nota2<0 || nota2>10);

do {
 printf("ingrese nota 3\n");
scanf("%f", &nota3);}
while (nota3<0 || nota3>10);

do {
 printf("ingrese nota 4\n");
scanf("%f", &nota4);}
while (nota4<0 || nota4>10);

promedio = (nota1+nota2+nota3+nota4)/4;
if(promedio>=7)
    printf("APROBADO\n");
 else{
    printf("DESAPROBADO\n");
}
}



