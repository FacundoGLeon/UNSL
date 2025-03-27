/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp6_ejer10;

import java.util.Comparator;

/**
 *
 * @author facun
 */
public class Persona {
    private String nombre;
    private String apelido;
    private String ocupacion;
    private String carrera;
    private String mail;

    public Persona(String nombre, String apelido, String ocupacion, String carrera, String mail) {
        this.nombre = nombre;
        this.apelido = apelido;
        this.ocupacion = ocupacion;
        this.carrera = carrera;
        this.mail = mail;
    }
    
    public static class OrdenarAlfabeticamente implements Comparator<Persona>{

       @Override
       public int compare(Persona p1, Persona p2){
           return p1.getApelido().compareToIgnoreCase(p2.getApelido());
       }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return nombre+", "+apelido+", "+ocupacion+", "+carrera+", "+mail; 
                
    }
    
}
