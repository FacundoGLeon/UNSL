#include <stdio.h>
#include <stdlib.h>
#include <strings.h>
#define max 8200
typedef struct
{
    int dia;
    int mes;
    int anio;
} fech;
typedef struct
{
    char localidad[21];
    char codigo[11];
    float precip_prom;
    fech fecha;
    char estacion;
} precipitacion;
void carga_n_precipitaciones(precipitacion registro[],int *cant)
{
    int i,n;
    do
    {
        printf("cuantas precipitaciones desea cargar?\n");
        scanf("%d",&n);
    }
    while(n<0 || (n+*cant)>=max+1);
    for(i=*cant; i<*cant+n; i++)
    {
        printf("ingrese localidad\n");
        fflush(stdin);
        scanf("%[^\n]",registro[i].localidad);
        fflush(stdin);
        printf("codigo\n");
        scanf("%s",registro[i].codigo);
        do
        {
            printf("cantidad de lluvia promedio en mm\n");
            scanf("%f",&registro[i].precip_prom);
        }
        while(registro[i].precip_prom<0);
        do
        {
            printf("dia\n");
            scanf("%d",&registro[i].fecha.dia);
        }
        while(registro[i].fecha.dia<=0 || registro[i].fecha.dia>31);
        do
        {
            printf("mes\n");
            scanf("%d",&registro[i].fecha.mes);
        }
        while(registro[i].fecha.mes<=0 || registro[i].fecha.mes>12);
        do
        {
            printf("anio\n");
            scanf("%d",&registro[i].fecha.anio);
        }
        while(registro[i].fecha.anio<=1900 || registro[i].fecha.anio>2022);
        printf("estacion del año\n");
        fflush(stdin);
        scanf("%c",&registro[i].estacion);
        system("cls");

    }
    *cant+=n;

}

float precip_prom(precipitacion registro[],fech fechaprom,int cant)
{
    int i=0,cantidadT=0;
    float precipT=0;
    for(i; i<cant; i++)
    {
        if(registro[i].fecha.dia==fechaprom.dia && registro[i].fecha.mes==fechaprom.mes && registro[i].fecha.anio==fechaprom.anio)
        {
            precipT+=registro[i].precip_prom;
            cantidadT++;
        }
    }
    if(cantidadT==0)
    {
        return 0;
    }
    else
    {
        return precipT/cantidadT;
    }


}

int modifica(precipitacion registro[],char codigo[],int cant)
{
    int i=0;
    for(i; i<cant; i++)
    {
        if(0==strcmp(registro[i].codigo,codigo))
        {
            printf("modifique las precipitaciones\n");
            scanf("%f",&registro[i].precip_prom);
            return 1;
        }
    }
    return 0;
}

int main()
{
    precipitacion *registro;
    if((registro=(precipitacion*)malloc(sizeof(precipitacion)*max))==NULL)
    {
        exit(1);
    }
    int opcion=1;
    int cantidadtotal=00;
    fech fechaprom;
    char codigo[11];

    while(opcion>=1 && opcion<=3)
    {
        do
        {
            system("cls");
            printf("<1> cargar precipitaciones\n"
                   "<2> ver promedio de precipitaciones\n"
                   "<3> modificar precipitacion\n"
                   "<4> exit\n");
            scanf("%d",&opcion);
        }
        while(opcion<1 || opcion>4);
        switch(opcion)
        {
        case 1:
            carga_n_precipitaciones(registro,&cantidadtotal);
            break;
        case 2:
            printf("ingrese fecha a promediar\n");
            do
            {
                printf("dia\n");
                scanf("%d",&fechaprom.dia);
            }
            while(fechaprom.dia<=0 || fechaprom.dia>31);
            do
            {
                printf("mes\n");
                scanf("%d",&fechaprom.mes);
            }
            while(fechaprom.mes<=0 || fechaprom.mes>12);
            do
            {
                printf("anio\n");
                scanf("%d",&fechaprom.anio);
            }
            while(fechaprom.anio<=1900 || fechaprom.anio>2022);
            printf("el promedio total de precipitaciones en la fecha ingresada es de %f\n",precip_prom(registro,fechaprom,cantidadtotal));
            fflush(stdin);
            getchar();
            break;
        case 3:
            printf("ingrese codigo a buscar\n");
            scanf("%s",codigo);
            if(1==modifica(registro,codigo,cantidadtotal))
            {
                printf("se modifico\n");
            }
            else
            {
                printf("no se encontro el codigo\n");
            }
            fflush(stdin);
            getchar();break;
        case 4:
            break;
        }

    }
    return 0;
}
