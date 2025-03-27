#include <stdio.h>
#include <stdlib.h>
#include <strings.h>
#include "TDAejer3.h"
#define max 100
void ingresarp(persona[], int *);
void busca_docum(persona[],int);
void mostrar(persona);
int main()
{
    int cant=0;
    persona per[max];
    ingresarp(per,&cant);
    busca_docum(per,cant);

}
void ingresarp(persona per[], int *cant){
    int n, i;
    char nombre[21];
    char apellido[21];
    int docum;
    char correo[30];
    printf("cuantos quiere ingresar\n");
    scanf("%d",&n);
    for(i=(*cant);i<((*cant)+n);i++){
        printf("ingrese nombre\n");
        fflush(stdin);
        scanf("%s",nombre);
        cnombre(&per[i],nombre);
        printf("ingrese apellido\n");
        fflush(stdin);
        scanf("%s",apellido);
        capellido(&per[i],apellido);
        printf("ingrese DNI\n");
        scanf("%d",&docum);
        cdni(&per[i],docum);
        printf("ingrese correo ......@gmail\n");
        fflush(stdin);
        scanf("%s",correo);
        cmail(&per[i],correo);
        system("cls");
    }
    (*cant)+=n;
}
void busca_docum(persona per[],int cant){
int i=0,a=0;
int d;
printf("ingrese documento a buscar\n");
scanf("%d",&d);
for(i=0;i<cant;i++){
   if(per[i].dni==d){
    mostrar(per[i]);
    a=1;
   }
}
if (a==0)
    printf("no se encontro\n");
}
void mostrar(persona p){
        printf("NOMBRE: %s\n",mostrarnombre(p));
        printf("APELLIDO: %s\n",mostrarapellido(p));
        printf("DNI: %d\n",mostrardni(p));
        printf("CORREO: %s\n",mostrarcorreo(p));


}
