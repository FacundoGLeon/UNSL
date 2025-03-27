/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp3_ejer13;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TP3_ejer13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        BlocNotas bloc = new BlocNotas();
        int opc=1,cont=0;
        while(opc != 6){
            do{
                System.out.println("1. Ingresar Nota");
                System.out.println("2. Mostrar Notas");
                System.out.println("3. Eliminar Nota");
                System.out.println("4. Consultar Cantidad de Notas");
                System.out.println("5. Prueba de Bloc");
                System.out.println("6. Exit");
                opc = teclado.nextInt();
            }while(opc<1 || opc>6);
            switch(opc){
                case 1: cont = ingresaNota(bloc,cont); break;
                case 2: 
                    if(bloc.getPosicion() == 0){
                        System.out.println("No Hay Ninguna Nota Cargada");
                    }
                    else{
                        mostrarNotas(bloc);
                    }break;
                case 3: 
                    if(bloc.getPosicion() == 0){
                        System.out.println("No Hay Ninguna Nota Cargada");
                    }
                    else{
                        eliminarNota(bloc);
                    }break;
                case 4: 
                    System.out.println("Cantidad de Notas Cargadas: "+bloc.getPosicion());
                    break;
                case 5: 
                    Prueba.prueba();
                    break;
                default: break;
            }
        }
    }
    public static int ingresaNota(BlocNotas bloc, int cont){
        Scanner teclado = new Scanner(System.in);
        Nota nota;
        int i,n;
        String not;
        do{
          System.out.println("Cuantas Notas Desea Ingresar");  
          n = teclado.nextInt();
        }while(n<0 || n>20);
        for(i=cont;i<cont+n;i++){
            teclado.nextLine();
            System.out.println("Identificador de nota: "+(i+1)); 
            System.out.println("Ingrese la nota:");
            not = teclado.nextLine();
            
            nota = new Nota(i+1,not);
            bloc.insertar(nota);
        }
        return cont+n;
    }
    
    public static void mostrarNotas(BlocNotas bloc){
        bloc.mostrarNotas();
    }
    public static void eliminarNota(BlocNotas bloc){
        Scanner teclado = new Scanner(System.in);
        int ident;
        System.out.println("Ingrese Identificador de la Nota que Desea Eliminar");
        ident = teclado.nextInt();
        
        if(bloc.buscarNota(ident)!=-1){
            bloc.eliminar(bloc.buscarNota(ident));
            System.out.println("Nota Eliminada");
        }
        else{
            System.out.println("La Nota no se Encuentra Cargada");
        }
    }
            
}
