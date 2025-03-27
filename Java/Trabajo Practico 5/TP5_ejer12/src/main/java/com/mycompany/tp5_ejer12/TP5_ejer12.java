/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp5_ejer12;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class TP5_ejer12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashSet <Jugador> jugadores = new HashSet<>();
        int opc = 1;
        while(opc!=4){
            do{
                System.out.println("1. Ingresar Jugador");
                System.out.println("2. Mostrar Jugadores que no sean de Basquet ni de Rugby");
                System.out.println("3. Mostrar todos los jugadores");
                System.out.println("4. Salir");
                opc = teclado.nextInt();
            }while(opc<1 || opc>4);
            switch(opc){
                case 1: ingresarJugador(jugadores);break;
                case 2: imprimirJugador(jugadores);break;
                case 3: imprimirJugadores(jugadores);break;
                case 4: break;
            }
        }
    }
    public static void ingresarJugador(HashSet <Jugador> jugadores){
        Scanner teclado = new Scanner(System.in);
        String nombre, deporte = null;
        int tripOtack;
        int opc;
        do{
            System.out.println("Que desea Ingresar:");
            System.out.println("1. Jugador");
            System.out.println("2. Jugador Basquet");
            System.out.println("3. Jugador Rugby");
            opc = teclado.nextInt();
        }while(opc<1 || opc>3);
        teclado.nextLine();
        System.out.println("Ingrese Nombre:");
        nombre = teclado.next();
        switch(opc){
            case 1:
                teclado.nextLine();
                System.out.println("Ingrese Deporte:");
                deporte = teclado.next();
                break;
            case 2:
                deporte = "Basquet";
                break;
            case 3:
                deporte = "Rugby";
                break;
        }
        switch(opc){
             case 1:
                jugadores.add(new Jugador(nombre,deporte));
                break;
            case 2:
                do{
                    teclado.nextLine();
                    System.out.println("Indique la cantidad de Tripletes que ha realizado:");
                    tripOtack = teclado.nextInt();
                }while(tripOtack<0);
                jugadores.add(new JugadorBasquet(tripOtack,nombre,deporte));
                break;
            case 3:
                do{
                    teclado.nextLine();
                    System.out.println("Indique la cantidad de Tackets que le han realizado:");
                    tripOtack = teclado.nextInt();
                }while(tripOtack<0);
                jugadores.add(new JugadorDeRugby(tripOtack,nombre,deporte));
                break;
        }
        
    }
    public static void imprimirJugador(HashSet <Jugador> jugadores){
        for(Jugador i : jugadores){
            if(!(i instanceof JugadorBasquet || i instanceof JugadorDeRugby)){
                System.out.println(i);
                System.out.println("");
            }
        }
    }
    public static void imprimirJugadores(HashSet <Jugador> jugadores){
        for(Jugador i : jugadores){
            System.out.println(i);
            System.out.println("");
           
        }
    }
}
