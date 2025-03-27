#include <stdio.h>
#include <stdlib.h>
typedef  struct {
char a;
int b;
}info;
int main()
{
    info *informacion=(info*)malloc(sizeof(info));
    printf("ingrese caracter\n");
    scanf("%c",&(*informacion).a);
    printf("ingrese entero\n");
    scanf("%d",&(*informacion).b);
    printf("caracter %c\n",(*informacion).a);
    printf("entero %d\n",(*informacion).b);
    free((void*)informacion);
    return 0;
}
