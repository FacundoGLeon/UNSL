#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Hello world!\n");
    int num;
    int acum;
	acum=1;
	printf("que numero desea calcular?\n");
	scanf ("%d",& num);
	printf("%d es divisible por:\n",num);
	while(acum <= num){
        if(num%acum==0){
		    printf("%d\n",acum); }
	acum++;}
	char enter;
    fflush(stdin);
    scanf("%c",&enter);

    return 0;
}
