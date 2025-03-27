#include <stdio.h>
#include <stdlib.h>
#define N 100

void ingresar(int [],int *);
void buscar(int [],int);

int main()
{
    int cant=0;
    int enteros[N];
    ingresar(enteros,&cant);
    buscar(enteros,cant);
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

void buscar(int entero[], int cant){
    int numero;
    printf("que numero desea buscar\n");
    scanf("%d",&numero);
    int i=0,cont=0;
    while(i<cant && cont==0){
        if(numero==entero[i]){
            cont=1;}
        i++;
        }
    if(cont!=0)
        printf("el numero %d si se encuentra en el arreglo\n", numero);
    else
        printf("el numero  %d no se encuentra en el arreglo\n", numero);

    }
