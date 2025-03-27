#ifndef RESERVAS_H_INCLUDED
#define RESERVAS_H_INCLUDED
#include <time.h>
#include <stdbool.h>
typedef struct{
    int dia;
    int mes;
    int anio;
}fecha;
void InFecha(fecha *F,int dia,int mes, int anio){
    (*F).dia = dia;
    (*F).mes = mes;
    (*F).anio = anio;
}

//Mostrar componentes fecha
int mosDia(fecha F){
    return F.dia;
}
int mosMes(fecha F){
    return F.mes;
}
int mosAnio(fecha F){
    return F.anio;
}

typedef struct{
    char nombre[30];
    int dni;
    char ciudad[20];
    fecha fechaR;
    fecha fechaIn;
    fecha fechaSl;
    float valorDia;
    float total;
    float senia;
}Reserva;

// INGRESAR
void inNombre(Reserva *R,char nombre[]){
    strcpy((*R).nombre,nombre);
}
void inDni(Reserva *R,int dni){
    (*R).dni=dni;
}
void inCiudad(Reserva *R,char ciudad[]){
    strcpy((*R).ciudad,ciudad);
}
void inFechaR(Reserva *R){
    time_t tiempoahora;
    time(&tiempoahora);
    struct tm *tiempo=localtime(&tiempoahora);
    (*R).fechaR.dia =(*tiempo).tm_mday;
    (*R).fechaR.mes=(*tiempo).tm_mon+1;
    (*R).fechaR.anio=(*tiempo).tm_year+1900;
}
void inFechaI(Reserva *R,fecha F){
    (*R).fechaIn=F;
}
void inFechaS(Reserva *R,fecha F){
    (*R).fechaSl=F;
}
void inValorDia(Reserva *R, float valor){
    (*R).valorDia = valor;
}
void inTotal(Reserva *R){
    (*R).total = calcularDiferenciaDias((*R).fechaIn,(*R).fechaSl) * (*R).valorDia;
}
void inSenia(Reserva *R, float senia){
    (*R).senia= senia;
}

// MODIFICAR
void modNombre(Reserva *R,char nombre[]){
    strcpy((*R).nombre,nombre);
}
void modDni(Reserva *R,int dni){
    (*R).dni=dni;
}
void modCiudad(Reserva *R,char ciudad[]){
    strcpy((*R).ciudad,ciudad);
}
void modFechaR(Reserva *R, fecha F){
    (*R).fechaR=F;
}
void modFechaI(Reserva *R, fecha F){
    (*R).fechaIn=F;
}
void modFechaS(Reserva *R, fecha F){
    (*R).fechaSl=F;
}
void modValorDia(Reserva *R, float valor){
    (*R).valorDia = valor;
}
void modTotal(Reserva *R, float total){
    (*R).total = total;
}
void modSenia(Reserva *R, float senia){
    (*R).senia= senia;
}

// MOSTRAR
char* mosNombre(Reserva R){
    char *aux=(char*)malloc(sizeof(char)*30);
    strcpy(aux,R.nombre);
    return aux;
}
int mosDni(Reserva R){
    return R.dni;
}
char* mosCiudad(Reserva R){
    char *aux=(char*)malloc(sizeof(char)*20);
    strcpy(aux,R.ciudad);
    return aux;
}
fecha mosFechaR(Reserva R){
    return R.fechaR;
}
fecha mosFechaI(Reserva R){
    return R.fechaIn;
}
fecha mosFechaS(Reserva R){
    return R.fechaSl;
}
float mosValorDia(Reserva R){
    return R.valorDia;
}
float mosTotal(Reserva R){
    return R.total;
}
float mosSenia(Reserva R){
    return R.senia;
}

//mostrar todo
void mostraReserva(Reserva R){
    printf("RESERVA:\n");
    printf("Nombre del Cliente: %s\n",R.nombre);
    printf("DNI: %d\n",R.dni);
    printf("Ciudad: %s\n",R.ciudad);
    printf("Fecha de Realizacion: %d/%d/%d\n",R.fechaR.dia, R.fechaR.mes, R.fechaR.anio);
    printf("Fecha de Ingreso: %d/%d/%d\n",R.fechaIn.dia, R.fechaIn.mes, R.fechaIn.anio);
    printf("Fecha de Salida: %d/%d/%d\n",R.fechaSl.dia, R.fechaSl.mes, R.fechaSl.anio);
    printf("Precio de la Cabania por dia: $%.2f\n",R.valorDia);
    printf("Total a pagar: $%.2f\n",R.total);
    printf("Senia pagada: $%.2f\n", R.senia);
    printf("------\n");
}
//

// mayor o menor fechas
bool esFechaMayor(fecha fecha1, fecha fecha2){
    // Comparar años
    if (fecha1.anio > fecha2.anio) {
        return true;
    }else{
        if (fecha1.anio < fecha2.anio) {
            return false;
        }
    }
    // Si los años son iguales, comparar meses
    if (fecha1.mes > fecha2.mes) {
        return true;
    }else{
        if (fecha1.mes < fecha2.mes) {
            return false;
        }
    }

    // Si los meses son iguales, comparar días
    if (fecha1.dia > fecha2.dia) {
        return true;
    }else{
        return false;
    }
}
bool esFechaMenor(fecha fecha1, fecha fecha2){
    // Comparar años
    if (fecha1.anio < fecha2.anio) {
        return true;
    }else{
        if (fecha1.anio > fecha2.anio) {
            return false;
        }
    }
    // Si los años son iguales, comparar meses
    if (fecha1.mes < fecha2.mes) {
        return true;
    }else{
        if (fecha1.mes > fecha2.mes) {
            return false;
        }
    }

    // Si los meses son iguales, comparar días
    if (fecha1.dia < fecha2.dia) {
        return true;
    }else{
        return false;
    }
}

//buscar
int comparaNombre(Reserva R, char nombre[]){
    if(strcmp(R.nombre,nombre)==0){
        return 1; // 1 si son iguales
    }else{return 0;}
}
int comparaDNI(Reserva R, int dni){
    if(R.dni==dni){
        return 1;
    }else{return 2;}
}
int comparaFechaMesAnio(Reserva R, int mes, int anio){
    if((R.fechaIn.anio==anio && R.fechaIn.mes==mes) || (R.fechaSl.anio==anio && R.fechaSl.mes==mes)){
        return 1;
    }else{return 0;}
}
int comparaFechaIntervalo(Reserva R, fecha F){
    if(!esFechaMenor(F,R.fechaIn) && !esFechaMayor(F,R.fechaSl)){
        return 1;
    }else{
        return 0;
    }
}
//------

// --------------------------------------------------------

bool esBisiesto(int anio) {
    return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
}

// Obtiene la cantidad de días en un mes específico
int diasEnMes(int mes, int anio) {
    switch (mes) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            return 31;
        case 4: case 6: case 9: case 11:
            return 30;
        case 2:
            return esBisiesto(anio) ? 29 : 28;
        default:
            return 0; // Mes inválido
    }
}

// Convierte una fecha a días totales desde el 01/01/0001
int convertirADiasTotales(int dia, int mes, int anio) {
    int diasTotales = 0;

    // Sumar días de años completos
    for (int i = 1; i < anio; i++) {
        diasTotales += esBisiesto(i) ? 366 : 365;
    }

    // Sumar días de meses completos del año actual
    for (int i = 1; i < mes; i++) {
        diasTotales += diasEnMes(i, anio);
    }

    // Sumar días del mes actual
    diasTotales += dia;

    return diasTotales;
}

// Calcula la diferencia en días entre dos fechas
int calcularDiferenciaDias(fecha fecha1, fecha fecha2) {
    int dias1 = convertirADiasTotales(fecha1.dia, fecha1.mes, fecha1.anio);
    int dias2 = convertirADiasTotales(fecha2.dia, fecha2.mes, fecha2.anio);

    return dias2 - dias1;
}


bool validarFecha(int dia, int mes, int anio) {
    // Días máximos por mes (sin considerar bisiestos)
    int diasPorMes[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // Verificar el rango del año
    if (anio < 2000 || anio>2026) {
        return false;
    }

    // Verificar el rango del mes
    if (mes < 1 || mes > 12) {
        return false;
    }

    // Ajustar días de febrero si es un año bisiesto
    if (mes == 2 && esBisiesto(anio)) {
        diasPorMes[1] = 29;
    }

    // Verificar el rango del día
    if (dia < 1 || dia > diasPorMes[mes - 1]) {
        return false;
    }

    return true;
}

// Función para ingresar una fecha válida
void ingresarFecha(int *dia, int *mes, int *anio) {
    do {
        printf("Ingrese la fecha (dd mm aaaa):\n");
        fflush(stdin);
        do{
            printf("dd\n");
            fflush(stdin);
        }while(1!=scanf("%d",dia));
        do{
            printf("mm\n");
            fflush(stdin);
        }while(1!=scanf("%d",mes));
        do{
            printf("aaaa\n");
            fflush(stdin);
        }while(1!=scanf("%d",anio));
        //scanf("%d %d %d", dia, mes, anio);

        if (!validarFecha(*dia, *mes, *anio)) {
            printf("Fecha invalida. Intente nuevamente.\n");
        }
    } while (!validarFecha(*dia, *mes, *anio));
}




#endif // RESERVAS_H_INCLUDED
