#include <stdio.h>
#include <stdlib.h>

int main()
{

    int n,i=0;
    printf("ingrese la cantidad de enteros a ingresar\n");
    scanf("%d",&n);
    while(n<=0){
        printf("ingrese la cantidad de enteros a ingresar\n");
        scanf("%d",&n);
    }
    int *arrEnt=(int*)malloc(sizeof(int)*n);
    if(arrEnt==NULL){
        exit(1);
    }
    for(i;i<n;i++){
        arrEnt[i]=(i+1);
        printf("%d\n",arrEnt[i]);
    }
    return 0;
}
