#include <stdio.h>
#include <stdlib.h>
void calculo_de_salario(int, float);
int main()
{
    printf("Hello world!\n");
    char enter;
    int hor_trab;
    float pag_x_hor;
    do {
        printf("-A cuanto se paga la hora de trabajo?\n");
        scanf("%f",&pag_x_hor);}
    while(pag_x_hor<=0);
    do {
        printf("-Cuantas fueron las horas trabajadas?\n");
        scanf("%d",&hor_trab);}
    while(hor_trab<=0);
    calculo_de_salario( hor_trab, pag_x_hor);
    fflush(stdin);
    scanf("%c",&enter);
    return 0;
}

void calculo_de_salario(int horas_trabajadas, float pago_por_hora){
    float salario;
    if(horas_trabajadas<=30)
        salario=pago_por_hora*horas_trabajadas;
    else {
        salario=pago_por_hora*30;
        for(int x=30;x<horas_trabajadas;x++){
            salario=salario+(pago_por_hora/2);}
    }
    printf("-El monto de su salario es de $%.2f\n",salario);

}
