#include <stdio.h>
#include <stdlib.h>

void ingresar(char [],int,int *);
void imprimir(char [],int);

int main()
{
    int cant=0,capac=10;
    char caracter[capac];
    ingresar(caracter,capac,&cant);
    imprimir(caracter,cant);
    return 0;
}

void ingresar(char caracter[],int capac,int *cant){
    printf("cuantos caracteres va a ingresar\n");
    scanf("%d",cant);
    while(*cant<=0 || *cant>capac){
        printf("mayor a 0 y menor o igual que %d\n",capac);
        scanf("%d",cant);
    }
    for(int i=0;i<*cant;i++){
        printf("ingresar caracter Nro. %d\n",i+1);
        fflush(stdin);
        scanf("%c",&caracter[i]);
    }}

void imprimir(char caracter[], int cant){
    printf("posicicon\tcaracter\n");
    for(int i=0;i<cant;i++){
        printf("%d\t        %c\n",i+1,caracter[i]);

    }
}
