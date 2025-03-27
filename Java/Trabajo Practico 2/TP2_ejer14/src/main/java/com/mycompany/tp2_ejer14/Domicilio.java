/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_ejer14;


public class Domicilio {
    String calle;
    int numero;
    

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
    
    public String muestraDireccion(){
        return "Domicilio: "+calle+" "+numero;
    }
    
    
}
