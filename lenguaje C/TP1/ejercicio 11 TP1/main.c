#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Hello world!\n");
    int i;
    printf("\n"
"****************************************\n"
"*            BIENVENIDO                 *\n"
"****************************************\n"
"<1> Cargar notas (permite cargar la nota 5 alumnos)\n"
"<2> Mostar Notas\n"
"<3> Calcular Promedio\n"
"<4> Calcular el Menor\n"
"<5> Salir\n"
"****************************************\n");
    printf("seleccionar Opcion\n");
    scanf("%d",&i);
    printf("\n");
    switch(i){
    case 1:printf("Cargar notas\n");break;
    case 2:printf("Mostar Notas\n");break;
    case 3:printf("Calcular Promedio");break;
    case 4:printf("Calcular el Menor");break;
    case 5:printf("Salir\n");break;
    }
    char enter;
    fflush(stdin);
    scanf("%c",&enter);
    return 0;
}
