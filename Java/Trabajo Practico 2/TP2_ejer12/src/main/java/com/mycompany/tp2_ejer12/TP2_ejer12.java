/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp2_ejer12;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TP2_ejer12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Password pas = new Password();
        int opcion=1;
        while(opcion!=3){
            do{
                System.out.println("1. INGRESAR CONTRASEÑA");
                System.out.println("2. CREAR CONTRASEÑA");
                System.out.println("3. SALIR");
                opcion = teclado.nextInt();
            }while(opcion<1 || 3<opcion);
            switch(opcion){
                case 1: ingresarContraseña(pas);break;
                case 2: generaRandom(pas);break;
                default: break; 
            }
        }
        
    }
    
    public static void ingresarContraseña(Password pas){
        Scanner teclado = new Scanner(System.in);
        int longitud;
        String contraseña;
        do{
            System.out.println("INDIQUE LONGITUD DE CONTRASEÑA");
            System.out.println("[8,15]");
            longitud = teclado.nextInt();   
        }while(longitud<8 || 15<longitud);
        pas = new Password(longitud);
        do{
            System.out.println("INGRESE CONTRASEÑA DE "+longitud+" CARACTERES");
            contraseña = teclado.next();   
        }while(contraseña.length()!=longitud);
        
        do{
            if(Password.esSegura(contraseña)){
                System.out.println("");
            }
            else{
                do{
                    System.out.println("INGRESE UNA CONTRASEÑA MAS SEGURA DE "+longitud+" CARACTERES");
                    System.out.println("DEBE TENER: 2 MAYUSCULAS, MAS DE 1 MINUSCULA, MAS DE 3 NUMEROS.");
                    contraseña = teclado.next();   
                }while(contraseña.length()!=longitud);
            }
        }while(!(Password.esSegura(contraseña)));
        System.out.println("CONTRASEÑA SEGURA");
        pas.setContraseña(contraseña);
    }
    
    public static void generaRandom(Password pas){
        Scanner teclado = new Scanner(System.in);
        int longitud;
        do{
            System.out.println("INDIQUE LONGITUD DE CONTRASEÑA");
            System.out.println("[8,15]");
            longitud = teclado.nextInt();   
        }while(longitud<8 || 15<longitud);
        pas = new Password(longitud);
        pas.generarContraseña();
        System.out.println("CONTRASEÑA RANDOM: "+pas.getContraseña());
    }
}