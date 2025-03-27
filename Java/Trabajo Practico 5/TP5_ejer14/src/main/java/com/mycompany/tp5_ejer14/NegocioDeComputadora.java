/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5_ejer14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.ListIterator;

/**
 *
 * @author USUARIO
 */
public class NegocioDeComputadora {
    ArrayList<Computadora> negocio;
    
    public NegocioDeComputadora(){
        negocio = new ArrayList<>();
    }
    public int tamaño(){
        return negocio.size();
    }
    
    public void agregarComputadora(Computadora computadora) {
        negocio.add(computadora);
        
    }
    public void imprimirVelocidad(float velocidad){
        System.out.println("Computadoras con velocidad de procesador de "+velocidad+"GHZ:");
        System.out.println("");
        ListIterator<Computadora> it = negocio.listIterator();
        while(it.hasNext()){
            Computadora comp = it.next();
            if(velocidad == comp.getVelocidadProcesador()){
            System.out.println(comp);
            System.out.println("");
            }
        }
    }
    public void imprimirPlaca(String placa){
        System.out.println("Computadoras con placa de video con la marca "+placa+":");
        System.out.println("");
        ListIterator<Computadora> it = negocio.listIterator();
        while(it.hasNext()){
            Computadora comp = it.next();
            if(placa.equals(comp.getMarcaPlacaVideo())){
            System.out.println(comp);
            System.out.println("");
            }
        }
    }
    public void imprimir(){
        ListIterator<Computadora> it = negocio.listIterator();
        while(it.hasNext()){
            Computadora comp = it.next();
            System.out.println(comp);
        }
    }
    
    
    public void imprimirStock(){
        HashMap <String,Integer> stock = new HashMap<String,Integer>();
        ListIterator<Computadora> it = negocio.listIterator();
        stock.put("Notebook", 0);
        stock.put("All In One", 0);
        while(it.hasNext()){
            Computadora comp = it.next();
            String tipo = comp instanceof Notebook? "Notebook":"All In One";
            stock.put(tipo, stock.get(tipo)+1);
            
        }
        System.out.println("Informe de stock:");
            for(String i : stock.keySet()){
            System.out.println(i+": "+stock.get(i));
        }
    }
    
    public void ordenarAscendenteVelocidadProcesador(){
        Collections.sort(negocio,new OrdenVelocidadProcesador());
        System.out.println("Lista de computadoras ordenadas por velocidad del procesador (ascendente):");
        
    }
    public void ordenarDescendenteCapacidadMemoria(){
        Collections.sort(negocio,new OrdenCapacidadMemoria());
        Collections.reverse(negocio);
        System.out.println("Lista de computadoras ordenadas por capacidad de memoria (descendente):");
        
    }
    public void ordenarAscendenteCapacidadDisco(){
        Collections.sort(negocio, new OrdenCapacidadDisco());
        System.out.println("Lista de computadoras ordenadas por capacidad de disco y memoria de video (ascendente):");
        
    }
    
    public class OrdenVelocidadProcesador implements Comparator<Computadora> {
        @Override
        public int compare(Computadora o1, Computadora o2){
            return Double.compare(o1.getVelocidadProcesador(),o2.getVelocidadProcesador());
        }
    }
    public class OrdenCapacidadMemoria implements Comparator<Computadora>{
        @Override
        public int compare(Computadora o1, Computadora o2){
            return Integer.compare(o1.getCapacidadMemoria(),o2.getCapacidadMemoria());
        }
    }
    public class OrdenCapacidadDisco implements Comparator<Computadora>{
        @Override
        public int compare(Computadora o1, Computadora o2){
            if(o1.getCapacidadDiscoGB()==o2.getCapacidadDiscoGB()){
                return Integer.compare(o1.getCapacidadMemoria(), o2.getCapacidadMemoria());
            }
            else{
                return Integer.compare(o1.getCapacidadDiscoGB(),o2.getCapacidadDiscoGB());
            }
        
        }
    
    
    }
    
}
