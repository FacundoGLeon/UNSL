/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp4_ejer3;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TP4_ejer3 {

    final static int MAX = 100;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Persona [] person = new Persona[MAX];
        int cont = 0,opc = 1;
        while(opc!=3){
            do{
                System.out.println("1. Ingresar.");
                System.out.println("2. Mostrar");
                System.out.println("3. Salir.");
                opc = teclado.nextInt();
            }while(opc<1 || 3<opc);
            switch(opc){
                case 1: cont = ingresar(person,cont); break;
                case 2: mostrar(person,cont); break;
                case 3: break;
            }
                     
        }
    }
    public static int ingresar(Persona [] person,int cont){
        Scanner teclado = new Scanner(System.in);
        int n,i,opc;
        String nombre, apellido;
        long dni;
        boolean titulo;
        do{
            System.out.println("Cuantos Ing. en Informatica va a Ingresar:");
            n = teclado.nextInt();
        }while(n<0);
        for(i=cont;i<cont+n;i++){
            teclado.nextLine();
            System.out.println("Ingrese Ing. en Informatica:");
            System.out.println("Nombre:");
            nombre = teclado.nextLine();
            teclado.nextLine();
            System.out.println("Apellido:");
            apellido = teclado.nextLine();
            teclado.nextLine();
            System.out.println("DNI:");
            dni = teclado.nextLong();
            teclado.nextLine();
            System.out.println("Tiene Titulo");
            do{
                System.out.println("SI: 1 ; NO: 0");
                opc = teclado.nextInt();
            }while(opc!=0 && opc!=1);
            if(opc==1){ titulo=true;}else{titulo=false;}
            person[i] = new IngInformatico(titulo,nombre,apellido,dni);
        }
        cont+=n;
        
        do{
            System.out.println("Cuantos Lic. en Compiutacion va a Ingresar:");
            n = teclado.nextInt();
        }while(n<0);
        for(i=cont;i<cont+n;i++){
            System.out.println("Ingrese Lic. en Computacion:");
            teclado.nextLine();
            System.out.println("Nombre:");
            nombre = teclado.nextLine();
            teclado.nextLine();
            System.out.println("Apellido:");
            apellido = teclado.nextLine();
            teclado.nextLine();
            System.out.println("DNI:");
            dni = teclado.nextLong();
            teclado.nextLine();
            System.out.println("Tiene Titulo");
            do{
                System.out.println("SI: 1 ; NO: 0");
                opc = teclado.nextInt();
            }while(opc!=0 && opc!=1);
            if(opc==1){ titulo=true;}else{titulo=false;}
            person[i] = new LicEnComputacion(titulo,nombre,apellido,dni);
        }
        cont+=n;
        return cont;
    }
    public static void mostrar(Persona [] person, int cont){
        int i;
        for(i=0;i<cont;i++){
            System.out.println(person[i].titulo()+person[i].getNombre()+" "+person[i].getApellido());
        }
    }
}
