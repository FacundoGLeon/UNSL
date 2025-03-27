/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp5_ejer5;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TP5_ejer5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<Integer,String> persona = new HashMap<Integer,String>();
        int i,opc=1;
        while(opc!=6){
            do{
                System.out.println("1. Ingresa Persona:");
                System.out.println("2. Consulta Tamaño:");
                System.out.println("3. Muestra Una Persona::");
                System.out.println("4. Muestra todas las personas:");
                System.out.println("5. Elimina Persona:");
                System.out.println("6. Salir.");
                opc = teclado.nextInt();
            }while(opc<1 || opc>6);
            switch(opc){
                case 1: ingresar(persona);break;
                case 2: System.out.println("Tamaño: "+persona.size());break;
                case 3: 
                    if(persona.size()!= 0){
                        mostrar(persona);
                        
                    }
                    else{
                        System.out.println("No Hay Datos Cargados");
                    }break;
                case 4:
                    if(persona.size()!= 0){
                        muestraTodo(persona);
                    }
                    else{
                        System.out.println("No Hay Datos Cargados");
                    }break;
                case 5: 
                    if(persona.size()!= 0){
                        eliminar(persona);
                    }
                    else{
                        System.out.println("No Hay Datos Cargados");
                    }break;
                case 6: break;
                
            }
        }
    }
    public static void ingresar(HashMap <Integer,String> persona){
        Scanner teclado = new Scanner(System.in);
        int dni;
        String nombre;
        System.out.println("Ingrese el DNI: ");
        dni = teclado.nextInt();
        System.out.println("Ingrese el Nombre: ");
        nombre = teclado.next();
        persona.put(dni,nombre);
        
    }
    public static void mostrar(HashMap <Integer,String> persona){
        Scanner teclado = new Scanner(System.in);
        int dni;
        System.out.println("Ingrese el DNI de la persona que desea mostrar: ");
        dni = teclado.nextInt();
        if(persona.containsKey(dni)){
            System.out.println("DNI: "+dni+" / Nombre: "+persona.get(dni));
        }
        else{
            System.out.println("La Persona con DNI "+dni+" no se Encuentra Cargada.");
        }
    }
    public static void eliminar(HashMap<Integer,String> persona){
        Scanner teclado = new Scanner(System.in);
        int dni;
        System.out.println("Ingrese el DNI de la persona que desea Eliminar: ");
        dni = teclado.nextInt();
        if(persona.containsKey(dni)){
            persona.remove(dni);
            System.out.println("Eliminado Correctamente");
        }
        else{
            System.out.println("La Persona con DNI "+dni+" no se Encuentra Cargada.");
        }
    }
    public static void muestraTodo(HashMap<Integer,String> persona){
        for(int i : persona.keySet()){
            System.out.println("DNI: "+i+" / Nombre: "+persona.get(i));
        }
        
    }
}
