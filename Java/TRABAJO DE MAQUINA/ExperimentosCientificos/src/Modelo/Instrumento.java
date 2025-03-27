/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Instrumento {
    
    private String nombreInstrumento;
    private String areaEspecialidad;
    private String descripcion;
    

    public Instrumento(String nombreInstrumento, String areaEspecialidad, String descripcion) {
        this.nombreInstrumento = nombreInstrumento;
        this.areaEspecialidad = areaEspecialidad;
        this.descripcion = descripcion;
    }

    public String getNombreInstrumento() {
        return nombreInstrumento;
    }

    public void setNombreInstrumento(String nombreInstrumento) {
        this.nombreInstrumento = nombreInstrumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAreaEspecialidad() {
        return areaEspecialidad;
    }

    public void setAreaEspecialidad(String areaEspecialidad) {
        this.areaEspecialidad = areaEspecialidad;
    }

    @Override
    public String toString() {
        return nombreInstrumento+"- "+areaEspecialidad+"- "+descripcion ;
    }
    
    
    
    
    
    
    
}
