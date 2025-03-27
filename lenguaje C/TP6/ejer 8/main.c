#include <stdio.h>
#include <stdlib.h>
#include <strings.h>
#define MAX 100
typedef struct
{
    char calle[30];
    int numero;
} direc;
typedef struct
{
    int dia;
    int mes;
    int anio;
} fecha;

typedef struct
{
    char nombre[30];
    char apellido[30];
    long int DNI;
    direc direccion;
    fecha fecha_nac;
    char est_civil[15];
    int cant_hijos;
    char sexo[11];
} empleado;

void ingreso(empleado [],int);
void mostrar(empleado [], char [], int,int,int );
void ordenar(empleado [],int);
void mostrar_nomb(empleado [],int,int);
void ordenacion(empleado [],int,int,int,empleado);

int main()
{
    empleado aux;
    int opcion=1;
    int i=0,j=0,cont=0,menor=0;
    char apellido[30];
    empleado empleados[MAX];
    while(opcion==1 || opcion==2)
    {
        system("cls");
        printf("Elija una opcion:\n"
               "<1>Ingresar dato de empleado\n"
               "<2>Mostrar datos de un empleado\n"
               "<3>Exit\n");
        scanf("%d",&opcion);
        fflush(stdin);
        system("cls");
        while(opcion!=1 && opcion!=2 && opcion!=3)
        {
            system("cls");
            printf("Elija una opcion:\n"
                   "<1>Ingresar dato de empleado\n"
                   "<2>Mostrar datos de un empleado\n"
                   "<3>Exit\n");
            scanf("%d",&opcion);
            fflush(stdin);
        }
        system("cls");
        switch(opcion)
        {
        case 1:
            ingreso(empleados,i);
            i++;
            break;
        case 2:
            printf("ingrese el apellido a buscar\n");
            scanf("%s",apellido);
            mostrar(empleados, apellido,i,j,cont);
            printf("presione enter\n");
            fflush(stdin);
            getchar();
            break;
        case 3:
            break;
        }
    }
    printf("nombre de empleados ordenados de la A a la Z\n");
    ordenacion(empleados,i,j=menor,menor,aux);
    mostrar_nomb(empleados,j,i);
    return 0;
}

void ingreso(empleado empleados[],int i)
{
    char s;
    printf("Ingrese su nombre:\n");
    fflush(stdin);
    scanf("%s",empleados[i].nombre);
    /*printf("Ingrese su apellido:\n");
    fflush(stdin);
    scanf("%s",empleados[i].apellido);
    printf("Ingrese su documento:\n");
    printf("Sin puntos, signos ni espacios\n");
    scanf("%d",&empleados[i].DNI);
    while(empleados[i].DNI<999999 || empleados[i].DNI>99999999){
        printf("Sin puntos, signos ni espacios\n");
        scanf("%d",&empleados[i].DNI);
    }
    printf("Ingrese domicilio:\n");
    printf("Calle:\n");
    fflush(stdin);
    scanf("%[^\n]",empleados[i].direccion.calle);
    printf("Numero:\n");
    scanf("%d",&empleados[i].direccion.numero);
    while(empleados[i].direccion.numero<=0){
        printf("ingrese correctamente:\n");
        scanf("%d",&empleados[i].direccion.numero);
    }
    printf("Indique su fecha de nacimiento:\n");
        printf("dia:\n");
        scanf("%d",&empleados[i].fecha_nac.dia);
        while(empleados[i].fecha_nac.dia<=0 || empleados[i].fecha_nac.dia>31){
            printf("Ingrese correctamente:\n");
            scanf("%d",&empleados[i].fecha_nac.dia);}

        printf("mes:\n");
        scanf("%d",&empleados[i].fecha_nac.mes);
        while(empleados[i].fecha_nac.mes<=0 || empleados[i].fecha_nac.mes>12){
            printf("Ingrese correctamente:\n");
            scanf("%d",&empleados[i].fecha_nac.mes);}

        printf("año:\n");
        scanf("%d",&empleados[i].fecha_nac.anio);
        while(empleados[i].fecha_nac.anio<=1900 || empleados[i].fecha_nac.anio>2023){
            printf("Ingrese correctamente:\n");
            scanf("%d",&empleados[i].fecha_nac.anio);}
    printf("Estado civil:\n");
    fflush(stdin);
    scanf("%s",empleados[i].est_civil);
    printf("Cuantos hijos tiene a cargo?\n");
    scanf("%d",&empleados[i].cant_hijos);
    while(empleados[i].cant_hijos<0){
        printf("Cuantos hijos tiene a cargo?\n");
        scanf("%d",&empleados[i].cant_hijos);
    }
    printf("Indique su sexo:\n");
    printf("F='Femenino' ; M='Masculino'\n");
    fflush(stdin);
    scanf("%c",&s);
    while(s!='F' && s!='M'){
        printf("F='Femenino' ; M='Masculino'\n");
        fflush(stdin);
        scanf("%c",&s);
    }
    if(s=='F')
        strcpy(empleados[i].sexo,"Femenino");
    else{
        strcpy(empleados[i].sexo,"Masculino");
    }*/
}

void mostrar(empleado empleados[], char apellido[],int i,int j,int cont)
{
    if(j==i)
    {
        if(cont==0)
        {
            printf("el empleado solicitado no esta registrado\n");
        }
    }
    else
    {
        if(0==strcmp(apellido,empleados[j].apellido))
        {
            printf("NOMBRE: %s\n",empleados[j].nombre);
            printf("APELLIDO: %s\n",empleados[j].apellido);
            printf("DOCUMENTO: %d\n",empleados[j].DNI);
            printf("DIRECCION\n""CALLE: %s\n""NUMERO: %d\n",empleados[j].direccion.calle,empleados[j].direccion.numero);
            printf("FECHA DE NACIMIENTO: %d/%d/%d \n",empleados[j].fecha_nac.dia,empleados[j].fecha_nac.mes,empleados[j].fecha_nac.anio);
            printf("ESTADO CIVIL: %s\n",empleados[j].est_civil);
            printf("CANTIDAD DE HIJOS A CARGO: %d\n",empleados[j].cant_hijos);
            printf("SEXO: %s\n",empleados[j].sexo);
            printf("\n");
            cont++;
            mostrar(empleados,apellido,i,j+1,cont);
        }
        else
        {
            mostrar(empleados,apellido,i,j+1,cont);
        }
    }



}

/*cant es la i*/
/*void ordenar(empleado empleados[],int cant)
{
    int j,menor=0;
    empleado aux;
    for(menor; menor<cant-1; menor++)
    {
        for(j=menor+1; j<cant; j++)
        {
            if(strcmp(empleados[j].nombre,empleados[menor].nombre)<0)
            {
                aux=empleados[menor];
                empleados[menor]=empleados[j];
                empleados[j]=aux;
            }

        }
    }
    for(j=0; j<cant; j++)
    {
        printf("Nombre: %s\n",empleados[j].nombre);

    }

}*/

void mostrar_nomb(empleado empleados[],int j,int cant)
{
    if(j==cant-1){
        printf("nombre: %s\n",empleados[j].nombre);}
    else
    {
        printf("nombre: %s\n",empleados[j].nombre);
        mostrar_nomb(empleados,j+1,cant);
    }

}

void ordenacion(empleado empleados[],int cant,int j,int menor,empleado aux){
    if(menor!=cant-1){
        if(j==cant){
            j=menor+1;
            ordenacion(empleados,cant,j,menor+1,aux);}
        else{
            if(j!=cant){
                if(strcmp(empleados[j].nombre,empleados[menor].nombre)<0){
                    aux=empleados[menor];
                    empleados[menor]=empleados[j];
                    empleados[j]=aux;
                    ordenacion(empleados,cant,j+1,menor,aux);}
                else{
                    ordenacion(empleados,cant,j+1,menor,aux);}
            }
        }
    }

}
