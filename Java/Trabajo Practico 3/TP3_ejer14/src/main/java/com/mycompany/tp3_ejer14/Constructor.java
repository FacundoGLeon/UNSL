/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_ejer14;

/**
 *
 * @author USUARIO
 */
public class Constructor extends Trabajador{
    float sueldo;
    int impuesto;

    public Constructor(float sueldo, int impuesto, String nombre, long num, Fecha fNacimiento, Fecha fInicio, String calle, int numero) {
        super(nombre, num, fNacimiento, fInicio, calle, numero);
        this.sueldo = sueldo;
        this.impuesto = impuesto;
        
        
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }
       
    public void muestraConstructor(){
            super.mostrarTrabajador();
            System.out.println("Sueldo: "+sueldo);
            System.out.println("Impuesto: "+impuesto);
        }
}
