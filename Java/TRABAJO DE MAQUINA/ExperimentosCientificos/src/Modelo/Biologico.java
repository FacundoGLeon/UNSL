/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;



/**
 *
 * @author Usuario
 */
public class Biologico extends Experimento {
    
    private String tipoOrganismo;

    public Biologico() {
        super();
        tipoOrganismo = null;
    }
    

    public Biologico(String tipoOrganismo, String titulo, String descripcion,float presupuesto, Fecha fechaInicio, Fecha fechaFin) {
        super(titulo, descripcion, presupuesto, fechaInicio, fechaFin);
        this.tipoOrganismo = tipoOrganismo;
    }

   
    
    

    public String getTipoOrganismo() {
        return tipoOrganismo;
    }

    public void setTipoOrganismo(String tipoOrganismo) {
        this.tipoOrganismo = tipoOrganismo;
    }

    @Override
    public String toString() {
        return super.toString()+ tipoOrganismo ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
