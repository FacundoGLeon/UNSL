#include <stdio.h>
#include <stdlib.h>
#define MAX 10
typedef struct {
    int dia;
    int mes;
    int anio; } Fecha;
typedef struct {
    char nom[30];
    int TipoDoc;
    int NroDoc;
    int Hijos ;
    Fecha Nacim;} Empleado;
    void ingreso(Empleado [],int);
    void muestra(Empleado [],int);
    void muest_mayor(Empleado [],int);
    int cant_hijos(Empleado [],int);

int main(){
    Empleado *arr=(Empleado*)malloc(sizeof(Empleado)*MAX);
    char enter;
    int cant,n,opcion=1;
    printf("cuantos datos de empleados quieres cargar?\n");
    scanf("%d",&n);
    while(n<=0 || n>10){
        printf("mayor a 0 y menor o igual que 10\n");
        scanf("%d",&n);
    }
    ingreso(arr,n);
    muestra(arr,n);
    printf("\n");
    while(opcion==1 || opcion==2){
    printf("Indique que desea ver:\n");
    printf("<1> Empleados mayores de 40\n");
    printf("<2> Cantidad de empleados sin hijos\n");
    printf("<3> Exit\n");
    scanf("%d",&opcion);
    while(opcion!=1 && opcion!=2 && opcion!=3){
        system("cls");
        printf("<1> Ver empleados mayores de 40\n");
        printf("<2> Cantidad de empleados sin hijos\n");
        printf("<3> Exit\n");
        scanf("%d",&opcion);
    }
    switch(opcion){
    case 1: muest_mayor(arr,n);break;
    case 2: cant=cant_hijos(arr,n);
    printf("Cantidad de empleados sin hijos: %d\n",cant);
    printf("Presione enter\n");
    fflush(stdin);
    scanf("%c",&enter);break;
    case 3:break;

    }
    system("cls");
    }


    free((void*)arr);
    return 0;
}

void ingreso(Empleado arr[], int n){
    int i=0;
    for(i;i<n;i++){
        printf("EMPLEADO: %d\n",i+1);
        printf("Ingrese su nombre:\n");
        fflush(stdin);
        scanf("%s",arr[i].nom);
        printf("Ingrese tipo de documentacion\n");
        printf("(1=DNI, 2=PAS, 3=CF, 4=CIPE)\n");
        scanf("%d",&arr[i].TipoDoc);
        while(arr[i].TipoDoc<1 || arr[i].TipoDoc>4){
            printf("(1=DNI, 2=PAS, 3=CF, 4=CIPE)\n");
            scanf("%d",&arr[i].TipoDoc);
        }
        printf("Ingrese su numero de documento:\n");
        scanf("%d",&arr[i].NroDoc);
        while(arr[i].NroDoc<=999999 || arr[i].NroDoc>99999999){
            printf("Ingrese correctamente:\n");
            scanf("%d",&arr[i].NroDoc);
    }
        printf("Indique cuantos hijos tiene:\n");
        scanf("%d",&arr[i].Hijos);
        while(arr[i].Hijos<0){
            printf("Ingrese correctamente:\n");
            scanf("%d",&arr[i].Hijos);
    }
        printf("Indique su fecha de nacimiento:\n");
        printf("dia:\n");
        scanf("%d",&arr[i].Nacim.dia);
        while(arr[i].Nacim.dia<=0 || arr[i].Nacim.dia>31){
            printf("Ingrese correctamente:\n");
            scanf("%d",&arr[i].Nacim.dia);}

        printf("mes:\n");
        scanf("%d",&arr[i].Nacim.mes);
        while(arr[i].Nacim.mes<=0 || arr[i].Nacim.mes>12){
            printf("Ingrese correctamente:\n");
            scanf("%d",&arr[i].Nacim.mes);}

        printf("año:\n");
        scanf("%d",&arr[i].Nacim.anio);
        while(arr[i].Nacim.anio<=1900 || arr[i].Nacim.anio>2023){
            printf("Ingrese correctamente:\n");
            scanf("%d",&arr[i].Nacim.anio);}
        system("cls");
}
}

void muestra(Empleado arr[], int n){
    int i=0;
    for(i;i<n;i++){
    printf("EMPLEADO: %d\n",i+1);
    printf("NOMBRE: %s\n",arr[i].nom);
    switch(arr[i].TipoDoc){
    case 1: printf("TIPO DOC.: DNI\n");break;
    case 2: printf("TIPO DOC.: PAS\n");break;
    case 3: printf("TIPO DOC.: CF\n");break;
    case 4: printf("TIPO DOC.: CIPE\n");break;
    }
    printf("NUMERO DOC.: %d\n", arr[i].NroDoc);
    printf("CANT. DE HIJOS: %d\n",arr[i].Hijos);
    printf("FECHA DE NACIMIENTO: %d/%d/%d\n",arr[i].Nacim.dia,arr[i].Nacim.mes,arr[i].Nacim.anio);
    printf("\n");
}
}

void muest_mayor(Empleado arr[],int n){
    int i=0;
    int j=1;
    char enter;
    system("cls");
    printf("Empleados mayores de 40:\n");
    for(i;i<n;i++){
    if(arr[i].Nacim.anio<1982){
        printf("%d) %s\n",j,arr[i].nom);
        j++;
    }}
    printf("Presione enter\n");
    fflush(stdin);
    scanf("%c",&enter);
}

int cant_hijos(Empleado arr[],int n){
    int i=0,cant=0;
    for(i;i<n;i++){
        if(arr[i].Hijos==0){
            cant++;}
    }
system("cls");
    return cant;
}

