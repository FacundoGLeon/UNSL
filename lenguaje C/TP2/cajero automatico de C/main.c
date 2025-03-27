#include <stdio.h>
#include <stdlib.h>
void consultar_dinero(float);
void retirar_dinero(float*);
void depositar_dinero(float*);
int main()
{
    float dinero=3000;
    int opcion=1;
    printf("Bienvenido al cajero virtual en C\n");
    while(opcion>=1 && opcion<4){
    printf("\n");
    printf("<1> Consular Saldo\n"
           "<2> Retirar Dinero\n"
           "<3> Depositar Dinero\n"
           "<4> Salir\n"
           "-");
    scanf("%d",&opcion);
    while(opcion<1 || opcion>4){
        printf("Ingrese correctamente\n""-");
        scanf("%d",&opcion);}
    switch(opcion){
    case 1: consultar_dinero(dinero);break;
    case 2: retirar_dinero(&dinero);
    system("cls");break;
    case 3: depositar_dinero(&dinero);
    system("cls");break;}}
    system("cls");
    printf("HASTA LUEGO\n");
    return 0;
}

void consultar_dinero(float dinero){
    system("cls");
    printf("SU SALDO ES DE: %.2f\n",dinero);
}

void retirar_dinero(float *dinero){
    float retirar;
    printf("INGRESE DINERO A RETIRAR\n");
    printf("<0> RETROCEDER\n");
    scanf("%f",&retirar);
    while(retirar>*dinero || retirar<0){
        if(retirar<0)
            printf("Monto incorrecto: Ingrese el monto nuevamente\n");
        else{
            printf("Saldo insuficiente: ingrese el monto nuevamente\n");
        }
        scanf("%f",&retirar);
    }
    *dinero-=retirar;
}

void depositar_dinero(float *dinero){
    float depositar;
    printf("INGRESE DINERO A DEPOSITAR\n");
    printf("<0> RETROCEDER\n");
    scanf("%f",&depositar);
    while(depositar<0){
        printf("Ingrese el monto nuevamente\n");
        scanf("%f",&depositar);
    }
    *dinero+=depositar;
}
