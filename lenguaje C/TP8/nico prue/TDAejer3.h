#ifndef PERSONA_H_INCLUDED
#define PERSONA_H_INCLUDED
typedef struct{
    char nomb[21];
    char ape[21];
    int dni;
    char mail[41];
}persona;
char *aux;
void cnombre(persona *p, char nombre[]){
strcpy((*p).nomb,nombre);
}
void capellido(persona *p, char apellido[]){
strcpy((*p).ape,apellido);
}
void cdni(persona *p, int docum){
(*p).dni=docum;
}
void cmail(persona *p,char correo[]){
strcpy((*p).mail,correo);
strcat((*p).mail,"@gmail.com");
}
char* mostrarnombre(persona p){
char *aux=(char*)malloc(sizeof(char)*21);
strcpy(aux,p.nomb);

return aux;
}
char* mostrarapellido(persona p){
char *aux=(char*)malloc(sizeof(char)*21);
strcpy(aux,p.ape);
return aux;
}
int mostrardni(persona p){
return p.dni;
}
char* mostrarcorreo(persona p){
char *aux=(char*)malloc(sizeof(char)*41);
strcpy(aux,p.mail);
return aux;
}










#endif // PERSONA_H_INCLUDED
