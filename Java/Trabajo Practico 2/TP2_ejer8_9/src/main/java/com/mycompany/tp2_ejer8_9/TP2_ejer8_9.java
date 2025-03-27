/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp2_ejer8_9;

import java.util.Scanner;


public class TP2_ejer8_9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n,i;
        String nombre;
        int año;
        int cantEstudiantes;
        int cuatrimestre;
        do{
            System.out.println("Cuantas Materias Desea Ingresar: ");
            n = teclado.nextInt();
        }while(n<0);
        Materia [] mat = new Materia[n];
        for(i=0;i<n;i++){
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
        for(i=0;i<n;i++){
            System.out.println("");
            System.out.println("Materia: "+(i+1));
            System.out.println("Nombre: "+mat[i].getNombre());
            System.out.println("Año: "+mat[i].getAño()+"º");
            System.out.println("Cantidad de Estudiantes: "+mat[i].getCantEstudiantes());
            System.out.println("Cuatrimestre: "+mat[i].getCuatrimestre()+( 1 == mat[i].getCuatrimestre()?"er":"do"));
        }
    }
}
