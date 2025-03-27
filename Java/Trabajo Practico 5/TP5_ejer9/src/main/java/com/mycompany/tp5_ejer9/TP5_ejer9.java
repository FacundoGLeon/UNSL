/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp5_ejer9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TP5_ejer9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Persona> persona = new ArrayList<Persona>();
        int opc=1;
        while(opc!=6){
            do{
                System.out.println("1. Ingrese Persona:");
                System.out.println("2. Consulta Tamaño:");
                System.out.println("3. Ordena lista:");
                System.out.println("4. Muestra Lista opc1");
                System.out.println("5. Muestra Lista opc2");
                System.out.println("6. Salir");
                opc = teclado.nextInt();
            }while(opc<1 || opc>6);
            switch(opc){
                case 1: ingresaPersona(persona);break;
                case 2: tamaño(persona);break;
                case 3: 
                    if(persona.size()!= 0){
                        Collections.sort(persona);
                        
                        System.out.println("Lista Ordenada por edad");
                    }
                    else{
                        System.out.println("No Hay Personas Cargadas");
                    }break;
                case 4:
                    if(persona.size()!= 0){
                        muestraLista(persona);
                    }
                    else{
                        System.out.println("No Hay Personas Cargadas");
                    }break;
                case 5: 
                    if(persona.size()!= 0){
                        muestraLista2(persona);
                    }
                    else{
                        System.out.println("No Hay Personas Cargadas");
                    }break;
                case 6: break;
                
            }
        }
        
    }
    public static void ingresaPersona(ArrayList<Persona> persona){
        Scanner teclado = new Scanner(System.in);
        int n,i;
        String nombre, apellido;
        int edad;
        do{
            System.out.println("Cuantas Personas desea ingresar?");
            n = teclado.nextInt();
        }while(n<0);
        for(i=0;i<n;i++){
            System.out.println("Ingrese un nombre:");
            nombre = teclado.next();
            teclado.nextLine();
            System.out.println("Ingrese un apellido:");
            apellido = teclado.next();
            teclado.nextLine();
            System.out.println("Ingrese su edad:");
            edad = teclado.nextInt();
            teclado.nextLine();
            persona.add(new Persona(nombre,apellido,edad));
        }
    }
    public static void ordenaLista(ArrayList<Persona> persona){
        Collections.sort(persona);
        
    }
    public static void muestraLista2(ArrayList<Persona> persona){
        int i;
        for(i=0; i<persona.size();i++){
           persona.get(i).mostrarPersona();
           System.out.println("");
        }
    }
    public static void muestraLista(ArrayList<Persona> persona){
        for(Persona i : persona){
            System.out.println(i);
        }
    }
     public static void tamaño(ArrayList<Persona> persona){
        System.out.println("Tamaño de lista: "+persona.size());
    }
}
