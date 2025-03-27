/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp5_ejer6;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TP5_ejer6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<String,String> diccionario = new HashMap<String,String>();
        int i,opc=1;
        while(opc!=6){
            do{
                System.out.println("1. Ingresa Palabra:");
                System.out.println("2. Consultar El Significado De Una Palabra:");
                System.out.println("3. Eliminar Una Palabra:");
                System.out.println("4. Consultar Cantidad De Palabras En El Diccionario:");
                System.out.println("5. Imprimir Todo El Diccionario:");
                System.out.println("6. Salir.");
                opc = teclado.nextInt();
            }while(opc<1 || opc>6);
            switch(opc){
                case 1: ingresaPalabra(diccionario);break;
                case 2: 
                    if(diccionario.size()!= 0){
                        consultarSignificado(diccionario);
                        
                    }
                    else{
                        System.out.println("No Hay Datos Cargados");
                    }break;
                case 3: 
                    if(diccionario.size()!= 0){
                        eliminarPalabra(diccionario);    
                    }
                    else{
                        System.out.println("No Hay Datos Cargados");
                    }break;
                case 4:
                    consultarCantidad(diccionario);break;
                case 5: 
                    if(diccionario.size()!= 0){
                        imprimirDiccionario(diccionario);
                    }
                    else{
                        System.out.println("No Hay Datos Cargados");
                    }break;
                case 6: break;
                
            }
        }
    }
    public static void ingresaPalabra(HashMap<String,String> diccionario){
        Scanner teclado = new Scanner(System.in);
        String palabra,significado;
        System.out.println("Ingrese la palabra:");
        palabra = teclado.next();
        teclado.nextLine();
        System.out.println("Ingrese su significado:");
        significado = teclado.nextLine();
        diccionario.put(palabra.toUpperCase(), significado);
    }
    public static void consultarSignificado(HashMap<String,String> diccionario){
        Scanner teclado = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese la palabra que desea saber su significado:");
        palabra = teclado.next();
       
        teclado.nextLine();
        if(diccionario.containsKey(palabra.toUpperCase())){
            System.out.println(palabra.toUpperCase()+": "+diccionario.get(palabra.toUpperCase()));
        }
        else{
            System.out.println("La palabra "+palabra.toUpperCase()+" no se encuentra en el diccionario.");
        }
    }
    public static void eliminarPalabra(HashMap<String,String> diccionario){
        Scanner teclado = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese la palabra que desea eliminar:");
        palabra = teclado.next();
        
        teclado.nextLine();
        if(diccionario.containsKey(palabra.toUpperCase())){
            diccionario.remove(palabra.toUpperCase());
            System.out.println("Palabra eliminada correctamente");
        }
        else{
            System.out.println("La palabra "+palabra.toUpperCase()+" no se encuentra en el diccionario.");
        }
    }
    public static void consultarCantidad(HashMap<String,String> diccionario){
        System.out.println("El diccionario tiene "+diccionario.size()+" palabras.");
    }
    public static void imprimirDiccionario(HashMap<String,String> diccionario){
        for(String i : diccionario.keySet()){
            System.out.println(i+": "+diccionario.get(i));
        }
    }
}
