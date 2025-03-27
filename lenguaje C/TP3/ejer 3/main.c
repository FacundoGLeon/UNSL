#include <stdio.h>
#include <stdlib.h>
#define N 100

void ingresar(int [],int *);
void identificar_menor(int [],int);

int main()
{
    int cant=0;
    int enteros[N];
    ingresar(enteros,&cant);
    identificar_menor(enteros,cant);
    return 0;
}

void ingresar(int entero[],int *cant){
    printf("cuantos enteros va a ingresar\n");
    scanf("%d",cant);
    while(*cant<=0 || *cant>N){
        printf("mayor a 0 y menor o igual que %d\n",N);
        scanf("%d",cant);
    }
    for(int i=0;i<*cant;i++){
        printf("ingresar entero Nro. %d\n",i+1);
        scanf("%d",&entero[i]);
    }}

void identificar_menor(int entero[], int cant){
   int j,menor;
    menor=0;
    for(j=1;j<cant;j++){
            if(entero[j]<entero[menor])
                menor=j;}
    printf("El menor numero de enteros dentro del arreglo es: %d",entero[menor]);

    }
