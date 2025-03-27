#ifndef TDAAUTO_H_INCLUDED
#define TDAAUTO_H_INCLUDED
#include <strings.h>
typedef struct{
    char nombreT[31];
    char marca[15];
    int anio;
    char modelotipo[20];
    char patente[10];
    int kilometraje;
    float precio;}Auto;

void c_nombre(Auto *a,char nombre[]){
    strcpy((*a).nombreT,nombre);}
void c_marca(Auto *a,char marca[]){
    strcpy((*a).marca,marca);}
void c_anio(Auto *a,int anio){
    (*a).anio=anio;}
void c_modelo(Auto *a,char modelotipo[]){
    strcpy((*a).modelotipo,modelotipo);}
void c_patente(Auto *a,char patente[]){
    strcpy((*a).patente,patente);}
void c_kilomtraje(Auto *a,int kilometraje){
    (*a).kilometraje=kilometraje;}
void c_precio(Auto *a,float precio){
    (*a).precio=precio;}

char* M_nombre(Auto a){
    char *aux=(char*)malloc(sizeof(char)*31);
    strcpy(aux,a.nombreT);
    return aux;}
char* M_marca(Auto a){
    char *aux=(char*)malloc(sizeof(char)*15);
    strcpy(aux,a.marca);
    return aux;}
int M_anio(Auto a){
    return a.anio;}
char* M_modelo(Auto a){
    char *aux=(char*)malloc(sizeof(char)*20);
    strcpy(aux,a.modelotipo);
    return aux;}
char* M_patente(Auto a){
    char *aux=(char*)malloc(sizeof(char)*10);
    strcpy(aux,a.patente);
    return aux;}
int M_kilometraje(Auto a){
    return a.kilometraje;}
float M_precio(Auto a){
    return a.precio;}

void Mod_Nombre(Auto *a,char nombre[]){
    strcpy((*a).nombreT,nombre);}
void Mod_kilomtraje(Auto *a,int kilometraje){
    (*a).kilometraje=kilometraje;}
void Mod_precio(Auto *a,float precio){
    (*a).precio=precio;}

#endif // TDAAUTO_H_INCLUDED
