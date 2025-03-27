#ifndef TDALISTAAUTO_H_INCLUDED
#define TDALISTAAUTO_H_INCLUDED

typedef struct{
    char nombreT[50];
    char marca[15];
    int anio;
    char modelotipo[20];
    char patente[10];
    int kilometraje;
    float precio;}Auto;
typedef struct{
    Auto VIPD;
    struct nodo *sig;
}nodo;
typedef struct{
    nodo *acceso;
    nodo *ant;
    nodo *cur;
    int tamanio;
}lista;

void init(lista *l){
    (*l).tamanio=0;
    (*l).acceso=NULL;
    (*l).ant=NULL;
    (*l).cur=NULL;
}

void insertar(lista *l,Auto a){
     nodo *N=(nodo*)malloc(sizeof(nodo));
    (*N).VIPD=a;
    if((*l).acceso==(*l).cur){
        (*l).acceso=N;
        (*N).sig=(*l).cur;
        (*l).ant=N;}
    else{
        (*(*l).ant).sig=N;
        (*N).sig=(*l).cur;
        (*l).ant=N;
        }
    (*l).tamanio++;
}
void suprimir(lista *l){
    if((*l).acceso==(*l).cur){
        (*l).cur=(*(*l).acceso).sig;
        (*l).ant=(*l).cur;
        free((void*)(*l).acceso);
        (*l).acceso=(*l).cur;}
    else{
        (*l).cur=(*(*l).cur).sig;
        free((void*)(*(*l).ant).sig);
        (*(*l).ant).sig=(*l).cur;
    }
    (*l).tamanio--;
}
Auto copyy(lista l){
    return (*(l).cur).VIPD;
}

void reset(lista *l){
    (*l).ant=(*l).acceso;
    (*l).cur=(*l).acceso;
}

void forwardd(lista *l){
    (*l).ant=(*l).cur;
    (*l).cur=(*(*l).cur).sig;
}

int isEmpty(lista l){
    if(l.acceso==NULL){
        return 1;
    }
    return 0;
}
int isFull(){
    nodo *d;
    if(d=(nodo*)malloc(sizeof(nodo))==NULL){
        return 1;}
    else{
    return 0;}
    free((void*)d);
}

int isoos(lista l){
    if(l.cur==NULL){
        return 1;
    }
    return 0;
}


#endif // TDALISTAAUTO_H_INCLUDED
