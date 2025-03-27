/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_ejer14;


public class Contructores {
    String nombre;
    Domicilio dom;
    long num;
    Fecha fNacimiento;
    Fecha fInicio;
    float sueldo;

    public Contructores(String nombre, Domicilio dom, long num, Fecha fNacimiento, Fecha fInicio, float sueldo) {
        this.nombre = nombre;
        this.dom = dom;
        this.num = num;
        this.fNacimiento = fNacimiento;
        this.fInicio = fInicio;
        this.sueldo = sueldo;
    }
    

    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDom() {
        return dom;
    }

    public void setDom(Domicilio dom) {
        this.dom = dom;
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

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    
    
    
}
