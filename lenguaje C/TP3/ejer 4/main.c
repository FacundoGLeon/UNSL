#include <stdio.h>
#include <stdlib.h>
void ingresar(char [],int);
void mostar(char [],int);
void insertar(char [],int);
int main()
{
    int capac=10;
    char caracter[capac];
    ingresar(caracter,capac);
    mostar(caracter,capac);
    insertar(caracter,capac);
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

void insertar(char caracter[], int capac){
    char carcater_a_insertar;
    int indice_a_insertar;
    printf("que carcater desea insertar?\n");
    fflush(stdin);
    scanf("%c",&carcater_a_insertar);
    printf("en que posicion desea insertarlo?\n");
    do{
        printf("Entre 1 y %d\n",capac);
        scanf("%d",&indice_a_insertar);}
    while(indice_a_insertar<1 || indice_a_insertar>capac);
    for(capac;capac>indice_a_insertar-1;capac--){
        caracter[capac]=caracter[capac-1];
    }
    caracter[indice_a_insertar-1]=carcater_a_insertar;
}
