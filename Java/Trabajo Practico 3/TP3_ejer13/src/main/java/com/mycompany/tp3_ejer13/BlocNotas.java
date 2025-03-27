/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_ejer13;

/**
 *
 * @author USUARIO
 */

public class BlocNotas {
    private int posicion;
    private Nota [] nota;
    
    public BlocNotas(){
        posicion=0;
        nota = new Nota[100];
    }
    public void insertar(Nota not){
        nota[posicion] = not;
        posicion ++;
    }
    public int buscarNota(int ident){
        int i,pos = -1;
        for(i=0;i<posicion;i++){
            if(nota[i].getIdentificador()== ident){
                pos = i;
            }
        }
        
        return pos;
    }
    public void eliminar(int pos){
        int j;
        if(pos==posicion-1){
            
        }
        else{
            for(j=pos;j<posicion;j++){
                nota[j]=nota[j+1];
            }
        }    
        posicion--;
    }
    public void mostrarNotas(){
        int i;
        for(i=0;i<posicion;i++){
            System.out.println(nota[i].toString());
            
        }
    }

    public int getPosicion() {
        return posicion;
    }
    
}
