#include <stdio.h>
#include <stdlib.h>
void calcular_hora(int,int,int);
int main()
{
    printf("Hello world!\n");
    int hora,minutos,segundos;
    do{
        printf("ingrese hora\n");
        scanf("%d",&hora);}
    while(hora<0||hora>23);
    do{
        printf("ingrese minutos\n");
        scanf("%d",&minutos);}
    while(minutos<0||minutos>60);
      do{
        printf("ingrese segundos\n");
        scanf("%d",&segundos);}
    while(segundos<0||segundos>60);
    calcular_hora(hora,minutos,segundos);
    char enter;
    fflush(stdin);
    scanf("%c",&enter);
    return 0;
}

void calcular_hora(int hora,int minutos,int segundos){
    long int hora_en_segundos;
    printf("HORA:\n");
    printf("%d : %d : %d\n",hora,minutos,segundos);
    hora_en_segundos=(((hora*60)+minutos)*60)+segundos;
    printf("El total de segundos pasados desde las 00:00 son: %d segundos\n",hora_en_segundos);
    }
