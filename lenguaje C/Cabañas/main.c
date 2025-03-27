#include <stdio.h>
#include <stdlib.h>
#include "Reservas.h"
#include "lista.h"
#include <strings.h>
#include <stdbool.h>

void MAYUS(char arr[]){
    int i=0;
    for(i; i<strlen(arr); i++)
    {
        arr[i]=toupper(arr[i]);
    }
}
bool fechaValidaIngreso(lista *l,fecha F){
    if(1==isEmpty(*l)){
        return true;
    }
    reset(l);
    while(isoos(*l)==0){
        fecha inicio = mosFechaI(copyy(*l));
        fecha fin = mosFechaS(copyy(*l));
        if(!esFechaMenor(F,inicio) && esFechaMenor(F,fin)){
            return false;
        }else{
            forwardd(l);
        }
    }
    return true;
}
bool fechaValidaSalida(lista *l,fecha F){
    if(1==isEmpty(*l)){
        return true;
    }
    reset(l);
    while(isoos(*l)==0){
        fecha inicio = mosFechaI(copyy(*l));
        fecha fin = mosFechaS(copyy(*l));
        if(esFechaMayor(F,inicio) && !esFechaMayor(F,fin)){
            return false;
        }else{
            forwardd(l);
        }
    }
    return true;
}
void insertOrden(lista *l, Reserva R){
    reset(l);
    bool con = true;
    while(con){
        if(1==isoos(*l)){
            insertar(l,R);
            con=false;
        }else{
            if(esFechaMayor(mosFechaI(R),mosFechaI(copyy(*l)))){
                forwardd(l);
            }else{
                insertar(l,R);
                con=false;
            }
        }
    }
}
void ingresaReserva(lista *l,float C[], int opcion){
    Reserva R;
    char nombre[30];
    int dni;
    char ciudad[20];
    fecha FecIn,FecSl;
    int dia, mes, anio;
    float valorDia,senia;
    bool con;
    system("cls");
    printf("Ingrese Nombre y Apellido del cliente que realizo la reserva:\n");
    fflush(stdin);
    scanf("%[^\n]%*c",nombre);
    MAYUS(nombre);
    do{
        printf("Ingrese DNI del cliente:\n");
        fflush(stdin);
    }while(1!=scanf("%d",&dni) || (dni<1000000 || dni>99999999));
    printf("Ingrese la ciudad en la que vive el cliente:\n");
    fflush(stdin);
    scanf("%[^\n]",ciudad);
    MAYUS(ciudad);
    do{
        con=true;
        printf("Ingrese la fecha de ingreso:\n");
        ingresarFecha(&dia, &mes, &anio);
        InFecha(&FecIn,dia,mes,anio);

        if(!fechaValidaIngreso(l,FecIn)){
            printf("FECHA RESERVADA\nIngrese otra fecha:\n");
        }else{

            con=false;
        }
    }while(con);
    do{
        con=true;
        printf("Ingrese la fecha de salida:\n");
        ingresarFecha(&dia, &mes, &anio);
        InFecha(&FecSl,dia,mes,anio);
        if(!esFechaMayor(FecSl,FecIn) || !(fechaValidaSalida(l,FecSl))){
            printf("FECHA RESERVADA O INCORRECTA\n");
        }else{

            con=false;
        }
    }while(con);
    switch(opcion){
        case 1: valorDia=C[opcion-1];break;
        case 2: valorDia=C[opcion-1];break;
        case 3: valorDia=C[opcion-1];break;
        case 4: valorDia=C[opcion-1];break;
        case 5: valorDia=C[opcion-1];break;
    }
    inNombre(&R,nombre);
    inDni(&R,dni);
    inCiudad(&R,ciudad);
    inFechaR(&R);
    inFechaI(&R,FecIn);
    inFechaS(&R,FecSl);
    inValorDia(&R,valorDia);
    inTotal(&R);
    do{
        printf("Ingrese la cantidad de senia que pago el cliente:\n");
        printf("$0 - $%.2f\n",mosTotal(R));
        fflush(stdin);
    }while(1!=scanf("%f",&senia) || (senia<0 || senia>mosTotal(R)));
    inSenia(&R,senia);
    insertOrden(l,R);
    if(1==guardaReservas(l,opcion)){
        printf("Reserva Cargada Correctamente.\n");
    }
    fflush(stdin);
    printf("Presione Enter\n");
    getchar();

}

int mostrarMeses(){
    int opcion;
    printf("Indique el mes:\n");
    printf("<1> ENERO.\n");
    printf("<2> FEBRERO.\n");
    printf("<3> MARZO.\n");
    printf("<4> ABRIL.\n");
    printf("<5> MAYO.\n");
    printf("<6> JUNIO.\n");
    printf("<7> JULIO.\n");
    printf("<8> AGOSTO.\n");
    printf("<9> SEPTIEMBRE.\n");
    printf("<10> OCTUBRE.\n");
    printf("<11> NOVIEMBRE.\n");
    printf("<12> DICIEMBRE.\n");
    fflush(stdin);
    while(1!=scanf("%d",&opcion) || opcion<1 || opcion>12){
        printf("Indique el mes CORRECTAMENTE:\n");
        fflush(stdin);
    }
    return opcion;
}
void buscarReserva(lista *l){
    int opcion=1;
    char val='1';
    char nombre[30];
    int dni;
    int mes,anio;
    reset(l);
    if(1==isEmpty(*l)){
        printf("No hay datos cargados.\n");
        fflush(stdin);
        printf("Presione enter.\n");
        getchar();
    }else{
        while(opcion>=1 && opcion<=3){
            do{
                reset(l);
                val='1';
                system("cls");
                fflush(stdin);
                printf("Indique como desea buscar la reserva:\n");
                printf("<1> Nombre del cliente.\n");
                printf("<2> DNI del cliente.\n");
                printf("<3> Mes y Anio de la reserva.\n");
                printf("<4> Volver.\n");
                printf("\n");
            }while(1!=scanf("%d",&opcion) || (opcion<1 || opcion>4));
            switch(opcion){
                case 1:
                    printf("Ingrese el nombre del cliente:\n");
                    fflush(stdin);
                    scanf("%[^\n]",nombre);
                    MAYUS(nombre);
                    break;
                case 2:
                    do{
                        printf("Ingrese DNI del cliente:\n");
                        fflush(stdin);
                    }while(1!=scanf("%d",&dni) || (dni<1000000 || dni>99999999));
                    break;
                case 3:
                    printf("Indique el anio:\n");
                    fflush(stdin);
                    while(1!=scanf("%d",&anio) || anio<1 || anio>2026){
                        fflush(stdin);
                        printf("indique el anio correctamente\n");
                    }
                    mes=mostrarMeses();
                    break;
                case 4: break;
            }

            while(opcion!=4 && 0==isoos(*l)){
                system("cls");
                for(int i=0;i<3 && 0==isoos(*l);){
                    switch(opcion){
                        case 1:
                            if(1==comparaNombre(copyy(*l),nombre)){
                                mostraReserva(copyy(*l));
                                i++;
                            }
                            break;
                        case 2:
                            if(1==comparaDNI(copyy(*l),dni)){
                                mostraReserva(copyy(*l));
                                i++;
                            }
                            break;
                        case 3:
                            if(1==comparaFechaMesAnio(copyy(*l),mes,anio)){
                                mostraReserva(copyy(*l));
                                i++;
                            }
                            break;
                    }
                    forwardd(l);
                }
                if(1==isoos(*l)){
                    printf("Se mostraron todos los datos.\n");
                    printf("Presione enter\n");
                    fflush(stdin);
                    getchar();
                }else{
                    printf("Presione enter para continuar\n"
                            "Ingrese 0 para finalizar\n");
                    fflush(stdin);
                    val=getchar();
                    if(val=='0'){
                        break;
                    }
                }

            }
        }

    }

}

void eliminaReserva(lista *l,int opcion){
    char opc='a';
    int dia,mes,anio;
    fecha Fecha;
    int encontrada = 0;
    reset(l);
    if(1==isEmpty(*l)){
        printf("No hay datos cargados.\n");
        fflush(stdin);
        printf("Presione enter.\n");
        getchar();
    }else{
        system("cls");
        printf("Indique una fecha dentro del intervalo de estadia de la reserva que desea eliminar:\n");
        ingresarFecha(&dia, &mes, &anio);
        InFecha(&Fecha,dia,mes,anio);
        while(0==isoos(*l)){
            if(1==comparaFechaIntervalo(copyy(*l),Fecha)){
                encontrada=1;
                system("cls");
                printf("Reserva Encontrada:\n");
                mostraReserva(copyy(*l));
                printf("Desea Eliminarla?\n"
                       "S(si) / N(no)\n");
                fflush(stdin);
                while(1!=scanf("%c",&opc) || ((opc!='S' && opc!='s') && (opc!='N' && opc!='n'))){
                    fflush(stdin);
                    printf("S(si) / N(no)\n");
                }
                if(opc=='S' || opc=='s'){
                    suprimir(l);
                    if(1==guardaReservas(l,opcion)){
                        printf("Eliminado Correctamente.\n");
                    }
                    fflush(stdin);
                    printf("Presione enter.\n");
                    getchar();
                }
                break;


            }
            forwardd(l);
        }
        if(0==encontrada){
            printf("Reserva no encontrada.\n"
                   "Presione enter\n");
            fflush(stdin);
            getchar();
        }


    }

}

int preCargaPrecios(float C[]){
    FILE *fp;
    fp=fopen("precioCab.txt","r");
    if(fp==NULL){
        printf("no se encontro el archivo\n");
        fclose(fp);
        return 0;
    }else{
        if(EOF==fscanf(fp,"%f %f %f %f %f",&C[0],&C[1],&C[2],&C[3],&C[4])){
            printf("No se precargaron los datos.\n");
            fclose(fp);
            return 0;
        }else{
            fclose(fp);
            return 1;
        }

    }
}
int guardaPrecios(float C[]){
    FILE *fp;
    fp=fopen("precioCab.txt","w");
    if(fp==NULL){
                printf("NO SE ENCONTRO EL ARCHIVO\nLos datos no han sido modificados\n");
                fclose(fp);
                return 0;
    }else{
        fprintf(fp,"%f\n%f\n%f\n%f\n%f\n",C[0],C[1],C[2],C[3],C[4]);
        fclose(fp);
        return 1;
    }

}

void selReservaIngr(lista *cab1,lista *cab2,lista *cab3,lista *cab4,lista *cab5, float C[]){
    int opcion=1;
    while(opcion>=1 && opcion<=5){
        do{
            fflush(stdin);
            system("cls");
            printf("Indique de que cababia desea realizar la reserva:\n");
            printf("<1> Cabania 1.\n"
                   "<2> Cabania 2.\n"
                   "<3> Cabania 3.\n"
                   "<4> Cabania 4.\n"
                   "<5> Cabania 5.\n"
                   "<6> Volver.\n");
        }while(1!=scanf("%d",&opcion) || opcion<1 || opcion>6);
        switch(opcion){
            case 1:
                ingresaReserva(cab1,C,opcion);
                break;
            case 2:
                ingresaReserva(cab2,C,opcion);
                break;
            case 3:
                ingresaReserva(cab3,C,opcion);
                break;
            case 4:
                ingresaReserva(cab4,C,opcion);
                break;
            case 5:
                ingresaReserva(cab5,C,opcion);
                break;
            case 6: break;
        }
    }
}
void selReservaBusc(lista *cab1,lista *cab2,lista *cab3,lista *cab4,lista *cab5){
    int opcion=1;
    while(opcion>=1 && opcion<=5){
        do{
            fflush(stdin);
            system("cls");
            printf("Indique de que cababia desea realizar la Busqueda:\n");
            printf("<1> Cabania 1.\n"
                   "<2> Cabania 2.\n"
                   "<3> Cabania 3.\n"
                   "<4> Cabania 4.\n"
                   "<5> Cabania 5.\n"
                   "<6> Volver.\n");
        }while(1!=scanf("%d",&opcion) || opcion<1 || opcion>6);
        switch(opcion){
            case 1:
                buscarReserva(cab1);
                break;
            case 2:
                buscarReserva(cab2);
                break;
            case 3:
                buscarReserva(cab3);
                break;
            case 4:
                buscarReserva(cab4);
                break;
            case 5:
                buscarReserva(cab5);
                break;
            case 6: break;
        }
    }
}
void selReservaElim(lista *cab1,lista *cab2,lista *cab3,lista *cab4,lista *cab5){
    int opcion=1;
    while(opcion>=1 && opcion<=5){
        do{
            fflush(stdin);
            system("cls");
            printf("Indique de que cababia desea eliminar una Reserva:\n");
            printf("<1> Cabania 1.\n"
                   "<2> Cabania 2.\n"
                   "<3> Cabania 3.\n"
                   "<4> Cabania 4.\n"
                   "<5> Cabania 5.\n"
                   "<6> Volver.\n");
        }while(1!=scanf("%d",&opcion) || opcion<1 || opcion>6);
        switch(opcion){
            case 1:
                eliminaReserva(cab1,opcion);
                break;
            case 2:
                eliminaReserva(cab2,opcion);
                break;
            case 3:
                eliminaReserva(cab3,opcion);
                break;
            case 4:
                eliminaReserva(cab4,opcion);
                break;
            case 5:
                eliminaReserva(cab5,opcion);
                break;
            case 6: break;
        }
    }
}
void selPrecio(float C[]){
    int opcion=1;
    while(opcion>=1 && opcion<=2){
        do{
            fflush(stdin);
            system("cls");
            printf("Indique la opcion:\n"
                   "<1> Ver precio de las Cabanias.\n"
                   "<2> Modificar precios de las Cabanias.\n"
                   "<3> Volver.\n");
        }while(1!=scanf("%d",&opcion) || opcion<1 || opcion>3);
        switch(opcion){
            case 1:
                system("cls");
                printf("Precios por noche:\n"
                       "Cabania 1: $%.2f\n"
                       "Cabania 2: $%.2f\n"
                       "Cabania 3: $%.2f\n"
                       "Cabania 4: $%.2f\n"
                       "Cabania 5: $%.2f\n",C[0],C[1],C[2],C[3],C[4]);
                       fflush(stdin);
                       printf("Presione enter\n");
                       getchar();
                break;
            case 2:
                modPrecio(C);
                break;
            case 3: break;
        }
    }
}
void modPrecio(float C[]){
    int opcion=1;
    float precio;
    while(opcion>=1 && opcion<=5){
        do{
            fflush(stdin);
            system("cls");
            printf("Indique de que cababia desea modificar el precio:\n");
            printf("<1> Cabania 1.\n"
                   "<2> Cabania 2.\n"
                   "<3> Cabania 3.\n"
                   "<4> Cabania 4.\n"
                   "<5> Cabania 5.\n"
                   "<6> Volver.\n");
        }while(1!=scanf("%d",&opcion) || opcion<1 || opcion>6);

        if(opcion!=6){
            printf("Ingrese el nuevo precio:\n");
            while(1!=scanf("%f",&precio) || precio<=0){
                printf("Ingrese correctamente\n");
                fflush(stdin);
            }
        }
        switch(opcion){
            case 1:
                C[opcion-1] = precio;
                break;
            case 2:
                C[opcion-1] = precio;
                break;
            case 3:
                C[opcion-1] = precio;
                break;
            case 4:
                C[opcion-1] = precio;
                break;
            case 5:
                C[opcion-1] = precio;
                break;
            case 6: break;
        }
        if(opcion!=6 && 1==guardaPrecios(C)){
            fflush(stdin);
            printf("Modificado correctamente\n"
                   "Presione enter\n");
            getchar();
        }else{
            if(opcion!=6){
                fflush(stdin);
                printf("Presione enter\n");
                getchar();
            }
        }

    }
}



int preCargaReserva(lista *l,int opcion){
    Reserva R;
    char nombre[30];
    int dni;
    char ciudad[20];
    fecha fechaR;
    fecha fechaIn;
    fecha fechaSl;
    float valorDia;
    float total;
    float senia;
    int dia,mes,anio;
    FILE *fp;
    reset(l);
    switch(opcion){
        case 1:
            fp=fopen("resCab1.txt","r");
            break;
        case 2:
            fp=fopen("resCab2.txt","r");
            break;
        case 3:
            fp=fopen("resCab3.txt","r");
            break;
        case 4:
            fp=fopen("resCab4.txt","r");
            break;
        case 5:
            fp=fopen("resCab5.txt","r");
            break;
    }
    if(fp==NULL){
        fclose(fp);
        return 0;
    }else{
        while((fscanf(fp,"%[^\n]\n",nombre))!=EOF){
           fscanf(fp,"%d\n",&dni);
           fscanf(fp,"%[^\n]\n",ciudad);
           fscanf(fp,"%d %d %d\n",&dia,&mes,&anio);
           InFecha(&fechaR,dia,mes,anio);
           fscanf(fp,"%d %d %d\n",&dia,&mes,&anio);
           InFecha(&fechaIn,dia,mes,anio);
           fscanf(fp,"%d %d %d\n",&dia,&mes,&anio);
           InFecha(&fechaSl,dia,mes,anio);
           fscanf(fp,"%f\n",&valorDia);
           fscanf(fp,"%f\n",&total);
           fscanf(fp,"%f\n",&senia);

           inNombre(&R,nombre);
           inDni(&R,dni);
           inCiudad(&R,ciudad);
           modFechaR(&R,fechaR);
           inFechaI(&R,fechaIn);
           inFechaS(&R,fechaSl);
           inValorDia(&R,valorDia);
           modTotal(&R,total);
           inSenia(&R,senia);
           insertOrden(l,R);
        }
        fclose(fp);
        return 1;

    }

}
int guardaReservas(lista *l,int opcion){
    FILE *fp;
    reset(l);
    switch(opcion){
        case 1:
            fp=fopen("resCab1.txt","w");
            break;
        case 2:
            fp=fopen("resCab2.txt","w");
            break;
        case 3:
            fp=fopen("resCab3.txt","w");
            break;
        case 4:
            fp=fopen("resCab4.txt","w");
            break;
        case 5:
            fp=fopen("resCab5.txt","w");
            break;
    }
     if(fp==NULL){
        fclose(fp);
        printf("No se encuentra el archivo correspondiente\n"
               "Revise que este todo en optimas condiciones\n"
               "Sino los datos ingresados o eliminados no seran actualizados y no quedaran guardados\n");
        return 0;
    }else{
        while(0==isoos(*l)){
            fprintf(fp,"%s\n",mosNombre(copyy(*l)));
            fprintf(fp,"%d\n",mosDni(copyy(*l)));
            fprintf(fp,"%s\n",mosCiudad(copyy(*l)));
            fprintf(fp,"%d %d %d\n",mosDia(mosFechaR(copyy(*l))),mosMes(mosFechaR(copyy(*l))),mosAnio(mosFechaR(copyy(*l))));
            fprintf(fp,"%d %d %d\n",mosDia(mosFechaI(copyy(*l))),mosMes(mosFechaI(copyy(*l))),mosAnio(mosFechaI(copyy(*l))));
            fprintf(fp,"%d %d %d\n",mosDia(mosFechaS(copyy(*l))),mosMes(mosFechaS(copyy(*l))),mosAnio(mosFechaS(copyy(*l))));
            fprintf(fp,"%.2f\n",mosValorDia(copyy(*l)));
            fprintf(fp,"%.2f\n",mosTotal(copyy(*l)));
            fprintf(fp,"%.2f\n",mosSenia(copyy(*l)));
            forwardd(l);
        }
        fclose(fp);
        return 1;

    }



}

int main(){
    lista cab1,cab2,cab3,cab4,cab5;
    float C[5];
    int opcion = 1;
    int opc=0;
    init(&cab1);
    init(&cab2);
    init(&cab3);
    init(&cab4);
    init(&cab5);
    if(0==preCargaPrecios(C)){

        return 0;
    }
    opc+=preCargaReserva(&cab1,1);
    opc+=preCargaReserva(&cab2,2);
    opc+=preCargaReserva(&cab3,3);
    opc+=preCargaReserva(&cab4,4);
    opc+=preCargaReserva(&cab5,5);
    if(opc<5){
        printf("no se encontraron los archivos necesarios\n");
        return 0;
    }

    while(opcion>=1 && opcion<=4){
        do{
            fflush(stdin);
            system("cls");
            printf("Cabanias 'La Bonita'\n"
                   "<1> Ingresar Reserva.\n"
                   "<2> Buscar Reserva.\n"
                   "<3> Eliminar Reserva.\n"
                   "<4> Precios Cabanias.\n"
                   "<5> Salir.\n");
        }while(1!=scanf("%d",&opcion) || opcion<1 || opcion>5);
        switch(opcion){
            case 1:
                selReservaIngr(&cab1,&cab2,&cab3,&cab4,&cab5,C);
                break;
            case 2:
                selReservaBusc(&cab1,&cab2,&cab3,&cab4,&cab5);
                break;
            case 3:
                selReservaElim(&cab1,&cab2,&cab3,&cab4,&cab5);
                break;
            case 4:
                selPrecio(C);
                break;
            case 5: break;
        }
    }
    return 0;
}

