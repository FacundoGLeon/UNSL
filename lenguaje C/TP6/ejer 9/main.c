#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define Max 100
typedef struct {
char marca[20];
char color[15];
char control_remoto[3];
}proyec;
typedef struct {
int num_ident;
int ubicacion;
char tipo[20];
}tipo;
typedef struct {
tipo tipo_aula;
int mesas;
int sillas;
int pizarras;
proyec proyector;
}Aula;
void ingreso(Aula [], int );
void ImpNro(Aula [], int);

int main(){
    int j=0,i=0;
    char opcion;
    Aula aula[Max];
    printf("Desea ingresar los datos del aula?\n""S=Si ; N=No\n");
    scanf("%c",&opcion);
    while(opcion!='S' && opcion!='N'){
        printf("S=Si : N=No\n");
        fflush(stdin);
        scanf("%c",&opcion);
    }
    while(opcion=='S' && i<Max){
        ingreso(aula, i);
        system("cls");
        printf("Desea ingresar datos de otra aula?\n""S=Si ; N=No\n");
        fflush(stdin);
        scanf("%c",&opcion);
    while(opcion!='S' && opcion!='N'){
        printf("S=Si : N=No\n");
        fflush(stdin);
        scanf("%c",&opcion);
    }
    i++;
    system("cls");}
    system("cls");
    printf("aulas con control remoto:\n");
    ImpNro(aula, i-1);
    printf("\n");
    return 0;
}

void ingreso(Aula aula[], int i){
    char c;
    printf("ingrese numero de identificacion del aula:\n");
    scanf("%d",&aula[i].tipo_aula.num_ident);
    while(aula[i].tipo_aula.num_ident<=0){
        printf("ingrese correctamente:\n");
        scanf("%d",&aula[i].tipo_aula.num_ident);
    }
    printf("ingrese el bloque en el que pertenece el aula:\n");
    scanf("%d",&aula[i].tipo_aula.ubicacion);
    while(aula[i].tipo_aula.ubicacion<=0 || aula[i].tipo_aula.ubicacion>=6 ){
        printf("ingrese correctamente:\n");
        scanf("%d",&aula[i].tipo_aula.ubicacion);
    }
    printf("indique el tipo del aula\n");
    printf("L=Laboratorio; C=Conferencia; T=Teoria-Practica\n");
    fflush(stdin);
    scanf("%c",&c);
    while(c!='L' && c!='C' && c!='T'){
        printf("L=Laboratorio; C=Conferencia; T=Teoria-Practica\n");
        fflush(stdin);
        scanf("%c",&c);}
    if(c=='L')
        strcpy(aula[i].tipo_aula.tipo,"Laboratorio");
    else{
        if(c=='C')
            strcpy(aula[i].tipo_aula.tipo,"Conferencia");
        else
            strcpy(aula[i].tipo_aula.tipo,"Teoria-Practico");
        }

    printf("ingrese cantidad de mesas\n");
    scanf("%d",&aula[i].mesas);
    while(aula[i].mesas<=0){
        printf("ingrese correctamente\n");
        scanf("%d",&aula[i].mesas);
    }
    printf("ingrese cantidad de sillas\n");
    scanf("%d",&aula[i].sillas);
     while(aula[i].sillas<=0){
        printf("ingrese correctamente\n");
        scanf("%d",&aula[i].sillas);
    }
    printf("ingrese cantidad de pizarras\n");
    scanf("%d",&aula[i].pizarras);
     while(aula[i].pizarras<=0){
        printf("ingrese correctamente\n");
        scanf("%d",&aula[i].pizarras);
    }
    printf("ingrese marca del proyecto\n");
    fflush(stdin);
    scanf("%s",aula[i].proyector.marca);
    printf("ingrese color del proyecto\n");
    fflush(stdin);
    scanf("%s",aula[i].proyector.color);
    printf("indique si tiene control remoto\n");
    printf("'Si' o 'No'\n");
    fflush(stdin);
    scanf("%s",aula[i].proyector.control_remoto);
    while( ((!(strcmp(aula[i].proyector.control_remoto,"Si")!=0)) || (strcmp(aula[i].proyector.control_remoto,"No")!=0) )&& ((!(strcmp(aula[i].proyector.control_remoto,"No")!=0)) || (strcmp(aula[i].proyector.control_remoto,"Si")!=0) )){
        printf("'Si' o 'No'\n");
        fflush(stdin);
        scanf("%s",aula[i].proyector.control_remoto);
    }}
void ImpNro(Aula aula[], int i){
    if(i>=0){
        if(0==strcmp(aula[i].proyector.control_remoto,"Si")){
            printf("Nro Ident: %d\n",aula[i].tipo_aula.num_ident);
            ImpNro(aula,i-1);}
        else{
            ImpNro(aula,i-1);}
    }


   }

