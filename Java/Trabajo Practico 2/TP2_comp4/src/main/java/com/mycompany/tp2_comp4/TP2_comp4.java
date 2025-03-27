/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp2_comp4;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class TP2_comp4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConjuntosEnteros conj1 = new ConjuntosEnteros();
        ConjuntosEnteros conj2 = new ConjuntosEnteros();
       
        
        
        int opcion=1;
        while(opcion!=8){
            do{
                System.out.println("Elija Opcion:");
                System.out.println("<1> Crear un Conjunto.");
                System.out.println("<2> Mostrar Contenido del Conjunto.");
                System.out.println("<3> Agregar Entero.");
                System.out.println("<4> Eliminar Entero.");
                System.out.println("<5> Consultar Entero.");
                System.out.println("<6> Interseccion.");
                System.out.println("<7> Union.");
                System.out.println("<8> Exit.");
                opcion = teclado.nextInt();
            }while(opcion<1 || opcion>8);
            switch(opcion){
                case 1: 
                    if(ConjuntosEnteros.getContConj()==0){
                       crearConjunto(conj1);
                    }
                    else{
                        if(ConjuntosEnteros.getContConj()==1){
                            crearConjunto(conj2);
                        }
                        else{
                            System.out.println("Solo Puede Crear Hasta 2 Conjuntos.");
                        }
                    }break;
                case 2: 
                    mostrarConjunto(conj1,conj2);
                    break;
                case 3: 
                    agregarEntero(conj1,conj2);
                    break;
                case 4: 
                    eliminarEntero(conj1,conj2);
                    break;
                case 5:
                    consultarEntero(conj1,conj2);
                    break;
                case 6: 
                    if(ConjuntosEnteros.getContConj()!=2){
                        System.out.println("Debes Crear Dos Conjuntos.");
                    }
                    else{
                        interseccion(conj1,conj2);
                    }
                    break;
                case 7:
                    if(ConjuntosEnteros.getContConj()!=2){
                        System.out.println("Debes Crear Dos Conjuntos.");
                    }
                    else{
                        union(conj1,conj2);
                    }
                    break;
                default: break;
            }
        }
        
    }
    
    public static void crearConjunto(ConjuntosEnteros conj){
        Scanner teclado = new Scanner(System.in);
        int n,i;
        do{
           System.out.println("De Cuantos Numeros Quiere Crear su Conjunto?");
           n = teclado.nextInt();
        }while(n<0 || n>50);
        int [] enter = new int[n];
        for(i=0;i<n;i++){
            System.out.println("Ingrese Entero:");
            enter[i] = teclado.nextInt();
            conj.agregarEntero(enter[i]);
        }
        conj = new ConjuntosEnteros(enter);
    }
    
    public static void mostrarConjunto(ConjuntosEnteros conj1,ConjuntosEnteros conj2){
        Scanner teclado = new Scanner(System.in);
        int n,opcion,i;
        if(ConjuntosEnteros.getContConj()==0){
            System.out.println("Debes Crear al Menos un Conjunto.");
        }
        else{
            if(ConjuntosEnteros.getContConj()==1){
                System.out.println("Elementos del Conjunto: ");
        System.out.print("{");
        for(i=0;i<conj1.getTam();i++){
            System.out.print(" "+conj1.getEnteros(i)+",");
        }
        System.out.print("}");
        System.out.println("");
            }
            else{
                do{
                    System.out.println("De que conjunto quiere mostrar sus elementos?");
                    System.out.println("conjunto 1 o conjunto 2");
                    opcion = teclado.nextInt();
                }while(opcion<1 || opcion>2);
                if(opcion==1){
                    System.out.println("Elementos del Conjunto: ");
                    System.out.print("{");
                    for(i=0;i<conj1.getTam();i++){
                        System.out.print(" "+conj1.getEnteros(i)+",");
                    }
                    System.out.print("}");
                    System.out.println("");
                }
                else{
                    System.out.println("Elementos del Conjunto: ");
                    System.out.print("{");
                    for(i=0;i<conj2.getTam();i++){
                        System.out.print(" "+conj2.getEnteros(i)+",");
                    }
                System.out.print("}");
                System.out.println("");
                }
            }
        }
    }
    
    public static void agregarEntero(ConjuntosEnteros conj1,ConjuntosEnteros conj2){
        Scanner teclado = new Scanner(System.in);
        int n,opcion;
        if(ConjuntosEnteros.getContConj()==0){
            System.out.println("Debes Crear al Menos un Conjunto.");
        }
        else{
            System.out.println("Ingrese el numero que desea agregar");
            n = teclado.nextInt();
            if(ConjuntosEnteros.getContConj()==1){
                conj1.agregarEntero(n);
            }
            else{
                do{
                    System.out.println("A cual conjunto desea agregar el entero?");
                    System.out.println("conjunto 1 o conjunto 2");
                    opcion = teclado.nextInt();
                }while(opcion<1 || opcion>2);
                if(opcion==1){
                    conj1.agregarEntero(n);
                }
                else{
                    conj2.agregarEntero(n);
                }
            }
        }
    }
    
    public static void eliminarEntero(ConjuntosEnteros conj1,ConjuntosEnteros conj2){
        Scanner teclado = new Scanner(System.in);
        int n,opcion;
        if(ConjuntosEnteros.getContConj()==0){
            System.out.println("Debes Crear al Menos un Conjunto.");
        }
        else{
            System.out.println("Ingrese el numero que desea eliminar");
            n = teclado.nextInt();
            if(ConjuntosEnteros.getContConj()==1){
                conj1.eliminarEntero(n);
            }
            else{
                do{
                    System.out.println("A cual conjunto desea eliminar el entero?");
                    System.out.println("conjunto 1 o conjunto 2");
                    opcion = teclado.nextInt();
                }while(opcion<1 || opcion>2);
                if(opcion==1){
                    conj1.eliminarEntero(n);
                }
                else{
                    conj2.eliminarEntero(n);
                }
            }
        }
    }
    
    public static void consultarEntero(ConjuntosEnteros conj1,ConjuntosEnteros conj2){
        Scanner teclado = new Scanner(System.in);
        int n,opcion;
        if(ConjuntosEnteros.getContConj()==0){
            System.out.println("Debes Crear al Menos un Conjunto.");
        }
        else{
            System.out.println("Ingrese el numero que desea consultar");
            n = teclado.nextInt();
            if(ConjuntosEnteros.getContConj()==1){
                System.out.println("El numero "+n+(true==conj1.consultarEntero(n)?" Si Existe":" No Existe")+" en el Conjunto.");
            }
            else{
                do{
                    System.out.println("A cual conjunto desea consultar el entero?");
                    System.out.println("conjunto 1 o conjunto 2");
                    opcion = teclado.nextInt();
                }while(opcion<1 || opcion>2);
                if(opcion==1){
                    System.out.println("El numero "+n+(true==conj1.consultarEntero(n)?" Si Existe":" No Existe")+" en el Conjunto.");
                }
                else{
                    System.out.println("El numero "+n+(true==conj2.consultarEntero(n)?" Si Existe":" No Existe")+" en el Conjunto.");
                }
            }
        }
    
    }
    
    public static void interseccion(ConjuntosEnteros conj1,ConjuntosEnteros conj2){
        ConjuntosEnteros conjInt =  ConjuntosEnteros.interseccion(conj1,conj2);
        int i;
        System.out.println("Elementos del Conjunto Interseccion: ");
        System.out.print("{");
        for(i=0;i<conjInt.getTam();i++){
            System.out.print(" "+conjInt.getEnteros(i)+",");
        }
        System.out.println("}");
    }
    
    public static void union(ConjuntosEnteros conj1,ConjuntosEnteros conj2){
        ConjuntosEnteros conjUn =  ConjuntosEnteros.union(conj1,conj2);
        int i;
        System.out.println("Elementos del Conjunto Union: ");
        System.out.print("{");
        for(i=0;i<conjUn.getTam();i++){
            System.out.print(" "+conjUn.getEnteros(i)+",");
        }
        System.out.print("}");
        System.out.println("");
    }
}
