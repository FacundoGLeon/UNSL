#include <stdio.h>
#include <stdlib.h>

int main()
{
    float pesos,dolar;
    char enter;
    dolar=150.00;
    printf("ingrese Pesos\n");
    scanf("%f",&pesos);
    dolar=pesos/dolar;
    printf("PESOS: $%.2f\n" "DOLAR: $%.2f\n",pesos,dolar);
    fflush(stdin);
    scanf("%c",&enter);
    return 0;
}
