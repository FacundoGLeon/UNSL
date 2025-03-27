/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico_uno;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class ConvPulgadas {
    public void conversion(Scanner teclado){
        System.out.println("Ingrese las pulgadas para realizar la conversion a metros:");
        float pulgadas = teclado.nextFloat();
        System.out.println(pulgadas+" pulgadas son "+(pulgadas*0.0254)+" metros");
    }
    
}
