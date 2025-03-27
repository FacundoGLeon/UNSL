/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico_uno;

/**
 *
 * @author facun
 */
public class Persona {
    int cantidadAños;
    
    public Persona(){
        cantidadAños = 0;
    }
    public Persona(int cantidadAños){
        this.cantidadAños = cantidadAños;
    }
    public void segundoVividos(){
        System.out.println("Ha vivido aproximadamente "+(cantidadAños*(31536000))+" segundos");
    }
}
