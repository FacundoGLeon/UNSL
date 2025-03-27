#include <stdio.h>
#include <stdlib.h>
#include "TDApilaper.h"
void ingresargeneral(pila *);
void mostrargeneral(pila);
int main()
{
    pila per;
    init(&per);
    int opcion=1;
    while(opcion==1 || opcion== 2 || opcion==3){
        do{
            system("cls");
            printf("<1> ingresar persona\n"
                   "<2> eliminar ultima persona\n"
                   "<3> mostar ultimo ingresado\n"
                   "<4> exit\n");
            scanf("%d",&opcion);}
        while(opcion<1 || opcion>4);
        switch(opcion){
        case 1: if(1==isFull(per)){
                    printf("No hay espacio para almacenar\n");
                    fflush(stdin);
                    getchar();break;}
                ingresargeneral(&per);break;
        case 2: if(1==isEmpty(per)){
                    printf("no hay nada que borrar\n");
                    fflush(stdin);
                    getchar();break;}
                else{
                suprimir(&per);break;}
        case 3: if(1==isEmpty(per)){
                    printf("no hay elementos cargados\n");
                    fflush(stdin);
                    getchar();break;}
                else{
                    mostrargeneral(per);break;}
        case 4: break;}
    }
    return 0;
}

void ingresargeneral(pila *per){
int n,i;
persona p;
    do{
    printf("cuantas personas desea ingresar?\n");
    scanf("%d",&n);}
    while(n<0 || (n+(*per).tope)>=max);
    system("cls");
    for(i=0;i<n;i++){
        system("cls");
        printf("ingrese su nombre:\n");
        fflush(stdin);
        scanf("%s",p.nombre);
        printf("ingrese su apellido:\n");
        fflush(stdin);
        scanf("%s",p.apellido);
        printf("ingrese su DNI:\n");
        scanf("%d",&p.DNI);
        printf("correo: ........@gmail.com\n");
        fflush(stdin);
        scanf("%s",p.correo);
        strcat(p.correo,"@gmail.com");
        fflush(stdin);
        ingresar(per,p);
    }

}


void mostrargeneral(pila per){
    system("cls");
    persona p=copyy(per);
    printf("NOMBRE: %s\n",p.nombre);
    printf("APELLIDO: %s\n",p.apellido);
    printf("DNI: %d\n",p.DNI);
    printf("CORREO: %s\n",p.correo);
    fflush(stdin);
    getchar();
}

