#ifndef TDAFILA_H_INCLUDED
#define TDAFILA_H_INCLUDED
#define max 100
typedef struct {
int elemento[max];
int ultimo;
}fila;

void init(fila *f){
    (*f).ultimo=-1;
}
void push(fila *f,int n){
    (*f).ultimo++;
    (*f).elemento[(*f).ultimo]=n;
 }

void suppress(fila *f){
    int i=0;
    for(i=0;i<(*f).ultimo;i++){
        (*f).elemento[i]=(*f).elemento[i+1];
    }
    (*f).ultimo--;
 }

int copia(fila f){
    return f.elemento[0];
}

int isEmpty(fila f){
    if(f.ultimo==-1){
        return 1;
    }
    else{
        return 0;
    }
}

int isFull(fila f){
    if(f.ultimo>=max){
        return 1;
    }
    else{
        return 0;
    }

}


#endif
