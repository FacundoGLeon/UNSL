#include <stdio.h>
#include <stdlib.h>
#include "TDApersona.h"
#define max 100
void ingresogeneral(persona [],int *);
void buscaDNI(persona [],int);
void muestrageneral(persona);
int main()
{
    persona per[max];
    int opcion=1,cant=0;
    while(opcion==1 || opcion==2){
        do{
            system("cls");
            printf("<1> ingresar persona\n"
                   "<2> buscar persona\n"
                   "<3> exit\n");
            scanf("%d",&opcion);}
        while(opcion<1 || opcion>3);
        system("cls");
    switch(opcion){
    case 1: ingresogeneral(per,&cant);break;
    case 2: buscaDNI(per,cant);
    fflush(stdin);
    getchar();break;
    case 3: break;}
    }
    return 0;
}

void ingresogeneral(persona per[],int *cant){
    int n,i;
    char tdo[30];
    long dni;
    do{
    printf("cuantas personas desea ingresar?\n");
    scanf("%d",&n);}
    while(n<0 || (n+*cant)>max);
    system("cls");
    for(i=(*cant);i<(*cant+n);i++){
        system("cls");
        printf("ingrese su nombre:\n");
        fflush(stdin);
        scanf("%s",tdo);
        C_nombre(&per[i],tdo);
        printf("ingrese su apellido:\n");
        fflush(stdin);
        scanf("%s",tdo);
        C_apellido(&per[i],tdo);
        printf("ingrese su DNI:\n");
        scanf("%d",&dni);
        C_DNI(&per[i],dni);
        printf("correo: ........@gmail.com\n");
        fflush(stdin);
        scanf("%s",tdo);
        C_correo(&per[i],tdo);
        fflush(stdin);
    }
    (*cant)+=n;
}

void buscaDNI(persona per[],int cant){
    int i=0,enc=-1;
    long dni;
    int op;
    printf("ingrese DNI a buscar\n");
    scanf("%d",&dni);
    for(i;i<cant;i++){
        op=busca_dni(per[i],dni);
        if(1==op){
            enc=1;
            muestrageneral(per[i]);
        }}
    if(enc==-1){
        printf("el DNI ingresado no esta registrado\n");
    }
}

void muestrageneral(persona p){
        printf("NOMBRE: %s\n",Mostrarnombre(p));
        printf("APELLIDO: %s\n",Mostrarapellido(p));
        printf("DNI: %d\n",Mostrardni(p));
        printf("CORREO: %s\n",Mostrarcorreo(p));

}

