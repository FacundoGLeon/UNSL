#include <stdio.h>
#include <stdlib.h>
#include <strings.h>
#include "TDAauto.h"
void cargageneral(Auto *);
void muestrageneral(Auto);
void modificageneral(Auto *);
int main()
{
    Auto autito;
    int opcion=1;
    while(opcion>=1 && opcion<=3){
    do{
        system("cls");
        printf("<1> ingresar auto\n"
               "<2> mostrar auto\n"
               "<3> modificar Pre/nom/kilm\n"
               "<4> exit\n");
        scanf("%d",&opcion);}
    while(opcion<1 || opcion>4);
    switch(opcion){
    case 1: cargageneral(&autito);break;
    case 2: muestrageneral(autito);break;
    case 3: modificageneral(&autito);break;
    case 4: break;}
    }
    return 0;
}

void cargageneral(Auto *autito){
    char NombMarcTipPat[31];
    int anio;
    float KilPrec;

    printf("ingrese nombre de titular\n");
    fflush(stdin);
    scanf("%[^\n]",NombMarcTipPat);
    c_nombre(autito,NombMarcTipPat);
    printf("ingrese marca del auto\n");
    fflush(stdin);
    scanf("%[^\n]",NombMarcTipPat);
    c_marca(autito,NombMarcTipPat);
    do{
        printf("ingrese año del auto\n");
        scanf("%d",&anio);}
    while(anio<1900 || anio>2022);
    c_anio(autito,anio);
    printf("ingrese modelo/tipo de auto\n");
    fflush(stdin);
    scanf("%[^\n]",NombMarcTipPat);
    c_modelo(autito,NombMarcTipPat);
    printf("ingrese patente del auto\n");
    fflush(stdin);
    scanf("%s",NombMarcTipPat);
    c_patente(autito,NombMarcTipPat);
    do{
        printf("ingrese kilometraje\n");
        scanf("%d",&anio);}
    while(anio<=0);
    c_kilomtraje(autito,anio);
    do{
        printf("ingrese el precio de auto\n");
        scanf("%f",&KilPrec);}
    while(KilPrec<=0);
    c_precio(autito,KilPrec);
    system("cls");
}

void muestrageneral(Auto autito){
    system("cls");
    printf("NOMBRE TITULAR: %s\n",M_nombre(autito));
    printf("Marca: %s\n",M_marca(autito));
    printf("Año: %d\n",M_anio(autito));
    printf("Modelo/Tipo: %s\n",M_modelo(autito));
    printf("Patente: %s\n",M_patente(autito));
    printf("Kilometraje: %d kilometros\n",M_kilometraje(autito));
    printf("precio: %.2f pesos\n",M_precio(autito));
    fflush(stdin);
    getchar();
    system("cls");
}

void modificageneral(Auto *autito){
    int opcion=1,anio;
    float KilPrec;
    char Nomb[31];
    while(opcion>=1 && opcion<=3){
        do{
            system("cls");
            printf("Que desea modificar?\n");
            printf("<1> Nombre de Titular\n"
                "<2> Kilometraje\n"
                "<3> Precio\n"
                "<4> Exit\n");
            scanf("%d",&opcion);}
        while(opcion<1 || opcion>4);
        switch(opcion){
        case 1:
            printf("ingrese nombre de titular\n");
            fflush(stdin);
            scanf("%[^\n]",Nomb);
            Mod_Nombre(autito,Nomb);break;
        case 2:
            do{
                printf("ingrese kilometraje\n");
                scanf("%d",&anio);}
            while(anio<=0);
            Mod_kilomtraje(autito,anio);break;
        case 3:
            do{
                printf("ingrese el precio de auto\n");
                scanf("%f",&KilPrec);}
            while(KilPrec<=0);
            Mod_precio(autito,KilPrec);break;
        case 4: break;

        }


    }
    system("cls");
}
