/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejer15;

import java.util.Scanner;

public class TP1_ejer15 {

    public static void main(String[] args) {
        boolean [][] asientos = new boolean[4][20];
        inicializacion(asientos);
        int opcion = 1;
        while(opcion >= 1 && opcion <=4){
        do{
        System.out.println("Elige Opcion:");
                System.out.println( "<1> Reservar.");
                System.out.println( "<2> Cancelar.");
                System.out.println( "<3> Ver Asientos Disponibles.");
                System.out.println( "<4> Ver Asientos Ocupado.");
                System.out.println( "<5> Exit.");
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.nextInt();
        }while(opcion<1 || opcion>5);
        
        switch(opcion){
            case 1 :reserva_cancelacion(asientos, false);break;
            case 2 : reserva_cancelacion(asientos, true);break;
            case 3 : System.out.println("Asientos Disponibles:");
            disponibilidad(asientos,true);break;
            case 4 :System.out.println("Asientos Ocupados:");
            disponibilidad(asientos,false);break;
            case 5 : 
        
        }
        
        }
    }
    
    public static void inicializacion(boolean [][] asientos){
        int i,j;
        for(i=0;i<asientos.length;i++){
            for(j=0;j<asientos[i].length;j++){
                asientos [i][j] = true;
            }
        } 
    
    
    }
    
     public static void reserva_cancelacion(boolean [][] asientos, boolean opc){
         int i,j;
         Scanner teclado = new Scanner(System.in);
         do{
             System.out.println("Ingresar Fila del Asiento: "
                     + "0-3");
             i=teclado.nextInt();
         }while(i<0 || i>3);
         do{
             System.out.println("Ingresar Columna del Asiento: "
                     + "0-24");
             j=teclado.nextInt();
         }while(i<0 || i>24);
         
         asientos [i][j] = opc;
     
     
     }
    
    
    public static void disponibilidad(boolean [][] asientos, boolean opc){
        int i, j;
        
        for(i=0;i<asientos.length;i++){
            for(j=0;j<asientos[i].length;j++){
                if(asientos[i][j]==opc){
                    System.out.println(i+"."+j);
                 
                }
            }
        }  
    }
    
}
