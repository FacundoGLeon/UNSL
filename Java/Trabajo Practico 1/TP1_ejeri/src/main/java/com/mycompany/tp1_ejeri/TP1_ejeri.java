/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejeri;

import java.util.Scanner;


public class TP1_ejeri {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] nros = null;
        int opcion = 1,x = -1;
        while(opcion>=1 && opcion<=6){
            do{
                System.out.println("1)Crear un Arreglo del Tamaño x");
                System.out.println("2)Ingresa Solo Numeros Pares en el Arreglo");
                System.out.println("3)Ingresa Solo Numeros Impares en el Arreglo");
                System.out.println("4)Calcular la Tabla de Multiplicar del Numero x");
                System.out.println("5)Imprimir el Arreglo Cargado");
                System.out.println("6)Ingresar el Nombre del Usuario y Saludarlo");
                System.out.println("Ingrese Una Opcion:");
                opcion = teclado.nextInt();
            }while(opcion<1 || opcion>6);
            
            switch(opcion){
                case 1: 
                    do{
                        System.out.println("Ingresa Tamaño x del Arreglo:");
                        x = teclado.nextInt();
                    }while(x<=0 || x>20);
                    nros = new int[x];
                    break;
                case 2: 
                    if(x==-1){
                        System.out.println("Primero Debe Crear el Arreglo: ");
                    }
                    else{
                        Carga_Par_Impar(nros,0);
                    }
                    break;
                case 3:
                    if(x==-1){
                        System.out.println("Primero Debe Crear el Arreglo: ");
                    }
                    else{
                        Carga_Par_Impar(nros,1);
                    }
                    break;
                case 4:
                    if(x==-1){
                        System.out.println("Primero Debe Crear el Arreglo Para Ingresar x: ");
                    }
                    else{
                        Tabla(x);
                    }
                    break;
                case 5:
                    if(x==-1){
                        System.out.println("Primero Debe Crear el Arreglo Antes de Mostrar: ");
                    }
                    else{
                        Imprimir(nros,x);
                    }
                    break;
                case 6:
                    Saludar();
            }
            
            
            
        }
    }
    
    public static void Carga_Par_Impar(int [] arr, int n){
        Scanner teclado = new Scanner(System.in);
        int i;
        for(i=0;i<arr.length;i++){
            if(n==0){
                do{
                    System.out.println("Ingresa Numero Par:");
                    arr[i] = teclado.nextInt();
                }while(arr[i]%2!=0);
            }
            else{
                do{
                    System.out.println("Ingresa Numero Impar:");
                    arr[i] = teclado.nextInt();
                }while(arr[i]%2==0);
            }
        }
    }
    
    public static void Tabla(int x){
        int i;
        System.out.println("Tabla de Multiplicar del Numero "+x+": ");
        for(i=1;i<=10;i++){
            System.out.println(x+" x "+i+" = "+(x*i));
        }
        
    }
    
    public static void Imprimir(int [] arr, int t){
        int i;
        System.out.println("Carga del Arreglo: ");
        for(i=0;i<t;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(".");
        System.out.println("");
    }
    
    public static void Saludar(){
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su Nombre: ");
        nombre = teclado.next();
        System.out.println("Saludos Sr/a: "+nombre);
    }
}
