/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Cientifico {
    
    
    private String nombre;   
    private String especialidad;
    private Fecha fechaContratacion;
    
    // tipo date // 
    
    
   
    public Cientifico(String nombre, String especialidad, Fecha fechaContratacion) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.fechaContratacion = fechaContratacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Fecha getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Fecha fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return nombre + "- " + especialidad + "- " + fechaContratacion.getDia()+"- " + fechaContratacion.getMes()+"- " +fechaContratacion.getAño() ;
    }



    
}
