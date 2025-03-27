#ifndef TDAPILA_H_INCLUDED
#define TDAPILA_H_INCLUDED
#define max 100
typedef struct {
int elemento[max];
int tope;
}pila;

void init(pila *p){
    (*p).tope=-1;
}
void push(pila *p,int n){
    (*p).tope++;
    (*p).elemento[(*p).tope]=n;
 }

void suppress(pila *p){
    (*p).tope--;
 }

int copia(pila p){
    return p.elemento[p.tope];
}

int isEmpty(pila p){
    if(p.tope==-1){
        return 1;
    }
    else{
        return 0;
    }
}

int isFull(pila p){
    if(p.tope>=max){
        return 1;
    }
    else{
        return 0;
    }

}

#endif // TDAPILA_H_INCLUDED
