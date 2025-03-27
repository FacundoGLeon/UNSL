/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_ejer5_6_7_8;

/**
 *
 * @author USUARIO
 */

public class EstudianteADistancia extends Estudiante {
    private String ciudad;
    private String usuario;
    private String contraseña;
    
    
   
    public EstudianteADistancia(String ciudad, String usuario, String contraseña, String carrera, int añoCursa, String nombre,String apellido, String tipoDocumento, long documento, String estadoCivil, Fecha fechaNacimiento) {
        super(carrera, añoCursa, nombre, apellido, tipoDocumento, documento, estadoCivil, fechaNacimiento);
        this.ciudad = ciudad;
        this.usuario = usuario;
        this.contraseña = contraseña;
        
    }

    
    
    

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void mostrarEstudianteADistcancia(){
        mostrarEstudiante();
        System.out.println("Ciudad de Residencia: "+ciudad);
        System.out.println("Usuario de Aula Virtual: "+usuario);
        System.out.println("Contraseña: "+contraseña);
        
    }
    
}
