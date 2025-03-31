/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 *
 * @author facun
 */
public class Gerbil extends Roedor{
    
    public Gerbil(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }
    
    public void comer(){
        System.out.println(super.getNombre()+"(Gerbil) está almacenando comida.");
    }
    public void moverse(){
        System.out.println(super.getNombre()+"(Gerbil) se mueve saltando.");
    }
    
}
