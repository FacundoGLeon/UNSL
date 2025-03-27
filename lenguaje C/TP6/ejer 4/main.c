#include <stdio.h>
#include <stdlib.h>
#define max 10
int compara(char [],char [],int *);
int main()
{
    char S1[max];
    char S2[max];
    int N;
    printf("ingrese primer string\n");
    scanf("%s",S1);
    printf("ingrese segundo string\n");
    scanf("%s",S2);
    N=compara(S1,S2,&N);
    printf("%d",N);
    return 0;
}

int compara(char S1[],char S2[],int *N){
    *N=strcmp(S1,S2);
    if(*N==0)
        return 1;
    else
        return 0;


}
