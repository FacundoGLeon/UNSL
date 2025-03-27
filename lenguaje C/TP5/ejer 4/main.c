#include <stdio.h>
#include <stdlib.h>
typedef struct p{
    char nomb[20];
    char ape[20];
    int edad;
}persona;
void ingreso(persona Personas[], int i){
    printf("Ingrese su nombre:\n");
    scanf("%s",Personas[i].nomb);
    printf("Ingrese su apellido:\n");
    scanf("%s",Personas[i].ape);
    printf("Ingrese su edad:\n");
    scanf("%d",&Personas[i].edad);
    while(Personas[i].edad<=0 || Personas[i].edad>100){
        printf("mayor a 0 y menor a 100\n");
        scanf("%d",&Personas[i].edad);
    }
    system("cls");
}
void mostrar(persona Personas[], int n){
    int i=0;
    for(i;i<n;i++){
        printf("NOMBRRE: %s\n",Personas[i].nomb);
        printf("APELLIDO: %s\n",Personas[i].ape);
        printf("EDAD: %d\n",Personas[i].edad);
        printf("\n");
    }
}

int main()
{
    int n,i=0;
    printf("Cuanta veces quiere cargar la estrcutura:\n");
    scanf("%d",&n);
    while(n<=0 || n>10){
        printf("mayor a 0 y menor que 11\n");
        scanf("%d",&n);
    }
    persona *Personas=(persona*)malloc(sizeof(persona)*n);
    if(Personas==NULL){
    exit(1);}
    ingreso(Personas,i);
    i++;
    for(i;i<n;i++){
        ingreso(Personas,i);
    }
    mostrar(Personas,n);
    free((void*)Personas);
    return 0;
}
