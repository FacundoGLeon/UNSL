/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 *
 * @author facun
 */
public class Raton extends Roedor{
    
    public Raton(String nombre, int edad, double peso){
        super(nombre,edad,peso);
    }
    public void comer(){
        System.out.println(super.getNombre()+"(Raton) está comiendo queso.");
    }
    public void moverse(){
        System.out.println(super.getNombre()+"(Raton) Se mueve muy rapido.");
    }
}
