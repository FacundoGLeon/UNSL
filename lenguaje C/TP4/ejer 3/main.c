#include <stdio.h>
#include <stdlib.h>
#include <string.h>
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
void ingreso(Aula *);
void muestra(Aula);

int main(){
    Aula aula;
    ingreso(&aula);
    muestra(aula);
    return 0;
}

void ingreso(Aula *aula){
    char c;
    printf("ingrese numero de identificacion del aula:\n");
    scanf("%d",&(*aula).tipo_aula.num_ident);
    while((*aula).tipo_aula.num_ident<=0){
        printf("ingrese correctamente:\n");
        scanf("%d",&(*aula).tipo_aula.num_ident);
    }
    printf("ingrese el bloque en el que pertenece el aula:\n");
    scanf("%d",&(*aula).tipo_aula.ubicacion);
    while((*aula).tipo_aula.ubicacion<=0 || (*aula).tipo_aula.ubicacion>=6 ){
        printf("ingrese correctamente:\n");
        scanf("%d",&(*aula).tipo_aula.ubicacion);
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
        strcpy((*aula).tipo_aula.tipo,"Laboratorio");
    else{
        if(c=='C')
            strcpy((*aula).tipo_aula.tipo,"Conferencia");
        else
            strcpy((*aula).tipo_aula.tipo,"Teoria-Practico");
        }

    printf("ingrese cantidad de mesas\n");
    scanf("%d",&(*aula).mesas);
    while((*aula).mesas<=0){
        printf("ingrese correctamente\n");
        scanf("%d",&(*aula).mesas);
    }
    printf("ingrese cantidad de sillas\n");
    scanf("%d",&(*aula).sillas);
     while((*aula).sillas<=0){
        printf("ingrese correctamente\n");
        scanf("%d",&(*aula).sillas);
    }
    printf("ingrese cantidad de pizarras\n");
    scanf("%d",&(*aula).pizarras);
     while((*aula).pizarras<=0){
        printf("ingrese correctamente\n");
        scanf("%d",&(*aula).pizarras);
    }
    printf("ingrese marca del proyecto\n");
    fflush(stdin);
    scanf("%s",(*aula).proyector.marca);
    printf("ingrese color del proyecto\n");
    fflush(stdin);
    scanf("%s",(*aula).proyector.color);
    printf("indique si tiene control remoto\n");
    printf("'Si' o 'No'\n");
    fflush(stdin);
    scanf("%s",(*aula).proyector.control_remoto);
    while( ((!(strcmp((*aula).proyector.control_remoto,"Si")!=0)) || (strcmp((*aula).proyector.control_remoto,"No")!=0) )&& ((!(strcmp((*aula).proyector.control_remoto,"No")!=0)) || (strcmp((*aula).proyector.control_remoto,"Si")!=0) )){
        printf("'Si' o 'No'\n");
        fflush(stdin);
        scanf("%s",(*aula).proyector.control_remoto);
    }

}

void muestra(Aula aula){
    system("cls");
    printf("INFORMACION DEL AULA:\n");
    printf("numero de identificacion del aula:\n""%d\n",aula.tipo_aula.num_ident);
    printf("ubicacion:\n""Bloque %d\n",aula.tipo_aula.ubicacion);
    printf("tipo:\n""%s\n",aula.tipo_aula.tipo);
    printf("cantidad de mesas:\n""%d\n",aula.mesas);
    printf("cantidad de sillas:\n""%d\n",aula.sillas);
    printf("cantidad de pizarras:\n""%d\n",aula.pizarras);
    printf("Marca del proyector:\n""%s\n",aula.proyector.marca);
    printf("color del proyector:\n""%s\n",aula.proyector.color);
    printf("tiene control remoto?\n""%s\n",aula.proyector.control_remoto);}
