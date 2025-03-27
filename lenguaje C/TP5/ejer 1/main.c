#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *entero=(int*)malloc(sizeof(int));
    if (entero==NULL) {
        printf( "La aplicación no pudo reservar memoria y se va a cerrar!\n");
        exit(1);}
    *entero=7;
    printf("valor: %d\n",*entero);
    printf("direccion: %p\n",entero);
    printf("tamaño: %d\n",sizeof(entero));
    char *caracter=(char*)malloc(sizeof(char));
    if (caracter==NULL) {
        printf( "La aplicación no pudo reservar memoria y se va a cerrar!\n");
        exit(1);}
    *caracter='C';
    printf("valor: %c\n",*caracter);
    printf("direccion: %p\n",caracter);
    printf("tamaño: %d\n",sizeof(caracter));
    float *real=(float*)malloc(sizeof(float));
    if (real==NULL) {
        printf( "La aplicación no pudo reservar memoria y se va a cerrar!\n");
        exit(1);}
    *real=2.5;
    printf("valor: %f\n",*real);
    printf("direccion: %p\n",real);
    printf("tamaño: %d\n",sizeof(real));
    free((void*)entero);
    free((void*)caracter);
    free((void*)real);
    return 0;
}
