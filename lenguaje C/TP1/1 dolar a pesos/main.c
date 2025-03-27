#include <stdio.h>
#include <stdlib.h>

int main()
{
    float dolar,Valordolar;
    char enter;
    Valordolar=150.00;
    printf("ingrese Dolares:\n");
    scanf("%f",&dolar);
    Valordolar=dolar*Valordolar;
    printf("DOLAR: $%.2f\n" "PESOS: $%.2f\n",dolar,Valordolar);
    fflush(stdin);
    scanf("%c",&enter);
    return 0;
}
