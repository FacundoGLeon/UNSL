#include <stdio.h>
#include <stdlib.h>
#include  <string.h>
#define N 100
int main()
{
    char string1[N],string2[N],copia_str[N];
    int cant1,cant2;
    printf("ingrese primer secuencia:\n");
    fflush(stdin);
    scanf("%[^\n]",string1);
    printf("ingrese segunda secuencia:\n");
    fflush(stdin);
    scanf("%[^\n]",string2);
    cant1=strlen(string1);
    cant2=strlen(string2);
    if(cant2>cant1){
        printf("la primer secuencia es menor que la segunda\n");
        strcpy(copia_str,string2);}
    else{
        printf("la segunda secuencia es menor que la primera\n");
        strcpy(copia_str,string1);}
    printf("la primer secuencia tiene %d caracteres\n",cant1);
    printf("la segunda secuencia tiene %d caracteres\n",cant2);


    return 0;
}
