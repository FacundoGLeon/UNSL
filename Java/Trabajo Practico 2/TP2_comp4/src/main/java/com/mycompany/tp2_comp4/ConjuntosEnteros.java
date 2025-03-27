/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_comp4;


public class ConjuntosEnteros {
    private static int MAX = 100;
    private static int contConj=0;
    private int [] enteros;
    private int tam;
    
    public ConjuntosEnteros(){
        enteros = new int[MAX];
        tam=0;
    }
    
    public ConjuntosEnteros(int[] enter) {
        enteros = new int[MAX];
        contConj++;
        tam=0;
        int i,j,cont;
        for(i=0;i<enter.length;i++){
            cont=0;
            for(j=0;j<tam;j++){
                if(enter[i]==enteros[j]){
                    cont=1;
                }
            }
            if(cont==0){
                enteros[tam]=enter[i];
                tam++;
            }
        }
    }

    public int[] getEnteros() {
        return enteros;
    }
    public int getEnteros(int i){
        return enteros[i];
    }
    public int getTam() {
        return tam;
    }

    public static int getContConj() {
        return contConj;
    }

    
    
    public void agregarEntero(int n){
        int i,cont=0;
        for(i=0;i<tam;i++){
            if(enteros[i]==n){
                cont=1;
            }
        }
        if(cont==0){
            enteros[tam]=n;
            tam++;
        }
    }
    public void eliminarEntero(int n){
        int i=0,j,cont=0;
        while(cont==0 && i<tam){
            if(enteros[i]==n){
                cont=1;
            }
            i++;
        }
        if(cont==1){
            for(j=i;j<tam;j++){
                enteros[j-1]=enteros[j];
        }
            tam--;
        }
    }
    public boolean consultarEntero(int n){
        int i,cont=0;
        for(i=0;i<tam;i++){
            if(enteros[i]==n){
                cont=1;
            }
        }
        return (cont==1)?true:false;
    }
    public static ConjuntosEnteros interseccion(ConjuntosEnteros conj1,ConjuntosEnteros conj2){
        ConjuntosEnteros conjInt = new ConjuntosEnteros();
        int i,j,n;
        for(i=0;i<conj1.tam;i++){
            for(j=0;j<conj2.tam;j++){
                if(conj1.enteros[i]==conj2.enteros[j]){
                    n=conj1.enteros[i];
                    conjInt.agregarEntero(n);
                }
            }
        }
        return conjInt;
    }
    public static ConjuntosEnteros union(ConjuntosEnteros conj1,ConjuntosEnteros conj2){
        ConjuntosEnteros conjUn = new ConjuntosEnteros();
        int i,n;
        for(i=0;i<conj1.tam;i++){
            n=conj1.enteros[i];
            conjUn.agregarEntero(n);
        }
        for(i=0;i<conj2.tam;i++){
            n=conj2.enteros[i];
            conjUn.agregarEntero(n);
        }
        return conjUn;
    }
    
}
