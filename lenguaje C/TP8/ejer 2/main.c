#include <stdio.h>
#include <stdlib.h>
#include "TDAfraccion.h"
#define max 20
void cargageneral(Fraccion [],int *);
void sumageneral(Fraccion [],int);
void muestrageneral(Fraccion);
int main()
{
    Fraccion fracc[max];
    int opcion=1,cant=0;
    while(opcion>=1 && opcion<=2){
    do{
        system("cls");
        printf("<1> ingresar fracciones\n"
               "<2> sumar todas las fracciones\n"
               "<3> exit\n");
        scanf("%d",&opcion);}
    while(opcion<1 || opcion>3);
    switch(opcion){
    case 1: cargageneral(fracc,&cant);break;
    case 2: sumageneral(fracc,cant);break;
    case 3: break;}
    }
    return 0;
}

void cargageneral(Fraccion fracc[],int *cant){
    int i,n,NumDen;
    printf("cuantas fracciones desea ingresar?\n");
    scanf("%d",&n);
    while(n<0 || (n+*cant)>max){
        printf("ingrese nuevamente\n");
        scanf("%d",&n);
    }
    system("cls");
    for(i=*cant;i<(*cant+n);i++){
        printf("fraccion: %d\n",i+1);
        printf("ingrese numerador:\n");
        scanf("%d",&NumDen);
        C_Numerador(&fracc[i],NumDen);
        printf("ingrese denominador:\n");
        scanf("%d",&NumDen);
        C_Denominador(&fracc[i],NumDen);
    }
    *cant+=n;

}

void sumageneral(Fraccion fracc[],int cant){
    Fraccion FT;
    int i=2;
    suma(fracc[i-2],fracc[i-1],&FT);
    for(i;i<cant;i++){
        suma(FT,fracc[i],&FT);

    }
    simplificar(&FT);
    muestrageneral(FT);
}

void muestrageneral(Fraccion FT){
    printf("suma total:\n"
           "%d\n",muestranumerador(FT));
    printf("___\n"
           "%d\n",muestradenominador(FT));
    fflush(stdin);
    getchar();

}
