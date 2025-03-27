#include <stdio.h>
#include <stdlib.h>
#include <strings.h>
typedef struct {
    char nombre[30];
    char apellido[30];
    int antiguedad;
}empleado;

int main(){
    int opc=1;
    int cant=0,cant2=0;
    empleado personal[100];
    empleado otro_personal[100];
    while(opc>=1 && opc<=2){
        do{
            system("cls");
            printf("<1> escribir en el archivo\n"
                   "<2> leer del archivo\n"
                   "<3> exit\n");
            scanf("%d",&opc);}
        while(opc<1 || opc>3);
    switch(opc){
    case 1: escribir(personal,&cant);break;
    case 2: leer(otro_personal,&cant2);break;
    case 3: break;}
    }
    return 0;
}

void escribir(empleado per[],int *cant){
    int n,i=0;
    FILE *fp;
    do{
        printf("cuantos empelados desea cargar?\n");
        scanf("%d",&n);}
    while(*cant+n>100);
    for(i=(*cant);i<(*cant)+n;i++){
        system("cls");
        printf("ingrese su nombre\n");
        fflush(stdin);
        scanf("%s",per[i].nombre);
        printf("ingrese su apellido\n");
        fflush(stdin);
        scanf("%s",per[i].apellido);
        printf("ingrese su antigüedad\n");
        scanf("%d",&per[i].antiguedad);
        if(fp=fopen("empleados.txt","a")==NULL){
             exit(1);
}
        fprintf(fp,"%s ""%s ""%d\n",per[i].nombre,per[i].apellido,per[i].antiguedad);
        fclose(fp);
    }
    *cant+=n;


}

void leer(empleado otro_per[],int *cant2){
    FILE *fp;
    int i=0;
    fp=fopen("nuevo.txt","r+");
    while((fscanf(fp,"%s %s %d",otro_per[*cant2].nombre,otro_per[*cant2].apellido,&otro_per[*cant2].antiguedad))!=EOF){
        printf("%s\n",otro_per[*cant2].nombre);
        printf("%s\n",otro_per[*cant2].apellido);
        printf("%d\n",otro_per[*cant2].antiguedad);
        printf("\n");
        *cant2++;
    }
    fclose(fp);
    fflush(stdin);
    getchar();
}


