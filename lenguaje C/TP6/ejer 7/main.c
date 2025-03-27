#include <stdio.h>
#include <stdlib.h>
#define max 10
int mayor(int [],int,int );

int main()
{
    int i=1,may=0,j=0;
    int arr[max];
    printf("ingrese enteros\n");
    for(j;j<max;j++){
        scanf("%d",&arr[j]);
    }
    printf("%d",mayor(arr,i,may));
    return 0;
}
                    /* i=1   may=0*/
int mayor(int arr[],int i,int may){
    if(i==max)
        return arr[may];
    else{
        if(arr[i]>=arr[may]){
            may=i;
            return mayor(arr,i+1,may);}
        else
            return mayor(arr,i+1,may);

        }

    }


