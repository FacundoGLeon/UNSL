/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp3_ejer14;

/**
 *
 * @author USUARIO
 */


import java.util.Scanner;

public class TP3_ejer14 {
    final static int MAX=100;
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
       int opc=1;
       int contConst=0;
       int contConsu = 0;
       Constructor [] constr = new Constructor[MAX]; 
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
    
    public static int cargaConstructores(Constructor [] constr, int cont){
        Scanner teclado = new Scanner (System.in);
        int i,n;
        String calle;
        int dia,mes,año,numero;
        String nom;
       
        Fecha fech;
        Fecha fechita;
        long telefono;
        float sueldo;
        int impuesto = 10;
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
            constr[i] = new Constructor(sueldo,impuesto,nom,telefono,fech,fechita,calle,numero);
        }
        
        return cont+n;
    }
    
    public static int cargaConsultores(Consultores [] consul, int cont){
        Scanner teclado = new Scanner (System.in);
        int i,n;
        String calle;
        int dia,mes,año,numero;
        String nom;
        
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
            consul[i] = new Consultores(horasTrab,tarifa,nom,telefono,fech,fechita,calle,numero);
        }
        
        return cont+n;
    }
    
    public static void montoMensual(Constructor [] constr, int contConst,Consultores [] consul, int contConsu){
        float total=0;
        float sueldo=0;
        int i;
        for(i=0;i<contConst;i++){
            sueldo -= (constr[i].getImpuesto()*constr[i].getSueldo())/100;
            total += sueldo;
            System.out.println("Total a pagar por Constructores: $"+total);
        }
        total=0;
        for(i=0;i<contConsu;i++){
           
            total+=(consul[i].getHorasTrabajadas()*consul[i].getTarifa());
            System.out.println("Total a pagar por Consultores: $"+total);
        }
    }
    
    public static void horas(Consultores [] consul, int contConsu){
        int mayor = 0;
        int i;
        for(i=1;i<contConsu;i++){
            if(consul[i].getHorasTrabajadas()>consul[mayor].getHorasTrabajadas()){
                mayor = i;
            }
        }
        System.out.println("El consultor que trabajo mas horas fue: "+consul[mayor].getNombre());
    }
}

