/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_ejer14;

/**
 *
 * @author USUARIO
 */
public class Trabajador extends Domicilio {
    private String nombre;
    private long num;
    private Fecha fNacimiento;
    private Fecha fInicio;

    public Trabajador(String nombre, long num, Fecha fNacimiento, Fecha fInicio, String calle, int numero) {
        super(calle, numero);
        this.nombre = nombre;
        this.num = num;
        this.fNacimiento = fNacimiento;
        this.fInicio = fInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public Fecha getfInicio() {
        return fInicio;
    }

    public void setfInicio(Fecha fInicio) {
        this.fInicio = fInicio;
    }
    public void mostrarTrabajador(){
        System.out.println("Nombre: "+nombre);
        super.muestraDireccion();
        System.out.println("Numero de Telefono: "+num);
        System.out.println("Fecha de Nacimiento: "+fNacimiento.MostrarFecha());
        System.out.println("Fecha de Inicio de Contrato: "+fInicio.MostrarFecha());
        
    } 
}
