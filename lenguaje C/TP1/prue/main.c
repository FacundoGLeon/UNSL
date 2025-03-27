#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Hello world!\n");
    int num, c;
    int acum;
	acum=1;
	printf("que numero desea calcular?\n");
	scanf ("%d",& num);
	printf("%d es divisible por:\n",num);
	while(acum <= num){
        c=num%acum;
        printf("%d\n",c);
	acum++;}

    return 0;
}
