/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp3_ejer10;

/**
 *
 * @author USUARIO
 */
public class TP3_ejer10 {

    public static void main(String[] args) {
        Empleado empl = new Empleado("Juan");
        Directivo direc = new Directivo("Jose");
        Operario ope = new Operario("Pepe");
        Oficial ofi = new Oficial("Luis");
        Tecnico tec = new Tecnico("Pablo");
        
        System.out.println("EMPLEADO: "+empl.toString());
        System.out.println("DIRECTIVO: "+direc.toString());
        System.out.println("OPERARIO: "+ope.toString());
        System.out.println("OFICIAL: "+ofi.toString());
        System.out.println("TECNICO: "+tec.toString());
        
    }
}
