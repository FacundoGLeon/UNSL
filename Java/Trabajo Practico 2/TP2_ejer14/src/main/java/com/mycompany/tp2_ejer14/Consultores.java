/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_ejer14;

public class Consultores {
    String nombre;
    Domicilio dom;
    long num;
    Fecha fNacimiento;
    Fecha fInicio;
    int horasTrab;
    float tarifa;

    public Consultores(String nombre, Domicilio dom, long num, Fecha fNacimiento, Fecha fInicio, int horasTrab, float tarifa) {
        this.nombre = nombre;
        this.dom = dom;
        this.num = num;
        this.fNacimiento = fNacimiento;
        this.fInicio = fInicio;
        this.horasTrab = horasTrab;
        this.tarifa = tarifa;
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

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }
    
    
    
}
