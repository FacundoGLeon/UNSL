#include <stdio.h>
#include <stdlib.h>
int suma(int,int);
int suma2(int);

int main()
{
    int n,acum=0;
    printf("ingrese numero entero a sumar\n");
    scanf("%d",&n);
    printf("%d\n",suma(n,acum));
    printf("%d\n",suma2(n));
    return 0;
}

int suma(int n,int acum){
    if(n==0)
        return acum;
    else{
        return suma(n-1,acum+n);

    }

}

int suma2(int n){
    if(n==0)
        return n;
    else{
        return n+suma2(n-1);
    }}
