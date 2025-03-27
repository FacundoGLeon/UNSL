#include <stdio.h>
#include <stdlib.h>
#define max 10
int buscar(int [],int,int);
int main()
{
    int i=0,n;
    int arr[max];
    printf("ingrese enteros\n");
    for(i;i<max;i++){
        scanf("%d",&arr[i]);
    }
    printf("que elemento desea buscar\n");
    scanf("%d",&n);
    n=buscar(arr,i-1,n);
    printf("%d\n",n);
    return 0;
}

int buscar(int arr[],int i,int n){
    if(i>=0){
        if(arr[i]==n)
            return i;
        else
            return buscar(arr,i-1,n);
}
    else
        return -1;
}
