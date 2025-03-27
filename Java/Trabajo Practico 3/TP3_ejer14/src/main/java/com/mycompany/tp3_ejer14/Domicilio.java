/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_ejer14;

/**
 *
 * @author USUARIO
 */
public class Domicilio {
    private String calle;
    private int numero;
    

    public Domicilio() {
        this.calle = null;
        this.numero = 0;
    }

    public Domicilio(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }
    

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public void muestraDireccion(){
        System.out.println("Domicilio: "+calle+" "+numero);
    }
    
    
}
