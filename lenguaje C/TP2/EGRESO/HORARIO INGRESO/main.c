#include <stdio.h>
#include <stdlib.h>
void HORA_INGRESO(int);
void HORA_EGRESO(int);
int main()
{
    int CODIGO, opcion;
    char ls='S';
    while(ls=='S'){
        do{
            printf("Ingrese Codigo Personal: ");
            scanf("%d",&CODIGO);}
        while(CODIGO<1000 || CODIGO>9999);
        do{
            printf("INGRESAR=1 / EGRESAR=2\n");
            scanf("%d",&opcion);}
        while(opcion!=1 && opcion!=2);
        if(opcion==1)
            HORA_INGRESO(CODIGO);
        else{
            HORA_EGRESO(CODIGO);}
        printf("quiere seguir ingresando?\n");
        do{
            printf("SI=S   /   NO=N\n");
            fflush(stdin);
            scanf("%c",&ls);}
        while(ls!='S' && ls!='N');
    }
    return 0;
}

void HORA_INGRESO(int CODIGO){
    int hora, minuto;
    printf("Ingrese Hora: \n");
    scanf("%d",&hora);
    while(hora<0 || hora>23){
        printf("ingrese correctamente\n");
        scanf("%d",&hora);}
    printf("Ingrese Minutos: \n");
    scanf("%d",&minuto);
    while(minuto<0 || minuto>59){
        printf("ingrese correctamente\n");
        scanf("%d",&minuto);}
    printf("INGRESO: %d:%d\n",hora,minuto);
    printf("CODIGO: %d\n", CODIGO);
}

void HORA_EGRESO(int CODIGO){
     int hora, minuto;
    printf("Ingrese Hora: \n");
    scanf("%d",&hora);
    while(hora<0 || hora>23){
        printf("ingrese correctamente\n");
        scanf("%d",&hora);}
    printf("Ingrese Minutos: \n");
    scanf("%d",&minuto);
    while(minuto<0 || minuto>59){
        printf("ingrese correctamente\n");
        scanf("%d",&minuto);}
    printf("EGRESO: %d:%d\n",hora,minuto);
    printf("CODIGO: %d\n", CODIGO);
}
