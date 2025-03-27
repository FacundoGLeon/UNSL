#include <stdio.h>
#include <stdlib.h>

int main()
{
/*ingreso de datos*/
    printf("Hello world!\n");
    int Num_ident, edad;
    char sexo, sector;
    do {
        printf("ingrese numero de identificacion:\n");
        scanf("%d",& Num_ident);}
    while(Num_ident<1000 || Num_ident>9999);
    do{
        printf("ingrese su edad\n");
        scanf("%d",&edad);}
    while(edad<18 || edad>65);
    do{
        printf("indique su sexo\n");
        printf("F: FEMENINO\n");
        printf("M: MASCULINO\n");
        fflush(stdin);
        scanf("%c",&sexo);}
    while(sexo!='F' && sexo!='M');
    do{
        printf("A cual sector pertenece?\n");
        fflush(stdin);
        scanf("%c",&sector);}
    while(sector!='A' && sector!='B' && sector!='C' && sector!='D');
/*salida de datos*/
    printf("Empleado Numero: %d\n",Num_ident);
    if(sexo=='F') {
        printf("Sexo: FEMENINO\n");}
    else{
        printf("Sexo: MASCULINO\n");}
    printf("Edad: %d\n",edad);
    printf("Sector: %c\n",sector);
    fflush(stdin);
    scanf("%c",&sector);
    return 0;
}
/*do{
        printf("indique su sexo\n");
        printf("F: FEMENINO\n");
        printf("M: MASCULINO\n");
        fflush(stdin);
        scanf("%c",&sexo);}
    while(("F"!=sexo) && ("M"!=sexo));*/
