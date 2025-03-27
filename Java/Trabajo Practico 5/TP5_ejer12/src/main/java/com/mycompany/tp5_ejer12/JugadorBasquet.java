/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5_ejer12;

/**
 *
 * @author facun
 */
public class JugadorBasquet extends Jugador{
    private int cantidadTriples;

    public JugadorBasquet(int cantidadTriples, String nombre, String deporte) {
        super(nombre, deporte);
        this.cantidadTriples = cantidadTriples;
    }

    public int getCantidadTriples() {
        return cantidadTriples;
    }

    public void setCantidadTriples(int cantidadTriples) {
        this.cantidadTriples = cantidadTriples;
    }

    @Override
    public String toString() {
        
        return super.toString() +
                "\nTriples Encestados:" + cantidadTriples;
    }
    
}
