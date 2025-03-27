#include <stdio.h>
#include <stdlib.h>

void muestraN(long );

int main()
{
long num;
printf ("ingrese numero\n");
scanf ("%d",&num);
system("cls");

muestraN(num);

return 0;
}
void muestraN(long n){

if (n==0)
    printf("%d\n",n);
else {
    printf("%d\n",n);
    muestraN(n-1);
}


}
