/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_ejer5_6_7_8;


public class Persona {
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private long documento;
    private String estadoCivil;
    private Fecha fechaNacimiento;

    public Persona() {
    }

    
    public Persona(String nombre, String apellido, String tipoDocumento, long documento, String estadoCivil, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void mostrarPersona() {
        System.out.println("PERSONA: ");
        System.out.println("Nombre: " +nombre );
        System.out.println("Apellido: "+apellido);
        System.out.println("Tipo de Documento: " +tipoDocumento);
        System.out.println("Documento: "+documento);
        System.out.println("Estado Civil: "+estadoCivil);
        System.out.println("Fecha de Nacimiento: " +fechaNacimiento.MostrarFecha() );
    }
    
    
    
}
