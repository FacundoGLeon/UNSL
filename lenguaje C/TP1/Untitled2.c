#include<stdio.h>
main(){
float notas,cant,tnot,prom;
cant=0;
tnot=0;
while(cant<4){
    printf("ingrese notas\n");
    scanf("%f",&notas);
    tnot+=notas;
    cant++;

}
prom=tnot/cant;
printf("el promedio de notas es del: %f",prom);
}
