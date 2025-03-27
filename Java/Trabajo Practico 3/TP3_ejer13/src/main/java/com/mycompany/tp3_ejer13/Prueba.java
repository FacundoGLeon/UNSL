/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_ejer13;

/**
 *
 * @author USUARIO
 */
public class Prueba {
    static BlocNotas bloc;
    
    private static void pInsertar(Nota nota){
        
        bloc.insertar(nota);
        
    }
    private static void pMostrarNotas(){
        bloc.mostrarNotas();
    }
    private static int pMuestraCantidad() {
        return bloc.getPosicion();
    }
    private static void pEliminaNota(int pos){
        bloc.eliminar(pos);
    }
    public static void prueba(){
        bloc = new BlocNotas();
        Nota nota = new Nota(1,"Nota de prueba 1");
        Nota nota2 = new Nota(2,"Nota de prueba 2");
        pInsertar(nota);
        pInsertar(nota2);
        System.out.println("Cantidad de notas: "+pMuestraCantidad());
        pMostrarNotas();
        System.out.println("Elimino nota");
        pEliminaNota(1);
        System.out.println("Cantidad de notas: "+pMuestraCantidad());
        pMostrarNotas();
        System.out.println("Elimino nota");
        pEliminaNota(0);
        System.out.println("Cantidad de notas: "+pMuestraCantidad());
    }
}
