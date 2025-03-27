#include <stdio.h>
#include <stdlib.h>
#define N 100

void ingresar(int [],int *);
void ordenar_menor(int [],int);
void mostrar(int [],int);

int main()
{
    int cant=0;
    int enteros[N];
    ingresar(enteros,&cant);
    printf("Lista de enteros:\n");
    mostar(enteros,cant);
    ordenar_menor(enteros,cant);
    printf("Lista de enteros ordenados:\n");
    mostar(enteros,cant);
    return 0;
}

void ingresar(int entero[],int *cant){
    printf("cuantos enteros va a ingresar\n");
    fflush(stdin);
    scanf("%d",cant);
    while(*cant<=0 || *cant>N){
        printf("mayor a 0 y menor o igual que %d\n",N);
        fflush(stdin);
        scanf("%d",cant);
    }
    for(int i=0;i<*cant;i++){
        printf("ingresar entero Nro. %d\n",i+1);
        fflush(stdin);
        int c=scanf("%d",&entero[i]);
        while(c==0){
            printf("ingresar entero Nro. %d\n",i+1);
            fflush(stdin);
            c=scanf("%d",&entero[i]);
              }
    }}

void ordenar_menor(int entero[], int cant){
   int i,j,aux;
   for(i=0;i<cant-1;i++){
        for(j=i+1;j<cant;j++){
            if(entero[j]<entero[i]){
                aux=entero[i];
                entero[i]=entero[j];
                entero[j]=aux;}
    }

    }
}

void mostar(int entero[],int cant){

    for(int i=0;i<cant;i++){
        printf("%d_",entero[i]);
}
    printf("\n");
}
