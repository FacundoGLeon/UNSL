#ifndef EQUIPOS_H_INCLUDED
#define EQUIPOS_H_INCLUDED
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

/*INGRESAR*/
void InPais(Equipo *E,char P[]){
    strcpy((*E).pais,P);
}
void InDirector(Equipo *E,char D[]){
    strcpy((*E).director,D);
}
void InCAP(Equipo *E,char C[]){
    strcpy((*E).CAP,C);
}
void InGrupo(Equipo *E,char G){
    (*E).grupo=G;
}
void InPuntAct(Equipo *E,int P){
    (*E).PuntajeAct=P;
}
void InGoleador(Equipo *E,gdor G){
    (*E).goleador=G;
}
void InFase(Equipo *E,int F){
    (*E).fase=F;
}
void InGolesFase(Equipo *E,AlmG G){
    (*E).GolesFase[(*E).fase]=G;
}
void InFechaact(Equipo *E,fecha F){
    time_t tiempoahora;
    time(&tiempoahora);
    struct tm *tiempo=localtime(&tiempoahora);
    (*E).FechaAct.dia=(*tiempo).tm_mday;
    (*E).FechaAct.dia=(*tiempo).tm_mon+1;
    (*E).FechaAct.dia=(*tiempo).tm_year+1900;
}
void InPJ(Equipo *E,int PJ){
    (*E).PJ=PJ;
}
void InPG(Equipo *E,int PG){
    (*E).PG=PG;
}
void InPE(Equipo *E,int PE){
    (*E).PE=PE;
}

/*MODIFICAR*/

void ModPuntAct_sum(Equipo *E,int P){
    (*E).PuntajeAct+=P;
}
void ModGoleador(Equipo *E,gdor G){
    (*E).goleador=G;
}
void ModFase(Equipo *E,int F){
    (*E).fase=F;
}
void ModGolesFase(Equipo *E,AlmG G,int i){
    (*E).GolesFase[i]=G;
}
void ModFechaact(Equipo *E){
    time_t tiempoahora;
    time(&tiempoahora);
    struct tm *tiempo=localtime(&tiempoahora);
    (*E).FechaAct.dia=(*tiempo).tm_mday;
    (*E).FechaAct.mes=(*tiempo).tm_mon+1;
    (*E).FechaAct.anio=(*tiempo).tm_year+1900;
}
void ModPJ_sum(Equipo *E){
    (*E).PJ++;
}
void ModPG_sum(Equipo *E){
    (*E).PG++;
}
void ModPE_sum(Equipo *E){
    (*E).PE++;
}

/* MOSTRAR */

char* Mospais (Equipo E){
char *aux=(char*)malloc(sizeof(char)*20);
strcpy(aux,E.pais);
return aux;
}

char* Mosdirector (Equipo E){
char *aux=(char*)malloc(sizeof(char)*50);
strcpy(aux,E.director);
return aux;
}

char* MosCAP(Equipo E){
char *aux=(char*)malloc(sizeof(char)*20);
strcpy(aux,E.CAP);
return aux;
}

char* Mosgrupo(Equipo E){
char *aux=(char*)malloc(sizeof(char));
aux=E.grupo;
return aux;
}

int Mospuntajeact (Equipo E){
return E.PuntajeAct;
}

gdor MosGoleador (Equipo E){
return E.goleador;
}

int Mosfase (Equipo E){
return E.fase;
}

AlmG MosAlmg (Equipo E,int i){
    return E.GolesFase[i];
}
fecha MosFecha(Equipo E){
    return E.FechaAct;
}

int mosPJ (Equipo E){
return E.PJ;
}

int mosPG (Equipo E){
return E.PG;
}

int mosPE (Equipo E){
return E.PE;
}

/*AUXILIAR
int buscapais(Equipo E,char pais[]){

if (0==strcmp(pais,E.pais)){
    return 1;
}
else {
    return 0;
}
}*/




#endif // EQUIPOS_H_INCLUDED
