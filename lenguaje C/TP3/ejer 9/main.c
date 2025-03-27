#include <stdio.h>
#include <stdlib.h>
#define Not 13
void CargaNota(char []);
void MuestraNotas(char []);
int Aplazos(char []);
int main()
{
    char Notas[Not];
    int cantR=0;
    CargaNota(Notas);
    MuestraNotas(Notas);
    cantR=Aplazos(Notas);
    if(cantR>=7){
        printf("Alta posibilidad de repetir\n");
    }
    return 0;
}

void CargaNota(char Notas[]){
    char Nota;
    int i;
    printf("INGRESO DE NOTAS\n");
    printf("S=(10,9,8),A=(7,6,5,4),R=(3,2,1)\n");
    printf("S=Supero, A=Aprobo, R=Reprobo\n");
    for(i=0;i<Not;i++){
        printf("ingrese la nota de la materia Num. %d\n",i+1);
        fflush(stdin);
        scanf("%c",&Notas[i]);
        while(Notas[i]!='S' && Notas[i]!='A' && Notas[i]!='R'){
            printf("S=(10,9,8),A=(7,6,5,4),R=(3,2,1)\n");
            fflush(stdin);
            scanf("%c",&Notas[i]);
        }
    }
}

void MuestraNotas(char Notas[]){
    int i;
    printf("Materia Num.\tNotas\n");
    for(i=0;i<Not;i++){
        printf("%d \t         %c\n",i+1,Notas[i]);
    }

}

int Aplazos(char Notas[]){
    int cont=0,i;
    for(i=0;i<Not;i++){
        if(Notas[i]=='R'){
            cont++;
        }
    }
return cont;
}
