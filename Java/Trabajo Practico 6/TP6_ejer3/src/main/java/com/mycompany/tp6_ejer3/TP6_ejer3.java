/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp6_ejer3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TP6_ejer3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int cont=0;
        do{
        try{
       
        System.out.println("Ingrese Numerador");
        int numerador = teclado.nextInt();
        System.out.println("Ingrese Denominador");
        int denominador = teclado.nextInt(); 
        System.out.println("Resultado: "+(numerador/denominador));
        cont = 0;
        }catch(InputMismatchException e){
            
            System.out.println("ERROR!!!: DEBE INGRESAR ENTEROS!!!");
            System.out.println(e.toString());
            teclado.nextLine();
            cont = 1;
        }catch(Exception e){
            System.out.println("ERROR!!!: NO SE PUEDE DIVIDIR POR CERO!!!");
            cont=1;
        }
        }while(cont!=0);
        
    }
}
