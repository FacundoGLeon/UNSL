/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4_ejer3;

/**
 *
 * @author USUARIO
 */
public class IngInformatico extends Persona {
    private boolean titulo;

    public IngInformatico(boolean titulo, String nombre, String apellido, long dni) {
        super(nombre, apellido, dni);
        this.titulo = titulo;
    }
    public String titulo(){
        
        return titulo==true?"Ingeniero en Informatica. ":"Sr. ";
    }
}
