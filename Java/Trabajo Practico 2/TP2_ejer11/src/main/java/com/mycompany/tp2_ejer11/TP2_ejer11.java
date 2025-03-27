/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp2_ejer11;

import java.util.Scanner;

public class TP2_ejer11 {
    final static int MAX = 100;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         Materia [] mat = new Materia[MAX];
        int opcion=1, cont=0;
        while(opcion !=5){
            do{
                System.out.println("");
                System.out.println("Indique Accion: ");
                System.out.println("<1> Cargar n Materias.");
                System.out.println("<2> Modificar los Datos de una Materia.");
                System.out.println("<3> Cargar Cantidad de Estudiantes de una Materia.");
                System.out.println("<4> Mostrar Todas las Materias que Posean mas de n Estudiantes.");
                System.out.println("<5> Exit.");
                opcion = teclado.nextInt();
            }while(opcion<1 || opcion>5);
            switch(opcion){
                case 1: cont = cargaMaterias(mat,cont);break;
                case 2: 
                    if(cont==0){
                        System.out.println("No Hay Materias Cargadas.");    
                    }
                    else{
                        modificarMateria(mat,cont);
                    }break;
                case 3: break;
                case 4:
                    if(cont==0){
                        System.out.println("No Hay Materias Cargadas.");    
                    }
                    else{
                        mostrarMaterias(mat,cont);
                    }break;
                default: break;
            }
        }
    }
    public static int cargaMaterias(Materia [] mat, int cont){
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int año;
        int cantEstudiantes;
        int cuatrimestre;
        int n,i;
        do{
            System.out.println("Cuantas Materias Desea Ingresar: ");
            n = teclado.nextInt();
        }while(n<0);
        for(i=cont;i<(cont+n);i++){
            mat[i] = new Materia();
            System.out.println("");
            System.out.println("Materia: "+(i+1));
            System.out.println("Ingrese Nombre de la Materia: ");
            nombre = teclado.next();
            do{
                System.out.println("Ingrese Año de la Materia: 1º;2º;3º;4º;5º; ");
                año = teclado.nextInt();
            }while(año<1 || año>5);
            do{
                System.out.println("Ingrese Cantidad de Estudiantes: ");
                cantEstudiantes = teclado.nextInt();
            }while(cantEstudiantes < 0);
            do{
                System.out.println("Ingrese Cuatrimestre: 1er;2do; ");
                cuatrimestre = teclado.nextInt();
            }while(cuatrimestre < 1 || cuatrimestre > 2);
            mat[i].setNombre(nombre);
            mat[i].setAño(año);
            mat[i].setCantEstudiantes(cantEstudiantes);
            mat[i].setCuatrimestre(cuatrimestre);
        }
        return cont+=n;
    }
    
    public static void modificarMateria(Materia [] mat, int cont){
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int cambio;
        boolean opc = false;
        int i=0,opcion=1;
        System.out.println("Ingrese el Nombre de la Materia que Desea Modificar: ");
        nombre = teclado.next();
        while(opc == false && i<cont){
            if(mat[i].getNombre().equals(nombre)== true){
                opc = true;
            }
            else{
                i++;
            }
        }
        if(opc == true){
            while(opcion != 5){
                do{
                    System.out.println("");
                    System.out.println("Que Desea Modificar? ");
                    System.out.println("<1> Nombre de la Materia.");
                    System.out.println("<2> Año de la Materia.");
                    System.out.println("<3> Cantidad de Estudiantes.");
                    System.out.println("<4> Cuatrimestre.");
                    System.out.println("<5> Listo.");
                    opcion = teclado.nextInt();
                }while(opcion<1 || opcion>5);
                switch(opcion){
                    case 1: 
                        System.out.println("Ingrese Nombre de la Materia: ");
                        nombre = teclado.next();
                        mat[i].setNombre(nombre);break;
                    case 2: 
                        do{
                            System.out.println("Ingrese Año de la Materia: 1º;2º;3º;4º;5º; ");
                            cambio = teclado.nextInt();
                        }while(cambio<1 || cambio>5);
                        mat[i].setAño(cambio);break;
                    case 3:
                        do{
                            System.out.println("Ingrese Cantidad de Estudiantes: ");
                            cambio = teclado.nextInt();
                        }while(cambio < 0);
                        mat[i].setCantEstudiantes(cambio);break;
                    case 4: 
                        do{
                            System.out.println("Ingrese Cuatrimestre: 1er;2do; ");
                            cambio = teclado.nextInt();
                        }while(cambio < 1 || cambio > 2);
                        mat[i].setCuatrimestre(cambio);break;
                    default: break;
                }
            }
        }
        else{
            System.out.println("No Se Encontro La Materia Ingresada...");
            
        }
    }
    
    public static void mostrarMaterias(Materia [] mat,int cont){
        Scanner teclado = new Scanner(System.in);
        int n,i,cant=0;
        do{
           System.out.println("Indique Cantidad de Estudiantes Mayor a Mostrar: ");
           n = teclado.nextInt();
        }while(n<0);
        for(i=0;i<cont;i++){
            if(mat[i].getCantEstudiantes() >= n){
                cant=1;
                System.out.println("");
                System.out.println("Materia: "+(i+1));
                System.out.println("Nombre: "+mat[i].getNombre());
                System.out.println("Año: "+mat[i].getAño()+"º");
                System.out.println("Cantidad de Estudiantes: "+mat[i].getCantEstudiantes());
                System.out.println("Cuatrimestre: "+mat[i].getCuatrimestre()+( 1 == mat[i].getCuatrimestre()?"er Cuatrimestre":"do Cuatrimestre"));
            }
        
        }
        if(cant==0)System.out.println("No hay Materias con mas de "+n+" Estudiantes...");
    }
}
