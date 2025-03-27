#ifndef TDAFRACCION_H_INCLUDED
#define TDAFRACCION_H_INCLUDED
typedef struct {
    int num;
    int den;
}Fraccion;

void C_Numerador(Fraccion *f,int num){
    (*f).num=num;}
void C_Denominador(Fraccion *f,int den){
    (*f).den=den;}
void suma(Fraccion F1,Fraccion F2,Fraccion *FT){
    (*FT).num=((F1.den*F2.num)+(F2.den*F1.num));
    (*FT).den=(F1.den*F2.den);
}
void resta(Fraccion F1,Fraccion F2,Fraccion *FT){
    (*FT).den=(F1.den*F2.den);
    (*FT).num=((F1.den*F2.num)-(F2.den*F1.num));
}
void multiplicacion(Fraccion F1,Fraccion F2,Fraccion *FT){
    (*FT).den=(F1.den*F2.den);
    (*FT).num=(F1.num*F2.num);
}
void division(Fraccion F1,Fraccion F2,Fraccion *FT){
    (*FT).num=(F1.num*F2.den);
    (*FT).den=(F1.den*F2.num);
}

int muestranumerador(Fraccion F1){
    return F1.num;
}
int muestradenominador(Fraccion F1){
    return F1.den;
}

void simplificar(Fraccion *FT){
    int simp=1,i;
    while(simp==1){
        simp=0;
        for(i=2;i<10;i++){
            if((0==(*FT).den%i) && (0==(*FT).num%i)){
                (*FT).den=(*FT).den/i;
                (*FT).num=(*FT).num/i;
                simp=1;
            }
        }
    }
}
#endif // TDAFRACCION_H_INCLUDED
