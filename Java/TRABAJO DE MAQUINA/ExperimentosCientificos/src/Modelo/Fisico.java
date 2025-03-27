/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Fisico extends Experimento {
    
    private String fenomenoEstudiado;

    public Fisico() {
        super();
        fenomenoEstudiado = null;
    }
    

    public Fisico(String fenomenoEstudiado, String titulo, String descripcion, float presupuesto, Fecha fechaInicio, Fecha fechaFin) {
        super(titulo, descripcion, presupuesto, fechaInicio, fechaFin);
        this.fenomenoEstudiado = fenomenoEstudiado;
    }

   

    public String getFenomenoEstudiado() {
        return fenomenoEstudiado;
    }

    public void setFenomenoEstudiado(String fenomenoEstudiado) {
        this.fenomenoEstudiado = fenomenoEstudiado;
    }

    @Override
    public String toString() {
        return super.toString()+ fenomenoEstudiado;
    }
    
    
    
}
