#ifndef TDAPERSONA_H_INCLUDED
#define TDAPERSONA_H_INCLUDED
typedef struct {
char nombre[21];
char apellido[21];
long DNI;
char correo[41];
}persona;
void C_nombre(persona *p,char nom[]){
    strcpy((*p).nombre,nom);}
void C_apellido(persona *p,char apell[]){
    strcpy((*p).apellido,apell);}
void C_DNI(persona *p,long dni){
    (*p).DNI=dni;}
void C_correo(persona *p,char correo[]){
    strcpy((*p).correo,correo);
    strcat((*p).correo,"@gmail.com");}

void Mod_nombre(persona *p,char nom[]){
    strcpy((*p).nombre,nom);}
void Mod_apellido(persona *p,char apell[]){
    strcpy((*p).nombre,apell);}
void Mod_DNI(persona *p,long dni){
    (*p).DNI=dni;}
void Mod_correo(persona *p,char correo[]){
    strcpy((*p).apellido,correo);
    strcat((*p).correo,"@gmail.com");}

char* Mostrarnombre(persona p){
char *aux=(char*)malloc(sizeof(char)*21);
strcpy(aux,p.nombre);
return aux;}
char* Mostrarapellido(persona p){
char *aux=(char*)malloc(sizeof(char)*21);
strcpy(aux,p.apellido);
return aux;}
int Mostrardni(persona p){
return p.DNI;}
char* Mostrarcorreo(persona p){
char *aux=(char*)malloc(sizeof(char)*41);
strcpy(aux,p.correo);
return aux;}

int busca_dni(persona p,long dni){
    if(p.DNI==dni){
        return 1;
        }
return 0;
}

#endif // TDAPERSONA_H_INCLUDED
