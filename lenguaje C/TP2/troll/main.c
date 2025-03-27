#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Hello world!\n");
    char opcion;
    printf("Queres ser mi media naranja?\n");
    scanf("%c",&opcion);
    if(opcion=='n')
        printf("usted dijo que si, FELICIDADES MI AMOR\n");
    else
        printf("ya no hay vuelta atras acabaste de vender tu alma\n");

    return 0;
}
