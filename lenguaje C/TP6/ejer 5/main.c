#include <stdio.h>
#include <stdlib.h>
#define max 10
float suma(float [],int,float);
float suma2(float[],int);

int main()
{
    float Arr[max],total=0;
    int i=0;
    printf("ingrese reales\n");
    for(i;i<max;i++){
        scanf("%f",&Arr[i]);
    }
    i=0;
    printf("%.2f\n",suma(Arr,i,total));
    printf("%.2f\n",suma2(Arr,i));
    return 0;
}


float suma(float arr[],int i,float total){
    if(i==max)
        return 0;
    else{
        return total=total+arr[i]+suma(arr,i+1,total);
    }

}

float suma2(float arr[],int i){
    if(i==max)
        return 0;
    else
        return arr[i]+suma2(arr,i+1);

}
