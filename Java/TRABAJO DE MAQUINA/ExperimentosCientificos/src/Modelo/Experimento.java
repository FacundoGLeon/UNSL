/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author USUARIO
 */

public class Experimento {

private String titulo;
private String descripcion;
private float presupuesto;

// TIPO DATE // 
private Fecha fechaInicio;
private Fecha fechaFin;

//
private HashMap<Integer, Cientifico> cientificos = new HashMap<>();
private HashMap<Integer, Instrumento> instrumentos = new HashMap<>();

    public Experimento() {
        titulo = null;
        descripcion = null;
        presupuesto = 0;
        fechaInicio = new Fecha();
        fechaFin = new Fecha();
    }

    
    public Experimento(String titulo, String descripcion, float presupuesto, Fecha fechaInicio, Fecha fechaFin) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.presupuesto = presupuesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public HashMap<Integer, Cientifico> getCientificos() {
        return cientificos;
    }

    public void setCientificos(Integer i, Cientifico Cienti) {
        this.cientificos.put(i, Cienti);
    }

    public HashMap<Integer, Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(Integer i, Instrumento Instru) {
        this.instrumentos.put(i, Instru);
    }

    

   public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Fecha getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Fecha fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return titulo + "- " + descripcion + "- " + presupuesto + "- " + fechaInicio.getDia()  + "- "+fechaInicio.getMes() + "- " + fechaInicio.getAño()+ "- "+ fechaFin.getDia()+ "- "+ fechaFin.getMes()+ "- "+ fechaFin.getAño()+ "- " ;
    }

    


    
    
    
}
