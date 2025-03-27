#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Hello world!\n");
    char enter;
    int edad;
    do {
        printf("ingrese su edad\n");
        scanf("%d",&edad);}
    while(edad<=0);
    if(edad>=16){
        if(edad<18||edad>70)
            printf("Puede votar opcionalmente\n");
        else
            printf("Debe votar obligatoriamente\n");
    }
    else{
        printf("Es menor de edad, no puede votar\n");}
    fflush(stdin);
    scanf("%c",&enter);

    return 0;
}
