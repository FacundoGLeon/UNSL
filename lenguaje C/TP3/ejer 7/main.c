#include <stdio.h>
#include <stdlib.h>
#define N 100
void ingresar(char []);
void mostrar(char []);
int main()
{
    int cant;
    int cadena[N];
    int i;
    do{
        printf("cuantas cadenas de caracteres quiere ingresar?\n");
        scanf("%d",&cant);}
    while(cant<1);
    for(i=1;i<=cant;i++){
        ingresar(cadena);
        mostrar(cadena);}
    return 0;
}

void ingresar(char cadena[]){
    printf("ingrese cadena:\n");
    fflush(stdin);
    scanf("%[^\n]",cadena);

}
void mostrar(char cadena[]){
    printf("%s\n",cadena);
}
