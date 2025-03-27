#include <stdio.h>
#include <stdlib.h>
#include <strings.h>
#define max 100
void transacciones();
void mostrar();

int main()
{
    int opc=1;
    FILE *fp;
    int nro;
    char tipo;
    float monto;
    while(opc==1 || opc==2){
        do{
            system("cls");
            printf( "<1> ingresar transaccion\n"
                    "<2> mostrar archivo\n"
                    "<3> exit\n");
            fflush(stdin);
            scanf("%d",&opc);}
        while(opc!=1 && opc!=2 && opc!=3);
    switch(opc){
    case 1: transacciones();break;
    case 2: mostrar(); break;
    case 3: break;}

    }
    return 0;
}

void transacciones(){
    system("cls");
    FILE *fp;
    int nro;
    char tipo;
    float monto;
    do{
        printf("Ingrese Nro de Cuenta:\n");
        fflush(stdin);
        scanf("%d",&nro);}
    while(nro<100);
    do{
        printf("Ingrese Tipo de Transaccion:\n");
        printf("D: deposito // E: extraccion\n");
        fflush(stdin);
        scanf("%c",&tipo);}
    while(tipo!='D' && tipo!='E');
    do{
        printf("Ingrese Monto:\n");
        fflush(stdin);
        scanf("%f",&monto);}
    while(monto<0);
    fp=fopen("transacciones.dat","a");
    if(fp==NULL){
        printf("ERROR\n");
    }
    else{
        fprintf(fp,"%d %c %.2f\n",nro,tipo,monto);
    }
    fclose(fp);
}

void mostrar(){
FILE *fp;
char p;
int d;
float f;
fp=fopen("transacciones.dat","r");
while((fscanf(fp,"%d %c %f" ,&d,&p,&f))!=EOF){
    printf("%d %c %.2f\n",d,p,f);
}
fclose(fp);
fflush(stdin);
getchar();
}
