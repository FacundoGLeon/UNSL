/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp3_ejer5_6_7_8;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TP3_ejer5_6_7_8 {
    final static int MAX = 100;
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        EstudianteADistancia [] est = new EstudianteADistancia[MAX];
        int opc=1,cont=0;
        while(opc!=3){
            do{
                System.out.println("1. CARGAR N ESTUDIANTES.");
                System.out.println("2. MOSTRAR ALUMNOS QUE CURSARON CIERTO AÑO.");
                System.out.println("3. SALIR.");
                opc = teclado.nextInt();
            }while(opc<1 || opc>3);
            switch(opc){
                case 1: cont=ingresar(est,cont);break;
                case 2: 
                    if(cont!=0){
                        mostrar(est,cont);
                    }
                    else{
                     System.out.println("DEBES CARGAR AL MENOS UN ESTUDIANTE.");
                    }break;
                case 3: break;
            }
        }
        
        
        
        
    }
    
    public static int ingresar(EstudianteADistancia [] est,int cont){
        Scanner tecla = new Scanner (System.in);
        
        int i,n,j;
        
        char opc = 'a';
        String nombre,apellido,tipoDoc,estadoCivil,carrera,ciudad,usuario,contraseña;
        Long documento;
        int añoC;
        int dia,mes,año;
        Fecha fechaNacimiento;
      
        do{
            System.out.println("CUANTOS ESTUDIANTES DESEA INGRESAR");
            n=tecla.nextInt();
        }while(n<1 || n>MAX);
        for(i=cont;i<(cont+n);i++){
            System.out.println("ESTUDIANTE "+(i+1));
            System.out.println("INGRESE NOMBRE DEL ESTUDIANTE");
            nombre=tecla.next();
            System.out.println("INGRESE APELLIDO DEL ESTUDIANTE");
            apellido=tecla.next();
            System.out.println("INGRESE TIPO DE DOCUMENTO DEL ESTUDIANTE");
            tipoDoc=tecla.next();
            System.out.println("INGRESE NUMERO DE DOCUMENTO DEL ESTUDIANTE");
            documento=tecla.nextLong();
            System.out.println("INGRESE ESTADO CIVIL DEL ESTUDIANTE");
            estadoCivil=tecla.next();
            System.out.println("INGRESE FECHA DE NACIMIENTO DEL ESTUDIANTE");
            do{
                System.out.println("DIA:");
                dia=tecla.nextInt();
            }while(dia<0 || dia>31);
            
            do{
                System.out.println("MES:");
                mes=tecla.nextInt();
            }while(mes<0 || mes>12);
            
            do{
                System.out.println("AÑO:");
                año=tecla.nextInt();
            }while(año<1923 || año>2023);
            fechaNacimiento = new Fecha(dia,mes,año);
            tecla.nextLine();
            System.out.println("INGRESE CARRERA DEL ESTUDIANTE");
            carrera=tecla.nextLine();
            tecla.nextLine();
            do{
                System.out.println("INGRESE AÑO QUE CURSA");
                añoC=tecla.nextInt();
            }while(añoC<1 || añoC>5);
            tecla.nextLine();
            System.out.println("INGRESE CIUDAD DE RESIDENCIA DEL ESTUDIANTE");
            ciudad=tecla.nextLine();
            tecla.nextLine();
            do{
                System.out.println("INGRESE USUARIO DEL AULA VIRTUAL");
                usuario=tecla.next();
                for(j=0;j<usuario.length() && opc!=' ';j++){
                    opc=usuario.charAt(j);
                    
                }
            }while(opc==' ');
            tecla.nextLine();
            do{
                System.out.println("INGRESE CONTRASEÑA DEL AULA VIRTUAL");
                contraseña=tecla.next();
                for(j=0;j<contraseña.length() && opc!=' ';j++){
                    opc=contraseña.charAt(j);
                    
                }
            }while(opc==' ');
            System.out.println("");
            
            est[i] = new EstudianteADistancia(ciudad,usuario,contraseña,carrera,añoC,nombre,apellido,tipoDoc,documento,estadoCivil,fechaNacimiento);
            
        }
        return cont+n;
    }
    
    public static void mostrar(EstudianteADistancia [] est,int cont){
        Scanner teclado = new Scanner(System.in);
        int i,año;
        do{
            System.out.println("INDIQUE EL AÑO DE CURSADA DE LOS ESTUDIANTES QUE DESEA VER:");
            año = teclado.nextInt();
        }while(año<0 || año>5);
        for(i=0;i<cont;i++){
            if(año==est[i].getAñoCursa()){
                est[i].mostrarEstudianteADistcancia();
            }
        }
    }
}
