#include <stdio.h>
#include <stdlib.h>
void ingresar(char [],int);
void mostar(char [],int);
void suprimir(char [],int);
int main()
{
    int capac=10;
    char caracter[capac];
    ingresar(caracter,capac);
    mostar(caracter,capac);
    suprimir(caracter,capac);
    mostar(caracter,capac);

    return 0;
}

void ingresar(char caracter[], int capac){
    for(int i=0;i<capac;i++){
        printf("ingrese caracter Num.: %d\n",i+1);
        fflush(stdin);
        scanf("%c",&caracter[i]);}
}

void mostar(char caracter[], int capac){
    printf("lista de caracteres del arreglo:\n");
    for(int i=0;i<capac;i++){
        printf("%c_",caracter[i]);
    }
    printf("\n");
}

void suprimir(char caracter[], int capac){
    int caracter_a_borrar;
    printf("Cual es la posicion del caracter que desea borrar?\n");
    do{
        printf("Entre 1 y %d\n",capac);
        scanf("%d",&caracter_a_borrar);}
    while(caracter_a_borrar<1 || caracter_a_borrar>capac);
    for(caracter_a_borrar-1;caracter_a_borrar>0;caracter_a_borrar--){
        caracter[caracter_a_borrar-1]=caracter[caracter_a_borrar-2];
    }
}
