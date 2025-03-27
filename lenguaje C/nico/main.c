#include <stdio.h>
#include <stdlib.h>
#define max 100
#include "pila.h"


void carga(pila *);
void mostrar(pila);

int main()
{
   pila p;
   int opc=1;
   int num;
   init(&p);
   while(opc>=1 && opc<=5){
        do{
            system("cls");
            printf("Bienvenido\n"
                   "|1|Cargar en pila\n"
                   "|2|Borrar ultimo elemento\n"
                   "|3|Ver ultimo elemento\n"
                   "|4|Verificar si esta vacia la fila\n"
                   "|5|Verificar si esta llena la fila\n"
                   "|6|Salir\n");
            fflush(stdin);
            scanf("%d",&opc);
        }
        while(opc<1 || opc>6);
    switch(opc){
    case 1: if(1==isFull(p)){
                printf("no hay suficiente espacio\n");
                fflush(stdin);
                getchar();
            }
            else{
                carga(&p);
                }break;

    case 2:
        if(1==isEmpty(p)){
            printf("no hay datos cargados\n");
        }
        else{
           supress (&p);
           printf ("Borrado\n"
                   "presione Enter\n");}
           fflush(stdin);
           getchar();
           break;

    case 3:
        if(1==isEmpty(p)){
            printf("no hay datos cargados\n");
        }
        else{
            printf ("El ultimo elemento es: %d\n",copyy(p));}
        fflush (stdin);
        getchar();
        break;


    case 4: if(1==isEmpty(p))
                printf("lista vacia\n");
            else
                printf("lista no vacia\n");
            fflush (stdin);
            getchar();
            break;

    case 5: if(1==isFull(p))
                printf("lista llena\n");
            else{
                printf("lista no llena\n");
                }
            fflush (stdin);
            getchar();
            break;

    case 6:printf("Salio correctamente\n");
    }
   }
}
void carga(pila *p){
int n,i=0,num;
printf("Cuantos elementos quiere cargar\n");
fflush(stdin);
scanf("%d",&n);
while(n<0){
    printf("ingrese correctamente\n");
    scanf("%d",&n);
}
for(i;i<n;i++){
    printf("que numero desea agregar\n");
    fflush(stdin);
    scanf("%d",&num);
    push(p,num);
}
}

