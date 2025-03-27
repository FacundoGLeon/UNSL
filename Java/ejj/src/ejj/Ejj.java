/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejj;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class Ejj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc = 1;
        int arr [] = new int[0];
        int indice = 0;
        int tam = 0;
        while(opc != 7){
            do{
                System.out.println("MENU DE OPCIONES\n"+
                "<1> Crear un arreglo de tamaño x\n"+
                "<2> Ingresar sólo números pares en el arreglo\n"+
                "<3> Ingresar sólo números impares en el arreglo\n"+
                "<4> Calcular la tabla de multiplicar del numero x\n"+
                "<5> Imprimir el arreglo cargado\n"+
                "<6> Ingresar el nombre del usuario y saludarlo\n"+
                "<7> Salir\n"+
                "Ingrese una opcion:");
                opc = teclado.nextInt();
            }while(opc<1 || opc>7);
            switch(opc){
                case 1: 
                    arr = caso1();
                    tam = arr.length;
                    break;
                case 2: 
                    if(tam==0){
                        System.out.println("Por favor primero debe crear el arreglo.\n");
                    }else{
                        indice = caso2(arr,tam,indice);
                    }
                    break;
                case 3: 
                    if(tam==0){
                        System.out.println("Por favor primero debe crear el arreglo.\n");
                    }else{
                        indice = caso3(arr,tam,indice);
                    }
                    break;
                case 4: 
                    if(tam==0){
                        System.out.println("Por favor primero debe crear el arreglo.\n");
                    }else{
                        caso4(tam);
                    }
                    break;
                case 5: 
                    if(indice==0){
                        System.out.println("No hay datos cargados en el arreglo\n");
                    }else{
                        caso5(arr,indice);
                    }
                    break;
                case 6: caso6(); break;
                case 7: break;
            }
        
        
        
        }
    }
    
    
    public static int[] caso1(){
        Scanner teclado = new Scanner(System.in);
        int tam;
        do{
            System.out.println("Indique el tamaño del arreglo que desea crear:");
            tam = teclado.nextInt();
        }while(tam<1 || tam>100);
        return new int [tam];
    }
    public static int caso2(int [] arr, int tam, int indice){
        Scanner teclado = new Scanner(System.in);
        int par=0;
        while(tam!=indice && par%2==0){
            System.out.println("Ingrese numeros pares\n"+
            "Ingrese numero impar para finalizar la carga");
            par = teclado.nextInt();
            if(par%2==0){
                arr [indice] = par;
                indice++;
            }
        if(tam == indice){
            System.out.println("El arreglo esta lleno...");
        }
            
        }
        return indice;
    }
    public static int caso3(int [] arr, int tam, int indice){
        Scanner teclado = new Scanner(System.in);
        int impar=1;
        while(tam!=indice && impar%2!=0){
            System.out.println("Ingrese numeros impares\n"+
            "Ingrese numero par para finalizar la carga");
            impar = teclado.nextInt();
            if(impar%2!=0){
                arr [indice] = impar;
                indice++;
            }
            
        }
        if(tam == indice){
            System.out.println("El arreglo esta lleno...");
        }
        return indice;
    }
    public static void caso4(int tam){
        System.out.println("Tabla de multiplicacion del numero"+tam);
        for(int i=1;i<=10;i++){
            System.out.println(tam+" x "+i+" = "+tam*i);
        }
    }
    public static void caso5(int [] arr,int indice){
        System.out.println("El arreglo tiene los siguientes datos:");
        for(int i=0;i<indice;i++){
            System.out.println(arr[i]);
        }
    }
    public static void caso6(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = teclado.next();
        System.out.println("Saludos "+nombre+"!!!...");
    }
}
