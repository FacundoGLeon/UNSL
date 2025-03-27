#include <stdio.h>
#include <stdlib.h>
typedef struct{
    int dia;
    int mes;
    int anio;
}fecha;

typedef struct{
    int GF;
    int GC;
    int Pj;
}AlmG;
typedef struct{
    char Apell[20];
    int goles;
}gdor;

typedef struct{
    char pais[20];
    char director[50];
    char CAP[20];
    char grupo;
    int PuntajeAct;
    gdor goleador;
    int fase;
    AlmG GolesFase[5];
    fecha FechaAct;
    int PJ;
    int PG;
    int PE;
}Equipo;

int main()
{
    FILE *fp;
    Equipo E;
    char pais[20];
    char DT[50];
    char CAP[20];
    char grupo;
    int Puntaje;
    int acc;
    while(1!=scanf("%d",&acc)){
        printf("ingrese nuevamente\n");
        fflush(stdin);
    }
    fp=fopen("PreCarga.txt","r");
    if(fp==NULL){
        printf("no se encontro el archivo\n");}
    else{
    while(fscanf(fp,"%d %[^\n] %[^\n] %[^\n] %c",&Puntaje,pais,DT,CAP,&grupo)!=EOF){

        printf("%s\n",pais);
        printf("%s\n",DT);
        printf("%s\n",CAP);
        printf("%c\n",grupo);
        printf("%d\n",Puntaje);
        }

    }
    fclose(fp);
    fflush(stdin);
    getchar();




    return 0;
}
