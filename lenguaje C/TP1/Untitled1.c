#include<stdio.h>
 main(){
	int num,acum;
	acum=1;
	printf("que numero desea calcular?\n");
	scanf ("%d\n", num);
	while(acum <= num);{
        if(num%acum==0);{
		    printf("%d\n",acum); }
	acum=acum+1;}
}
