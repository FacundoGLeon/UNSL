#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("FACUNDO LEON!\n");
    float numero1,numero2;
    numero1=7.3;
    float *fptr = &numero1;
    printf("%.1f\n",*fptr);
    numero2=*fptr;
    printf("%.1f\n",numero2);
    printf("%p\n",numero1);
    printf("%p\n",*fptr);
    char y;
    fflush(stdin);
    scanf("%c",&y);


    return 0;
}
