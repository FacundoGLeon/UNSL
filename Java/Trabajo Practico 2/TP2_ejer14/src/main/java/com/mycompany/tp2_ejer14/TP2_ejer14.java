/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_ejer14;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TP2_ejer14 {

    final static int MAX=100;
    
    public static void main(String[] args) {
        
       Scanner teclado = new Scanner (System.in);
       int opc=1;
       int contConst=0;
       int contConsu = 0;
       Contructores [] constr = new Contructores[MAX]; 
       Consultores [] consul = new Consultores[MAX]; 
        
        
        while(opc!=5){
        
        do{
            System.out.println("Indique Accion:");
            System.out.println("<1> Cargar n constructores");
            System.out.println("<2> Cargar n consultores");
            System.out.println("<3> calcular monto mensula a pagar a constructores y consultores");
            System.out.println("<4> informar que consultor trabajo mas horas");
            System.out.println("<5> Exit");
            opc = teclado.nextInt();
        }while(opc<1 || opc >5);
        switch(opc){
            case 1: contConst = cargaConstructores(constr,contConst); break;
            case 2: contConsu = cargaConsultores(consul,contConsu);break;
            case 3: montoMensual(constr,contConst,consul,contConsu);break;
            case 4: horas(consul,contConsu);break;
            default: break;
        }
        
       }
        
     }
    
    public static int cargaConstructores(Contructores [] constr, int cont){
        Scanner teclado = new Scanner (System.in);
        int i,n;
        String calle;
        int dia,mes,año,numero;
        String nom;
        Domicilio dom;
        Fecha fech;
        Fecha fechita;
        long telefono;
        float sueldo;
        do{
            System.out.println("Cuantos constructores desea cargar");
            n = teclado.nextInt();
        }while(n<0 || n>MAX);
        for(i=cont;i<cont+n;i++){
            System.out.println("");
            System.out.println("Constructor: "+(i+1));
            teclado.nextLine();
            System.out.println("Nombre");
            nom = teclado.nextLine();
            System.out.println("Nombre "+nom);
            System.out.println("Ingrese Domicilio:");
            System.out.println("Calle");
            calle = teclado.nextLine();
            System.out.println("calle "+calle);
         
            do{
                System.out.println("Numero");
                numero = teclado.nextInt();
            }while(numero<0);
            dom = new Domicilio(calle,numero);
          
            System.out.println("Ingrese Numero de telefono");
            telefono = teclado.nextLong();
            
            System.out.println("Fecha de Nacimiento");
            do{
                System.out.println("dia");
                dia = teclado.nextInt();
            }while(dia<0 || dia>31);
            do{
                System.out.println("mes");
                mes = teclado.nextInt();
            }while(mes<0 || mes>12);
            do{
                System.out.println("año");
                año = teclado.nextInt();
            }while(año>2023);
            fech = new Fecha(dia,mes,año);
            System.out.println("Fecha de Inicio de contrato");
            do{
                System.out.println("dia");
                dia = teclado.nextInt();
            }while(dia<0 || dia>31);
            do{
                System.out.println("mes");
                mes = teclado.nextInt();
            }while(mes<0 || mes>12);
            do{
                System.out.println("año");
                año = teclado.nextInt();
            }while(año>2023);
            fechita = new Fecha(dia,mes,año);
            do{
                System.out.println("Ingrese Sueldo");
                sueldo = teclado.nextInt();
            }while(sueldo<0);
            constr[i] = new Contructores(nom,dom,telefono,fech,fechita,sueldo);
        }
        
        return cont+n;
    }
    
    public static int cargaConsultores(Consultores [] consul, int cont){
        Scanner teclado = new Scanner (System.in);
        int i,n;
        String calle;
        int dia,mes,año,numero;
        String nom;
        Domicilio dom;
        Fecha fech;
        Fecha fechita;
        long telefono;
        float tarifa;
        int horasTrab;
        do{
            System.out.println("Cuantos consultores desea cargar");
            n = teclado.nextInt();
        }while(n<0 || n>MAX);
        for(i=cont;i<cont+n;i++){
            System.out.println("");
            System.out.println("Consultor: "+(i+1));
            teclado.nextLine();
            System.out.println("Nombre");
            nom = teclado.nextLine();
           
            System.out.println("Ingrese Domicilio:");
            System.out.println("Calle");
            calle = teclado.nextLine();
            
            do{
                System.out.println("Numero");
                numero = teclado.nextInt();
            }while(numero<0);
            dom = new Domicilio(calle,numero);
          
            System.out.println("Ingrese Numero de telefono");
            telefono = teclado.nextLong();
            
            System.out.println("Fecha de Nacimiento");
            do{
                System.out.println("dia");
                dia = teclado.nextInt();
            }while(dia<0 || dia>31);
            do{
                System.out.println("mes");
                mes = teclado.nextInt();
            }while(mes<0 || mes>12);
            do{
                System.out.println("año");
                año = teclado.nextInt();
            }while(año>2023);
            fech = new Fecha(dia,mes,año);
            System.out.println("Fecha de Inicio de contrato:");
            do{
                System.out.println("dia");
                dia = teclado.nextInt();
            }while(dia<0 || dia>31);
            do{
                System.out.println("mes");
                mes = teclado.nextInt();
            }while(mes<0 || mes>12);
            do{
                System.out.println("año");
                año = teclado.nextInt();
            }while(año>2023);
            fechita = new Fecha(dia,mes,año);
            do{
                System.out.println("Ingrese horas Trabajadas");
                horasTrab = teclado.nextInt();
            }while(horasTrab<0);
            do{
                System.out.println("Cuanto cobra por hora");
                tarifa = teclado.nextFloat();
            }while(tarifa<0);
            consul[i] = new Consultores(nom,dom,telefono,fech,fechita,horasTrab,tarifa);
        }
        
        return cont+n;
    }
    
    public static void montoMensual(Contructores [] constr, int contConst,Consultores [] consul, int contConsu){
        float total=0;
        int i;
        for(i=0;i<contConst;i++){
            total+=constr[i].getSueldo();
            System.out.println("Total a pagar por Constructores: $"+total);
        }
        total=0;
        for(i=0;i<contConsu;i++){
            total+=(consul[i].getHorasTrab()*consul[i].getTarifa());
            System.out.println("Total a pagar por Consultores: $"+total);
        }
    }
    
    public static void horas(Consultores [] consul, int contConsu){
        int mayor = 0;
        int i;
        for(i=1;i<contConsu;i++){
            if(consul[i].getHorasTrab()>consul[mayor].getHorasTrab()){
                mayor = i;
            }
        }
        System.out.println("El consultor que trabajo mas horas fue: "+consul[mayor].getNombre());
    }
}
