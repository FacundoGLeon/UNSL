#ifndef LISTA_H_INCLUDED
#define LISTA_H_INCLUDED
typedef struct{
    Reserva VIPD;
    struct nodo *sig;
}nodo;
typedef struct{
    nodo *acceso;
    nodo *ant;
    nodo *cur;
}lista;

void init(lista *l){
    (*l).acceso=NULL;
    (*l).ant=NULL;
    (*l).cur=NULL;
}

void insertar(lista *l,Reserva R){
     nodo *N=(nodo*)malloc(sizeof(nodo));
    (*N).VIPD=R;
    if((*l).acceso==(*l).cur){
        (*l).acceso=N;
        (*N).sig=(*l).cur;
        (*l).ant=N;}
    else{
        (*(*l).ant).sig=N;
        (*N).sig=(*l).cur;
        }
    (*l).cur=N;
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
}
Reserva copyy(lista l){
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


#endif // LISTA_H_INCLUDED
