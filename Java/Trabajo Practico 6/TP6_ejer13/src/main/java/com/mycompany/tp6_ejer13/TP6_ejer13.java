/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp6_ejer13;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class TP6_ejer13 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int opc = 1;
        while(opc != 5){
            
            try{
                System.out.println("1. Ingresar");
                System.out.println("2. Mostrar");
                System.out.println("3. Eliminar");
                System.out.println("4. Ordenar");
                System.out.println("5. Exit");
                opc = teclado.nextInt();
                switch(opc){
                    case 1: System.out.println("Ingresado"); break;
                    case 2: System.out.println("Mostrado");break;
                    case 3: System.out.println("Eliminado");break;
                    case 4: System.out.println("Ordenado");break;
                    case 5: System.out.println("Exit");break;
                    default:  throw new IllegalArgumentException("OPCION NO VALIDA");
                }
            }catch(IllegalArgumentException e){
                System.out.println(e);
            }catch(InputMismatchException e){
                teclado.nextLine();
                System.out.println(e+": DEBE INGRESAR OPCION NUMERICA");
            }
        }
    }
}
