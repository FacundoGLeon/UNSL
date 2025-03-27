/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp6_ejer14;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class TP6_ejer14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x,y;
        Punto1erCuadrante punto;
        try{
            System.out.println("Ingrese coordenadas x");
            x = teclado.nextDouble();
            System.out.println("Ingrese coordenadas y");
            y = teclado.nextDouble();
            punto = new Punto1erCuadrante(x,y);
            System.out.println("Punto: "+ punto);
        }catch(PuntoFueraDelPrimerCuadranteException e){
            System.out.println(e.getMessage());
        }
      
    }
}
