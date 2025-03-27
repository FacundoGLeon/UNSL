#include <stdio.h>
#include <stdlib.h>
#define MAX 10
void promedio_dolar(float []);
void ingreso_dolares(float []);
int main()
{
    float valor_dolar[MAX];
    ingreso_dolares(valor_dolar);
    promedio_dolar(valor_dolar);
    return 0;
}
void promedio_dolar(float valores_dolar[]){
    float promedioC=0,promedioV=0;
    int i;
    for(i=0;i<MAX;){
        promedioC+=valores_dolar[i];
        promedioV+=valores_dolar[i+1];
        i+=2;
    }
    promedioC/=(MAX/2);
    promedioV/=(MAX/2);
    printf("El valor promedio del dolar es de:\n" "COMPRA=%.2f\n" "VENTA=%.2f\n",promedioC,promedioV);}

void ingreso_dolares(float valores_dolar[]){
    int i=0,j=1;
    for(i;i<MAX;){
    do{
        printf("ingrese el precio del dolar de compra del banco: %d\n",j);
        scanf("%f",&valores_dolar[i]);}
    while(valores_dolar[i]<=0);
     do{
        printf("ingrese el precio del dolar de venta del banco: %d\n",j);
        scanf("%f",&valores_dolar[i+1]);}
    while(valores_dolar[i+1]<=0);
    j++;
    i+=2;
    }}
