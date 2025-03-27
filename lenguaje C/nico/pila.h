#ifndef PILA_H_INCLUDED
#define PILA_H_INCLUDED
#define max 8
typedef struct{
int entero[max];
int tope;
}pila;

void init(pila *p){
(*p).tope=-1;
}
void push (pila *p, int num){
(*p).tope++;
(*p).entero[(*p).tope]=num;
}
void supress (pila *p){
(*p).tope--;
}
int copyy (pila p){
return p.entero[p.tope];
}
int isEmpty (pila p){
   if(p.tope==-1)
    return 1;
   else{
    return 0;
   }
}
int isFull (pila p){
   if(p.tope>=max)
    return 1;
   else{
    return 0;
   }
}

#endif // PILA_H_INCLUDED
