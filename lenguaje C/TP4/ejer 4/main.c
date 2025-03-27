#include <stdio.h>
#include <stdlib.h>
typedef struct {
int dia;
int mes;
int anio;
}fecha;
typedef struct {
char Pmer_nombre[20];
char apellido[20];
fecha fecha_nac;
float peso;
float altura;
}persona;
void ingresa_dia(fecha *);
void ingreso(persona *);
int calcular_edad(persona, fecha);
float calcular_IMC(persona);
void registro(persona,float,int);

int main()
{
    int edad;
    float IMC;
    fecha fech_actual;
    persona regis_salud;
    ingresa_dia(&fech_actual);
    ingreso(&regis_salud);
    edad=calcular_edad(regis_salud,fech_actual);
    IMC=calcular_IMC(regis_salud);
    system("cls");
    registro(regis_salud,IMC,edad);

    return 0;
}

void ingreso(persona *regis_salud){
    printf("ingrese su primer nombre:\n");
    fflush(stdin);
    scanf("%s",(*regis_salud).Pmer_nombre);
    printf("ingrese su apellido:\n");
    fflush(stdin);
    scanf("%s",(*regis_salud).apellido);
    printf("ingrese fecha de nacimiento:\n");
    printf("dia:\n");
    scanf("%d",&(*regis_salud).fecha_nac.dia);
    while((*regis_salud).fecha_nac.dia<=0 || (*regis_salud).fecha_nac.dia>31){
        printf("dia : 1-31\n");
        scanf("%d",&(*regis_salud).fecha_nac.dia);
    }
    printf("mes:\n");
    scanf("%d",&(*regis_salud).fecha_nac.mes);
     while((*regis_salud).fecha_nac.mes<=0 || (*regis_salud).fecha_nac.mes>12){
        printf("mes : 1-12\n");
        scanf("%d",&(*regis_salud).fecha_nac.mes);
    }
    printf("año:\n");
    scanf("%d",&(*regis_salud).fecha_nac.anio);
     while((*regis_salud).fecha_nac.anio<=1850 || (*regis_salud).fecha_nac.anio>2022){
        printf("anio : 1850-2022\n");
        scanf("%d",&(*regis_salud).fecha_nac.anio);
    }
    printf("ingrese su peso(Kg):\n");
    scanf("%f",&(*regis_salud).peso);
    while((*regis_salud).peso<=0){
        printf("ingrese el peso correctamente\n");
        scanf("%f",&(*regis_salud).peso);
    }
    printf("ingrese su Altura(mtros.):\n");
    scanf("%f",&(*regis_salud).altura);
    while((*regis_salud).altura<=0){
        printf("ingrese el altura correctamente\n");
        scanf("%f",&(*regis_salud).altura);
    }
}

void ingresa_dia(fecha *fech_actual){
    printf("ingrese fecha de hoy:\n");
    printf("dia:\n");
    scanf("%d",&(*fech_actual).dia);
    while((*fech_actual).dia<=0 || (*fech_actual).dia>31){
        printf("dia : 1-31\n");
        scanf("%d",&(*fech_actual).dia);
    }
    printf("mes:\n");
    scanf("%d",&(*fech_actual).mes);
     while((*fech_actual).mes<=0 || (*fech_actual).mes>12){
        printf("mes : 1-12\n");
        scanf("%d",&(*fech_actual).mes);
    }
    printf("año:\n");
    scanf("%d",&(*fech_actual).anio);
     while((*fech_actual).anio<=1850 || (*fech_actual).anio>2022){
        printf("anio : 1850-2022\n");
        scanf("%d",&(*fech_actual).anio);
    }

}

int calcular_edad(persona regis_salud, fecha dia_hoy){

    return ((dia_hoy.dia+(dia_hoy.mes*30)+(dia_hoy.anio*360))-(regis_salud.fecha_nac.dia+(regis_salud.fecha_nac.mes*30)+(regis_salud.fecha_nac.anio*360)))/360;
}

float calcular_IMC(persona regis_salud){
    return regis_salud.peso/(regis_salud.altura*regis_salud.altura);
}

void registro(persona regis_salud,float IMC,int edad){
    printf("REGISTRO DE SALUD:\n");
    printf("NOMBRE: %s\n",regis_salud.Pmer_nombre);
    printf("APELLIDO: %s\n",regis_salud.apellido);
    printf("FECHA DE NACIMIENTO: %d/%d/%d\n",regis_salud.fecha_nac.dia,regis_salud.fecha_nac.mes,regis_salud.fecha_nac.anio);
    printf("ALTURA(Mtros): %.1f\n",regis_salud.altura);
    printf("PESO(Kg): %.1f\n",regis_salud.peso);
    printf("EDAD: %d\n",edad);
    printf("INDICE DE MASA CORPORAL(IMC): %.1f\n",IMC);
    if(IMC<18.5)
        printf("CATEGORIA DE ACUERDO AL IMC: Bajo de peso\n");
    else{
        if(IMC>=18.5 && IMC<25)
            printf("CATEGORIA DE ACUERDO AL IMC: Normal\n");
        else{
            if(IMC>=25 && IMC<30)
                printf("CATEGORIA DE ACUERO AL IMC: Sobrepeso\n");
            else
                printf("CATEGORIA DE ACUERDO AL IMC: Obeso\n");
        }
    }
    }
