#include <stdio.h>
#include <stdlib.h>
#include <strings.h>
#include "TDAlistaauto.h"
void ingresargeneral(lista *);
void suprimirgeneral(lista *);
void mostrargeneral(lista);
void movercursor(lista *);
void consultam(lista);

int main()
{
    lista l;
    int opc=1;
    init(&l);
    while(opc>=1 && opc<=5){
        do{
            system("cls");
            printf("<1> ingresar auto en lista\n"
                   "<2> suprimir auto en lista\n"
                   "<3> mostrar auto en lista(en cursor)\n"
                   "<4> mover cursor\n"
                   "<5> consultar tamaño de lista\n"
                   "<6> exit\n");
            scanf("%d",&opc);}
        while(opc<1 || opc>6);
    switch(opc){
    case 1: ingresargeneral(&l);break;
    case 2: if(1==isEmpty(l)){
                printf("LISTA VACIA / NO HAY DATOS CARGADOS\n");}
            else{
                if(1==isoos(l)){
                    printf("CURSOR FUERA DE LUGAR / MUEVA EL CURSOR\n");
                }
                else{
                    suprimirgeneral(&l);
                }
            }
            fflush(stdin);
            getchar();break;
    case 3: mostrargeneral(l);break;
    case 4: if(1==isEmpty(l)){
                printf("LISTA VACIA / NO SE PUEDE MOVER EL CURSOR\n");}
            else{
                if(1==isoos(l)){
                    printf("CURSOR FUERA DE LUGAR\n");
                    printf("MOVEREMOS EL CURSOR AL INICIO\n");
                    reset(&l);
                }
                else{
                    movercursor(&l);

                }
            }break;
    case 5: consultam(l);break;
    case 6: break;}


    }
    free((void*)l.acceso);
    free((void*)l.cur);
    free((void*)l.ant);
    return 0;
}

void ingresargeneral(lista *l){
    if(1==isFull()){
        printf("NO HAY MEMORIA DISPONIBLE / FORMATEA TU PC POBRE DE MIERDA\n");
    }
    else{
        system("cls");
        Auto a;
        printf("Ingrese Nombre Y Apellido del Titular\n");
        fflush(stdin);
        scanf("%[^\n]",a.nombreT);
        printf("Ingrese Marca del Vehiculo\n");
        fflush(stdin);
        scanf("%[^\n]",a.marca);
        do{
            printf("Ingrese Año de Modelo del Vehiculo\n");
            scanf("%d",&a.anio);}
        while(a.anio<1950 || a.anio>2023);
        printf("Ingrese Modelo del Vehiculo\n");
        fflush(stdin);
        scanf("%[^\n]",a.modelotipo);
        printf("Ingrese Patente del Vehiculo\n");
        fflush(stdin);
        scanf("%[^\n]",a.patente);
        do{
            printf("Ingrese Kilometraje del Vehiculo\n");
            scanf("%d",&a.kilometraje);}
        while(a.kilometraje<=0);
        do{
            printf("Ingrese Precio del Vehiculo\n");
            scanf("%f",&a.precio);}
        while(a.precio<100000);
        insertar(l,a);
    }
}

void suprimirgeneral(lista *l){
    suprimir(l);
    printf("Se Suprimio correctamente\n");
}

void mostrargeneral(lista l){
    if(1==isEmpty(l)){
        printf("LISTA VACIA / NO HAY DATOS CARGADOS\n");
    }
    else{
        if(1==isoos(l)){
            printf("CURSOR FUERA DE LUGAR / MUEVA EL CURSOR\n");
        }
        else{
            Auto a=copyy(l);
            printf("NOMBRE TITULAR: %s\n",a.nombreT);
            printf("MARCA: %s\n",a.marca);
            printf("MODELO: %s\n",a.modelotipo);
            printf("AÑO: %d\n",a.anio);
            printf("PATENTE: %s\n",a.patente);
            printf("KILOMETRAJE: %d\n",a.kilometraje);
            printf("PRECIO: $%.1f\n",a.precio);

        }
    }
    fflush(stdin);
    getchar();

}

void movercursor(lista *l){
    int opc=1;
    while(opc==1 || opc==2){
        do{
            system("cls");
            printf("<1> Mover Cursor al Inicio\n"
                   "<2> Mover el Cursor de a Uno\n"
                   "<3> Exit\n");
            scanf("%d",&opc);}
        while(opc<1 || opc>3);
    switch(opc){
    case 1: reset(l); printf("SE MOVIO CORRECTAMENTE\n");fflush(stdin);getchar();break;
    case 2: forwardd(l);printf("SE MOVIO CORRECTAMENTE\n");fflush(stdin);getchar();break;
    case 3: break;}
    }

}

void consultam(lista l){
    system("cls");
    printf("La Lista Tiene Cargada %d Autos\n",l.tamanio);
    fflush(stdin);
    getchar();
}
