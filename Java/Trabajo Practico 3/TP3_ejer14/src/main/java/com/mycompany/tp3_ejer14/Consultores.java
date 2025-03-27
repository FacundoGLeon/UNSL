/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_ejer14;

/**
 *
 * @author USUARIO
 */
public class Consultores extends Trabajador {
    int horasTrabajadas;
    float tarifa;

    public Consultores(int horasTrabajadas, float tarifas, String nombre, long num, Fecha fNacimiento, Fecha fInicio, String calle, int numero) {
        super(nombre, num, fNacimiento, fInicio, calle, numero);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifa = tarifas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public void muestraConsultor(){
        super.mostrarTrabajador();
        System.out.println("Sueldo: "+horasTrabajadas);
        System.out.println("Impuesto: "+tarifa);
    }
    
            
}
