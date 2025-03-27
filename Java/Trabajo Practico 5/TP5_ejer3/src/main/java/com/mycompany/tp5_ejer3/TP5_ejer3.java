/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp5_ejer3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TP5_ejer3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> persona = new ArrayList<String>();
        int i,opc=1;
        while(opc!=6){
            do{
                System.out.println("1. Ingrese Nombre:");
                System.out.println("2. Consulta Tamaño:");
                System.out.println("3. Ordena lista:");
                System.out.println("4. Muestra Lista opc1");
                System.out.println("5. Muestra Lista opc2");
                System.out.println("6. Salir");
                opc = teclado.nextInt();
            }while(opc<1 || opc>6);
            switch(opc){
                case 1: ingresaNombre(persona);break;
                case 2: tamaño(persona);break;
                case 3: 
                    if(persona.size()!= 0){
                        ordenaLista(persona);
                        System.out.println("Lista Ordenada[Z-A]");
                    }
                    else{
                        System.out.println("No Hay Nombres Cargados");
                    }break;
                case 4:
                    if(persona.size()!= 0){
                        muestraLista(persona);
                    }
                    else{
                        System.out.println("No Hay Nombres Cargados");
                    }break;
                case 5: 
                    if(persona.size()!= 0){
                        muestraLista2(persona);
                    }
                    else{
                        System.out.println("No Hay Nombres Cargados");
                    }break;
                case 6: break;
                
            }
        }
    }
    
    public static void ingresaNombre(ArrayList<String> persona){
        Scanner teclado = new Scanner(System.in);
        int n,i;
        String nombre;
        do{
            System.out.println("Cuantos nombres desea ingresar?");
            n = teclado.nextInt();
        }while(n<0);
        for(i=0;i<n;i++){
            System.out.println("Ingrese un nombre:");
            nombre = teclado.next();
            persona.add(nombre);
        }
    }
    
    public static void ordenaLista(ArrayList<String> persona){
        Collections.sort(persona);
        Collections.reverse(persona);
    }
    public static void muestraLista2(ArrayList<String> persona){
        int i;
        for(i=0; i<persona.size();i++){
            System.out.println(persona.get(i));
        }
    }
    public static void muestraLista(ArrayList<String> persona){
        for(String i : persona){
            System.out.println(i);
        }
    }
    public static void tamaño(ArrayList<String> persona){
        System.out.println("Tamaño de lista: "+persona.size());
    }
}
