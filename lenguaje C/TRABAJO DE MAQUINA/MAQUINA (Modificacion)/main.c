#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <strings.h>
#include "equipos.h"
#include "lista.h"
#define max 32

typedef struct
{
    char P[20];
} mun;
void init_continentes(mun Am[],mun Eu[],mun Af[],mun As[]){
    strcpy(Am[0].P,"BRASIL");
    strcpy(Am[1].P,"ARGENTINA");
    strcpy(Am[2].P,"URUGUAY");
    strcpy(Am[3].P,"ECUADOR");
    strcpy(Am[4].P,"CANADA");
    strcpy(Am[5].P,"MEXICO");
    strcpy(Am[6].P,"ESTADOS UNIDOS");
    strcpy(Am[7].P,"COSTA RICA");

    strcpy(Eu[0].P,"ALEMANIA");
    strcpy(Eu[1].P,"DINAMARCA");
    strcpy(Eu[2].P,"FRANCIA");
    strcpy(Eu[3].P,"BELGICA");
    strcpy(Eu[4].P,"CROACIA");
    strcpy(Eu[5].P,"ESPANIA");
    strcpy(Eu[6].P,"SERBIA");
    strcpy(Eu[7].P,"INGLATERRA");
    strcpy(Eu[8].P,"SUIZA");
    strcpy(Eu[9].P,"PAISES BAJOS");
    strcpy(Eu[10].P,"PORTUGAL");
    strcpy(Eu[11].P,"POLONIA");
    strcpy(Eu[12].P,"GALES");

    strcpy(As[0].P,"QATAR");
    strcpy(As[1].P,"IRAN");
    strcpy(As[2].P,"COREA DEL SUR");
    strcpy(As[3].P,"JAPON");
    strcpy(As[4].P,"ARABIA SAUDITA");
    strcpy(As[5].P,"AUSTRALIA");

    strcpy(Af[0].P,"GHANA");
    strcpy(Af[1].P,"SENEGAL");
    strcpy(Af[2].P,"TUNEZ");
    strcpy(Af[3].P,"MARRUECOS");
    strcpy(Af[4].P,"CAMERUN");

}
void init_paises(mun paises[]){
    strcpy(paises[0].P,"BRASIL");
    strcpy(paises[1].P,"ARGENTINA");
    strcpy(paises[2].P,"URUGUAY");
    strcpy(paises[3].P,"ECUADOR");
    strcpy(paises[4].P,"CANADA");
    strcpy(paises[5].P,"MEXICO");
    strcpy(paises[6].P,"ESTADOS UNIDOS");
    strcpy(paises[7].P,"COSTA RICA");
    strcpy(paises[8].P,"ALEMANIA");
    strcpy(paises[9].P,"DINAMARCA");
    strcpy(paises[10].P,"FRANCIA");
    strcpy(paises[11].P,"BELGICA");
    strcpy(paises[12].P,"CROACIA");
    strcpy(paises[13].P,"ESPANIA");
    strcpy(paises[14].P,"SERBIA");
    strcpy(paises[15].P,"INGLATERRA");
    strcpy(paises[16].P,"SUIZA");
    strcpy(paises[17].P,"PAISES BAJOS");
    strcpy(paises[18].P,"PORTUGAL");
    strcpy(paises[19].P,"POLONIA");
    strcpy(paises[20].P,"GALES");
    strcpy(paises[21].P,"QATAR");
    strcpy(paises[22].P,"IRAN");
    strcpy(paises[23].P,"COREA DEL SUR");
    strcpy(paises[24].P,"JAPON");
    strcpy(paises[25].P,"ARABIA SAUDITA");
    strcpy(paises[26].P,"AUSTRALIA");
    strcpy(paises[27].P,"GHANA");
    strcpy(paises[28].P,"SENEGAL");
    strcpy(paises[29].P,"TUNEZ");
    strcpy(paises[30].P,"MARRUECOS");
    strcpy(paises[31].P,"CAMERUN");
}

int PaisesDisponibles(lista *l,char *ps,int opcion/*0 cargar - 1 mostrar*/ ){
    mun paises[32];
    mun pais[32];//para guardar las opciones y en las posiciones que se van mostrando
    init_paises(paises);
    int opc,cant=1;
    int i=0;
    printf("<0> NINGUNO\n");
    for(i;i<32;i++){
        if(/*0 si no encontro pais - 1 si encontro pais*/opcion==Buscarpais(l,paises[i])){
            printf("<%d> %s\n",cant,paises[i]);
            strcpy(pais[cant].P,paises[i].P);
            cant++;
        }
    }

    while(1!=scanf("%d",&opc) || (opc<0 || opc>=cant)){
        fflush(stdin);
        printf("Ingresa Correctamente\n");
    }
    if(opc!=0){
        strcpy(ps,pais[opc].P);
        return 1;
    }else{
        return 0;//retorna 0 si la opcion elegida fue 0
    }


}

/*A*/void CargaLista(lista *l,int *cant){
    int i;
    char grupo;
    char PCF[20];
    char nomall[50];
    char nombre[25];
    char apellido[25];
    int PuntAct_FASE=0;
    Equipo E;
    system("cls");
    if(*cant==32){
        printf("Ya se ha realizado la carga de todos los Equipos\n");
        fflush(stdin);
        printf("Presione Enter\n");
        getchar();
    }else{
        system("cls");
        fflush(stdin);
        printf("usted va cargando %d paises de 32\n",*cant);
        printf("Indique el pais a ingresar\n");
        if(1==PaisesDisponibles(l,PCF,0)){
            printf("Usted escogio %s\n",PCF);
            InPais(&E,PCF);
            printf("ingrese Apellido de DT\n");
            fflush(stdin);
            scanf("%s",apellido);
            printf("Ingrese Nombre de DT\n");
            fflush(stdin);
            scanf("%s",nombre);
            strcpy(nomall,apellido);
            strcat(nomall," ");
            strcat(nomall,nombre);
            MAYUS(nomall);
            InDirector(&E,nomall);
            printf("Ingrese Apellido del Capitan\n");
            fflush(stdin);
            scanf("%[^\n]",PCF);
            MAYUS(PCF);
            InCAP(&E,PCF);
            printf("Ingrese Grupo al cual pertenece\n");
            do{
                printf("A - H\n");
                fflush(stdin);
                scanf("%c",&grupo);
            }while(grupo<'A' || grupo>'H');
            InGrupo(&E,grupo);
            InFase(&E,PuntAct_FASE);
            InPuntAct(&E,PuntAct_FASE);
            fecha_act(&E);
            init_ingreso(&E);
            insertar(l,E);
            system("cls");

            *cant=*cant+1;
        }


    }

}

void MAYUS(char arr[]){
    int i=0;
    for(i; i<strlen(arr); i++)
    {
        arr[i]=toupper(arr[i]);
    }
}
void init_ingreso(Equipo *E){
    gdor goleador;
    AlmG G;
    strcpy(goleador.Apell," ");
    goleador.goles=0;
    G.GF=0;
    G.GC=0;
    G.Pj=0;
    InGolesFase(E,G);
    InGoleador(E,goleador);
    InPG(E,0);
    InPE(E,0);
    InPJ(E,0);

}


/*B*/int Buscarpais(lista *l,char ppais[]){
    Equipo E;
    reset(l);
    while(0==isoos(*l))
    {
        E=copyy(*l);
        if(0==strcmp(E.pais,ppais))
        {
            return 1;//1 Encontro pais
        }
        else
        {
            forwardd(l);
        }
    }
    return 0;//0 no encontro pais o lista vacia
}

/*C*/void MostrarPais(lista *l){
    system("cls");
    Equipo E;
    char ppais[20];
    if(1==isEmpty(*l)){
        printf("No hay datos cargados\n");
        fflush(stdin);
        printf("Presione Enter\n");
        getchar();
    }
    else{
        printf ("Indique el pais que desea mostrar\n");
        if(1==PaisesDisponibles(l,ppais,1)){
                Buscarpais(l,ppais);
                system("cls");
                E=copyy(*l);
                system("cls");
                printf("Pais: %s\n",Mospais(E)) ;
                printf("Director Tecnico: %s\n",Mosdirector(E));
                printf("Capitan: %s\n",MosCAP(E));
                printf("Grupo: %c\n",Mosgrupo(E));
                printf("Puntaje Actual: %d\n",Mospuntajeact(E));
                switch(Mosfase(E)){
                case 0:
                    printf("Fase: PRIMERA FASE\n");
                    break;
                case 1:
                    printf("Fase: OCTAVOS DE FINAL\n");
                    break;
                case 2:
                    printf("Fase: CUARTOS DE FINAL\n");
                    break;
                case 3:
                    printf("Fase: SEMI FINALES\n");
                    break;
                case 4:
                    printf("Fase: FINAL\n");
                    break;
                }
                printf ("Partidos Jugados: %d \n",mosPJ(E));
                printf ("Partidos Ganados: %d \n",mosPG(E));
                printf ("Partidos Empatados: %d \n",mosPE(E));

                printf("DATOS DE LA FASE ANTERIOR\n");
                printf("GOLEADOR\n");
                printf("Apellido: %s\n",MosGoleador(E).Apell);
                printf("Goles: %d\n",MosGoleador(E).goles);

                printf ("Goles a Favor : %d\n",MosAlmg(E,E.fase).GF);
                printf ("Goles en Contra: %d\n",MosAlmg(E,E.fase).GC);
                printf ("Puntaje Parcial: %d\n",MosAlmg(E,E.fase).Pj);
                fflush(stdin);
                printf("Presione Enter\n");
                getchar();
        }
    }

}

/*D*/void mostrar_todo_fase(lista *l,int fase){
    system("cls");
    reset(l);
    int i=0;
    Equipo E;
    while(0==isoos(*l))
    {
        E=copyy(*l);
        if(E.fase>=fase){
            i++;
            printf("Pais: %s\n",Mospais(E)) ;
            printf("Director Tecnico: %s\n",Mosdirector(E));
            printf("Capitan: %s\n",MosCAP(E));
            printf("Grupo: %c\n",Mosgrupo(E));
            printf("Puntaje Actual: %d\n",Mospuntajeact(E));



            switch(Mosfase(E))
            {
            case 0:
                printf("Fase: PRIMERA FASE\n");
                break;
            case 1:
                printf("Fase: OCTAVOS DE FINAL\n");
                break;
            case 2:
                printf("Fase: CUARTOS DE FINAL\n");
                break;
            case 3:
                printf("Fase: SEMI FINALES\n");
                break;
            case 4:
                printf("Fase: FINAL\n");
                break;
            }
            printf ("Partidos Jugados: %d \n",mosPJ(E));
            printf ("Partidos Ganados: %d \n",mosPG(E));
            printf ("Partidos Empatados: %d \n",mosPE(E));

            printf("DATOS DE LA FASE ANTERIOR\n");
            printf("GOLEADOR\n");
            printf("Apellido: %s\n",MosGoleador(E).Apell);
            printf("Goles: %d\n",MosGoleador(E).goles);

            printf ("Goles a Favor : %d\n",MosAlmg(E,fase).GF);
            printf ("Goles en Contra: %d\n",MosAlmg(E,fase).GC);
            printf ("Puntaje Parcial: %d\n",MosAlmg(E,fase).Pj);

            printf("\n");
        }
        forwardd(l);
    }
    if(i==0){
        printf("No Hay Datos Cargados En Esta Fase\n");
    }
    fflush(stdin);
    printf("Presione Enter\n");
    getchar();
}

/*E*/void ordenagoleador(lista *l){
    Equipo E[32];
    reset(l);
    int i=0;
    int j,menor=0;
    Equipo aux;
    while(0==isoos(*l))
    {
        E[i]=copyy(*l);
        i++;
        forwardd(l);
    }

    for(menor; menor<i-1; menor++)
    {
        for(j=menor+1; j<i; j++)
        {
            if(strcmp(E[j].pais,E[menor].pais)<0)
            {
                aux=E[menor];
                E[menor]=E[j];
                E[j]=aux;
            }
        }
    }
    system("cls");
    for(j=0; j<i; j++)
    {
        printf("PAIS: %s\n",E[j].pais);
        printf("GOLEADOR: %s\n",E[j].goleador.Apell);
        printf("GOLES: %d\n",E[j].goleador.goles);
        printf("\n");
    }
    if(i==0){
        printf("No hay datos cargados\n");
    }
    fflush(stdin);
    printf("Presione Enter\n");
    getchar();

}

/*F*/void ordenar_paises_puntaje(lista *l){
    Equipo E[32];
    reset(l);
    int i=0;
    int j,mayor=0;
    Equipo aux;
    while(0==isoos(*l))
    {
        E[i]=copyy(*l);
        i++;
        forwardd(l);
    }

    for(mayor; mayor<i-1; mayor++)
    {
        for(j=mayor+1; j<i; j++)
        {
            if(E[j].PuntajeAct>E[mayor].PuntajeAct)
            {
                aux=E[mayor];
                E[mayor]=E[j];
                E[j]=aux;
            }
        }
    }
    system("cls");
    if(i==0){
        printf("No Hay Datos Cargados\n");
    }
    else{
    mostrar_pais_recursivo(E,j=0,i);
    }
    fflush(stdin);
    printf("Presione Enter\n");
    getchar();
}
void mostrar_pais_recursivo(Equipo E[],int j,int cant){
    if(j==cant)
    {
        printf("\n");
    }
    else
    {
        printf("Pais: %s\n",Mospais(E[j])) ;
        printf("Director Tecnico: %s\n",Mosdirector(E[j]));
        printf("Capitan: %s\n",MosCAP(E[j]));
        printf("Grupo: %c\n",Mosgrupo(E[j]));
        printf("Puntaje Actual: %d\n",Mospuntajeact(E[j]));



        switch(Mosfase(E[j]))
        {
        case 0:
            printf("Fase: PRIMERA FASE\n");
            break;
        case 1:
            printf("Fase: OCTAVOS DE FINAL\n");
            break;
        case 2:
            printf("Fase: CUARTOS DE FINAL\n");
            break;
        case 3:
            printf("Fase: SEMI FINALES\n");
            break;
        case 4:
            printf("Fase: FINAL\n");
            break;
        }
        printf ("Partidos Jugados: %d \n",mosPJ(E[j]));
        printf ("Partidos Ganados: %d \n",mosPG(E[j]));
        printf ("Partidos Empatados: %d \n",mosPE(E[j]));

        printf("DATOS DE LA FASE ANTERIOR\n");
        printf("GOLEADOR\n");
        printf("Apellido: %s\n",MosGoleador(E[j]).Apell);
        printf("Goles: %d\n",MosGoleador(E[j]).goles);

        printf ("Goles a Favor : %d\n",MosAlmg(E[j],E[j].fase).GF);
        printf ("Goles en Contra: %d\n",MosAlmg(E[j],E[j].fase).GC);
        printf ("Puntaje Parcial: %d\n",MosAlmg(E[j],E[j].fase).Pj);

        printf("\n");
        mostrar_pais_recursivo(E,j+1,cant);
    }

}

/*G*/void modifica_punt_part(lista *l){
    system("cls");
    int R;
    Equipo E;
    char ppais[20];
    if(1==isEmpty(*l)){
        printf("No hay datos cargados\n");
        fflush(stdin);
        printf("Presione Enter\n");
        getchar();
    }
    else{
        printf ("Indique el pais que desea modificar\n");
        if(1==PaisesDisponibles(l,ppais,1)){
            Buscarpais(l,ppais);
            printf("Usted escogio %s\n",ppais);
            E=copyy(*l);
            printf("cual fue el resultado\n");
            do{
                fflush(stdin);
                printf("1 : gano / 2 : empato / 3 : perdio\n");

            }while(1!=scanf("%d",&R) || (R!=1 && R!=2 && R!=3));
            switch(R){
            case 1:
                ModPJ_sum(&E);
                ModPG_sum(&E);
                ModPuntAct_sum(&E,3);
                break;
            case 2:
                ModPJ_sum(&E);
                ModPE_sum(&E);
                ModPuntAct_sum(&E,1);
                break;
            case 3:
                ModPJ_sum(&E);
                break;
            }
            fecha_act(&E);
            suprimir(l);
            insertar(l,E);
            system("cls");
            fflush(stdin);
            printf("Modificacion Exitosa\n");
            printf("Presione Enter\n");
            getchar();

        }

    }
}
void fecha_act(Equipo *E){
    ModFechaact(E);

}

/*H*/void eliminar_equipo(lista *l,int *cant){
    system("cls");
    Equipo E;
    FILE *fp;
    char ppais[20];
    if(1==isEmpty(*l)){
        printf("No hay datos cargados\n");
        fflush(stdin);
        printf("Presione Enter\n");
        getchar();
    }else{
        printf ("Indique el pais que desea eliminar\n");

        if(1==PaisesDisponibles(l,ppais,1)){
            Buscarpais(l,ppais);
            E=copyy(*l);
            fp=fopen("equipos_elim.txt","a");
            if(fp==NULL){
                printf("NO SE ENCONTRO EL ARCHIVO\n");
            }else{
                fprintf(fp,"Pais: %s\n",Mospais(E)) ;
                fprintf(fp,"Director Tecnico: %s\n",Mosdirector(E));
                fprintf(fp,"Capitan: %s\n",MosCAP(E));
                fprintf(fp,"Grupo: %c\n",Mosgrupo(E));
                fprintf(fp,"Puntaje Actual: %d\n",Mospuntajeact(E));
                switch(Mosfase(E)){
                case 0:
                    fprintf(fp,"Fase: PRIMERA FASE\n");
                    break;
                case 1:
                    fprintf(fp,"Fase: OCTAVOS DE FINAL\n");
                    break;
                case 2:
                    fprintf(fp,"Fase: CUARTOS DE FINAL\n");
                    break;
                case 3:
                    fprintf(fp,"Fase: SEMI FINALES\n");
                    break;
                case 4:
                    fprintf(fp,"Fase: FINAL\n");
                    break;
                }
                fprintf (fp,"Partidos Jugados: %d \n",mosPJ(E));
                fprintf (fp,"Partidos Ganados: %d \n",mosPG(E));
                fprintf (fp,"Partidos Empatados: %d \n",mosPE(E));

                fprintf(fp,"DATOS DE LA FASE ANTERIOR\n");
                fprintf(fp,"GOLEADOR\n");
                fprintf(fp,"Apellido: %s\n",MosGoleador(E).Apell);
                fprintf(fp,"Goles: %d\n",MosGoleador(E).goles);

                fprintf (fp,"Goles a Favor : %d\n",MosAlmg(E,E.fase).GF);
                fprintf (fp,"Goles en Contra: %d\n",MosAlmg(E,E.fase).GC);
                fprintf (fp,"Puntaje Parcial: %d\n",MosAlmg(E,E.fase).Pj);

                fprintf (fp,"\n");
                fclose(fp);
                suprimir(l);
                system("cls");
                printf("%s ELIMINADO CORRECTAMENTE\n",ppais);
                *cant-=1;
                fflush(stdin);
                printf("Presione Enter\n");
                getchar();
            }
        }
    }

}

/*I*/void modificar_fase(lista *l){
    system("cls");
    Equipo E;
    int fase;
    AlmG G;
    char ppais[20];
    if(1==isEmpty(*l)){
        printf("No hay datos cargados\n");
        fflush(stdin);
        printf("Presione Enter\n");
        getchar();
    }
    else{
        printf ("Indique el pais que desea modificar\n");
        if(1==PaisesDisponibles(l,ppais,1)){
            Buscarpais(l,ppais);
            printf("Usted escogio %s\n",ppais);
            E=copyy(*l);
            printf("INGRESE DATOS DE LA FASE\n");
            do{
                fflush(stdin);
                printf("GOLES A FAVOR:\n");
            }while(1!=scanf("%d",&G.GF) || G.GF<0);
            do{
                fflush(stdin);
                printf("GOLES EN CONTRA:\n");
            }while(1!=scanf("%d",&G.GC) || G.GC<0);
            do{
                fflush(stdin);
                printf("PUNTAJE PARCIAL:\n");

            }while(1!=scanf("%d",&G.Pj) || (G.Pj<0 || G.Pj>9));
            ModGolesFase(&E,G,E.fase);
            ModGolesFase(&E,G,E.fase+1);
            modificar_goleador(&E);
            do{
                fflush(stdin);
                printf("INDIQUE LA FASE A LA QUE PASO\n");
                printf("0:PRIMERA FASE / 1:OCTAVOS DE FINAL / 2:CUARTOS DE FINAL / 3:SEMI FINALES / 4:FINAL\n");
            }while(1!=scanf("%d",&fase) || (fase<E.fase || fase>4));
            ModFase(&E,fase);
            fecha_act(&E);
            suprimir(l);
            insertar(l,E);
            system("cls");
            fflush(stdin);
            printf("Modificacion Exitosa\n");
            printf("Presione Enter\n");
            getchar();
        }
    }
}
void modificar_goleador(Equipo *E){
    gdor G;
    printf("Ingrese el Apellido del Goleador\n");
    scanf("%s",G.Apell);
    MAYUS(G.Apell);
    do{
        fflush(stdin);
        printf("Ingrese Cantidad de Goles\n");
    }
    while(1!=scanf("%d",&G.goles) || G.goles<=0 || G.goles>(*E).GolesFase[(*E).fase].GF);
    ModGoleador(E,G);
}

/*J*/void goleadores_act(lista *l){
    Equipo E[32];
    reset(l);
    int mayor=0;
    int i=0,j=0;
    while(0==isoos(*l))
    {
        E[i]=copyy(*l);
        i++;
        forwardd(l);
    }
    for(j; j<i; j++)
    {
        if(E[j].goleador.goles>E[mayor].goleador.goles)
        {
            mayor=j;
        }

    }
    system("cls");
    if(i==0 || 0==MosGoleador(E[mayor]).goles){
        printf("No Hay Datos Cargados\n");
    }
    else{
        printf("Pais: %s\n",Mospais(E[mayor]));
        printf("Apellido: %s\n",MosGoleador(E[mayor]).Apell);
        printf("Goles: %d\n",MosGoleador(E[mayor]).goles);
    }
    fflush(stdin);
    printf("Presione Enter\n");
    getchar();

}

/*K*/void muestra_fecha_act(lista *l){
    system("cls");
    reset(l);
    Equipo E;
    if(1==isEmpty(*l)){
        printf("No hay datos cargados\n");
    }
    else{
    while(0==isoos(*l))
    {
        E=copyy(*l);
        printf("Pais: %s\n",Mospais(E));
        printf ("%d/%d/%d \n",MosFecha(E).dia,MosFecha(E).mes,MosFecha(E).anio);
        printf("\n");
        forwardd(l);
    }
    }
    fflush(stdin);
    printf("Presione Enter\n");
    getchar();

}

/*L*/void almacena_fase(lista *l,mun Am[],mun Eu[],mun Af[],mun As[]){
    system("cls");
    int opc=1;
    if(1==isEmpty(*l)){
        printf("No hay datos cargados\n");
        printf("Presione enter\n");
        fflush(stdin);
        getchar();
    }
    else{
        do
        {
            printf("<1> America\n"
                   "<2> Europa\n"
                   "<3> Africa\n"
                   "<4> Asia\n"
                   "<5> Exit\n");
            scanf("%d",&opc);
        }
        while(opc<1 || opc>5);
        switch(opc)
        {
        case 1:
            busca_continente(l,Am,8);
            break;
        case 2:
            busca_continente(l,Eu,13);
            break;
        case 3:
            busca_continente(l,Af,5);
            break;
        case 4:
            busca_continente(l,As,6);
            break;
        case 5:
            break;
        }
    }
}
void busca_continente(lista *l,mun C[],int n){
    int i=0;
    FILE *fp;
    Equipo E;
    fp=fopen("almacenafase.txt","a");
    if(fp==NULL){
        printf("NO SE PUDO ABRIR EL ARCHIVO\n");
        fflush(stdin);
        getchar();
    }
    else{
        for(i; i<n; i++){
            if(1==Buscarpais(l,C[i].P)){
                E=copyy(*l);
                fprintf(fp,"PAIS: %s\n",Mospais(E));
                switch(Mosfase(E)){
                case 0:
                    fprintf(fp,"Fase: PRIMERA FASE\n");
                    break;
                case 1:
                    fprintf(fp,"Fase: OCTAVOS DE FINAL\n");
                    break;
                case 2:
                    fprintf(fp,"Fase: CUARTOS DE FINAL\n");
                    break;
                case 3:
                    fprintf(fp,"Fase: SEMI FINALES\n");
                    break;
                case 4:
                    fprintf(fp,"Fase: FINAL\n");
                    break;}
                fprintf (fp,"Goles a Favor : %d\n",MosAlmg(E,E.fase).GF);
                fprintf (fp,"Goles en Contra: %d\n",MosAlmg(E,E.fase).GC);
                fprintf (fp,"Puntaje Parcial: %d\n",MosAlmg(E,E.fase).Pj);
                fprintf(fp,"\n");
            }
        }
    }
    fclose(fp);
}

/*M*/void precarga(lista *l,int *cant){
    system("cls");
    int i=*cant;
    FILE *fp;
    Equipo E;
    char pais[20];
    char DT[50];
    char CAP[20];
    char grupo;
    int puntaje;
    fp=fopen("PreCarga.txt","r");
    if(fp==NULL){
        printf("no se encontro el archivo\n");}
    else{
        while((fscanf(fp,"%[^\n]\n %[^\n]\n %[^\n]\n %c\n %d\n ",pais,DT,CAP,&grupo,&puntaje))!=EOF){
            //puedo utilizar \n o %*c no son lo mismo pero funciona igual
            MAYUS(pais);
            if(1==Buscarpais(l,pais)){
                printf("%s ya estaba cargado\n",pais);
            }
            else{
                InPais(&E,pais);
                InDirector(&E,DT);
                InCAP(&E,CAP);
                InGrupo(&E,grupo);
                InPuntAct(&E,puntaje);
                InFase(&E,0);
                fecha_act(&E);
                init_ingreso(&E);
                insertar(l,E);
                i++;
            }
        }
    }
    fclose(fp);
    *cant=i;
    fflush(stdin);
    printf("Precarga Realizada\n");
    printf("Presione Enter\n");
    getchar();
}

/*N*/void partidos_perdidos(lista *l){
    system("cls");
    Equipo E;
    int Pper;
    char ppais[20];
    if(1==isEmpty(*l)){
        printf("No hay datos cargados\n");
        fflush(stdin);
        printf("Presione Enter\n");
        getchar();
    }else{
        printf ("Indique el pais que desea buscar\n");
        if(1==PaisesDisponibles(l,ppais,1)){
            Buscarpais(l,ppais);
            system("cls");
            E=copyy(*l);
            Pper=E.PJ-(E.PG+E.PE);
            printf("Pais: %s\n",Mospais(E));
            printf("Partidos Perdidos: %d\n",Pper);
            fflush(stdin);
            printf("Presione Enter\n");
            getchar();
        }
    }

}

/*<>*/

int main()
{

    int fase;
    int opc=1;
    lista l;
    init(&l);
    int cant=0;

    mun America[8];
    mun Europa[13];
    mun Africa[5];
    mun Asia[6];
    init_continentes(America,Europa,Africa,Asia);
    while(opc>=1 & opc<=13)
    {
        do
        {
            fflush(stdin);
            system("cls");
            printf("BIENVENIDOS A LA COPA DEL MUNDO\n");
            printf("<1>  Cargar Equipos\n"
                   "<2>  Mostrar Datos de un Equipo\n"
                   "<3>  Mostrar Equipos de una Fase\n"
                   "<4>  Mostrar Todos los Goleadores Ordenados Alfabeticamente por Pais\n"
                   "<5>  Mostrar Todos los Equipos Ordenados por Puntaje\n"
                   "<6>  Modificar Puntaje Actual y Cantidad de Partidos Jugados, Ganados o Empatado\n"
                   "<7>  Borrar un Equipo\n"
                   "<8>  Modificar Fase de un Equipo\n"
                   "<9>  Mostrar Goleador Actual\n"
                   "<10> Mostrar Listado de Actualizaciones de Todos los Paises\n"
                   "<11> Almacenar Datos de la Fase de los Paises de un Continente\n"
                   "<12> Realizar una Precarga de los Equipos\n"
                   "<13> Mostrar Partidos Perdidos de un Equipo\n"
                   "<14> Exit\n");

        }
        while((1!=scanf("%d",&opc)) || (opc<1 || opc>14));
        switch(opc)
        {
        case 1:
            CargaLista(&l,&cant);
            break;
        case 2:
            MostrarPais(&l);
            break;
        case 3:
            if(1==isEmpty(l)){
                system("cls");
                printf("No hay datos cargados\n");
                fflush(stdin);
                printf("Presione Enter\n");
                getchar();
            }
            else{
            printf("Indique la Fase de Equipos a Mostrar\n");
            do
            {
                printf("<0> Primera Fase\n"
                       "<1> Octavos de Final\n"
                       "<2> Cuartos de Final\n"
                       "<3> Semi Finales\n"
                       "<4> Final\n");
                scanf("%d",&fase);
            }
            while(fase<0 || fase>4);
            mostrar_todo_fase(&l,fase);}
            break;
        case 4:
            ordenagoleador(&l);
            break;
        case 5:
            ordenar_paises_puntaje(&l);
            break;
        case 6:
            modifica_punt_part(&l);
            break;
        case 7:
            eliminar_equipo(&l,&cant);
            break;
        case 8:
            modificar_fase(&l);
            break;
        case 9:
            goleadores_act(&l);
            break;
        case 10:
            muestra_fecha_act(&l);
            break;
        case 11:
            almacena_fase(&l,America,Europa,Africa,Asia);
            break;
        case 12:
            precarga(&l,&cant);
            break;
        case 13:
            partidos_perdidos(&l);
            break;
        case 14:
            break;
        }
    }
    return 0;
}
