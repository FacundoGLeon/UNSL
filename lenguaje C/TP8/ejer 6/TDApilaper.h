#ifndef TDAPILAPER_H_INCLUDED
#define TDAPILAPER_H_INCLUDED
#define max 100
typedef struct {
char nombre[21];
char apellido[21];
long DNI;
char correo[41];
}persona;
typedef struct {
persona elemento[max];
int tope;
}pila;
/*pila*/
void init(pila *p){
    (*p).tope=-1;
}
void ingresar(pila *per,persona p){
    (*per).tope++;
    (*per).elemento[(*per).tope]=p;
 }

void suprimir(pila *p){
    (*p).tope--;
 }

 persona copyy(pila p){
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
/*persona*/



#endif // TDAPILAPER_H_INCLUDED
