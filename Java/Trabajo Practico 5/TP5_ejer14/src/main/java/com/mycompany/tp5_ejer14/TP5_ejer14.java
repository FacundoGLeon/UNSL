/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp5_ejer14;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TP5_ejer14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        NegocioDeComputadora inventario = new NegocioDeComputadora();
        int opc=1;
        while(opc!=9){
            do{
                System.out.println("1. Ingresar computadora");
                System.out.println("2. Imprimir computadoras por velocidad");
                System.out.println("3. Imprimir computadoras por marca de placa de video");
                System.out.println("4. Ordenar ascendente por Velocidades de los Procesadores");
                System.out.println("5. Ordenar descendente por Capacidad de Memoria");
                System.out.println("6. Ordenar ascendente por Capacidad de Disco o Capacidad de la Memoria");
                System.out.println("7. Informe de Stock:");
                System.out.println("8. Imprimir Stock");
                System.out.println("9. Salir");
                opc = teclado.nextInt();    
            }while(opc<1 || opc>9);
            switch(opc){
                case 1:
                    ingresar(inventario);
                    break;
                case 2:
                    if(inventario.tamaño()==0){
                        System.out.println("No hay datos cargados...");
                    }else{
                        imprimirPorVelocidad(inventario);
                    }
                    break;
                case 3:
                    if(inventario.tamaño()==0){
                        System.out.println("No hay datos cargados...");
                    }else{
                        imprimirPorPlaca(inventario);
                    }
                    break;
                case 4: 
                    if(inventario.tamaño()==0){
                        System.out.println("No hay datos cargados...");
                    }else{
                        inventario.ordenarAscendenteVelocidadProcesador();
                    }
                    break;
                case 5:
                    if(inventario.tamaño()==0){
                        System.out.println("No hay datos cargados...");
                    }else{
                        inventario.ordenarDescendenteCapacidadMemoria();
                    }
                    break;
                case 6: 
                    if(inventario.tamaño()==0){
                        System.out.println("No hay datos cargados...");
                    }else{
                        inventario.ordenarAscendenteCapacidadDisco();
                    }
                    break;
                case 7: 
                    inventario.imprimirStock();
                    break;
                case 8: 
                    if(inventario.tamaño()==0){
                        System.out.println("No hay datos cargados...");
                    }else{
                        inventario.imprimir();
                    }
                    break;
                case 9: break;
                
                
            }
        }
    }
    
    public static void ingresar(NegocioDeComputadora inventario){
        Scanner teclado = new Scanner(System.in);
        String marcaProcesador = null;
        float velocidadProcesador;
        int capacidadMemoria = 0;
        int capacidadDiscoGB = 0;
        int rpm;
        String marcaPlacaVideo = null;
        int capacidadPlacaVideoMB = 0;
        float capacidadBateria = 0;
        float peso;
        boolean perifericosBluetooth;
        int opc,tipo;
        do{
            System.out.println("QUE TIPO DE COMPUTADORA DESEA INGRESAR:");
            System.out.println("1)Notebook  /  2)All In One");
            tipo = teclado.nextInt();
        }while(tipo<1 || tipo>2);
        do{
            System.out.println("Indique Marca del Procesador:");
            System.out.println("1. AMD");
            System.out.println("2. Intel");
            opc = teclado.nextInt();
        }while(opc<1 || opc>2);
        switch(opc){
            case 1: marcaProcesador="AMD";break;
            case 2: marcaProcesador="Intel";break;
        }
        do{
            System.out.println("Ingrese Velocidad del Procesador:");
            System.out.println("1 GHz. a 4 GHz.");
            velocidadProcesador = teclado.nextFloat();
        }while(velocidadProcesador<1 || velocidadProcesador>4);
        do{
            System.out.println("Indique Capacidad de Memoria(RAM):");
            System.out.println("1. 4GB");
            System.out.println("2. 8GB");
            System.out.println("3. 16GB");
            System.out.println("4. 32GB");
            System.out.println("5. 64GB");
            opc = teclado.nextInt();
        }while(opc<1 || opc>5);
        switch(opc){
            case 1: capacidadMemoria=4;break;
            case 2: capacidadMemoria=8;break;
            case 3: capacidadMemoria=16;break;
            case 4: capacidadMemoria=32;break;
            case 5: capacidadMemoria=64;break;
        }
        do{
            System.out.println("Indique Capacidad de Disco en GB:");
            System.out.println("1. 160GB");
            System.out.println("2. 250GB");
            System.out.println("3. 320GB");
            System.out.println("4. 500GB");
            System.out.println("5. 1000GB");
            System.out.println("6. 1500GB");
            System.out.println("7. 2000GB");
            System.out.println("8. 2500GB");
            System.out.println("9. 3000GB");
            opc = teclado.nextInt();
        }while(opc<1 || opc>9);
        switch(opc){
            case 1: capacidadDiscoGB=160;break;
            case 2: capacidadDiscoGB=250;break;
            case 3: capacidadDiscoGB=320;break;
            case 4: capacidadDiscoGB=500;break;
            case 5: capacidadDiscoGB=1000;break;
            case 6: capacidadDiscoGB=1500;break;
            case 7: capacidadDiscoGB=2000;break;
            case 8: capacidadDiscoGB=2500;break;
            case 9: capacidadDiscoGB=3000;break;
        }
        do{
            System.out.println("Ingrese Revolucciones por Minuto del Motor del Disco:");
            System.out.println("5000 rpm. a 15000 rpm.");
            rpm = teclado.nextInt();
        }while(rpm<1 || rpm>4);
        do{
            System.out.println("Indique Marca de Placa de Video:");
            System.out.println("1. AMD AMD (BBA)");
            System.out.println("2. AMD ASRock");
            System.out.println("3. AMD Gigabyte");
            System.out.println("4. AMD MSI");
            System.out.println("5. AMD PowerColor");
            System.out.println("6. AMD Sapphire");
            System.out.println("7. AMD XFX");
            System.out.println("8. NVIDIA Gainward");
            System.out.println("9. NVIDIA Gigabyte");
            System.out.println("10. NVIDIA INNO3D");
            System.out.println("11. NVIDIA KFA2");
            System.out.println("12. NVIDIA MSI");
            System.out.println("13. NVIDIA Palit");
            System.out.println("14. NVIDIA PNY ");
            System.out.println("15. NVIDIA Zotac");
            opc = teclado.nextInt();
        }while(opc<1 || opc>15);
        switch(opc){
            case 1: marcaPlacaVideo="AMD AMD (BBA)";break;
            case 2: marcaPlacaVideo="AMD ASRock";break;
            case 3: marcaPlacaVideo="AMD Gigabyte";break;
            case 4: marcaPlacaVideo="AMD MSI";break;
            case 5: marcaPlacaVideo="AMD PowerColor";break;
            case 6: marcaPlacaVideo="AMD Sapphire";break;
            case 7: marcaPlacaVideo="AMD XFX";break;
            case 8: marcaPlacaVideo="NVIDIA Gainward";break;
            case 9: marcaPlacaVideo="NVIDIA Gigabyte";break;
            case 10: marcaPlacaVideo="NVIDIA INNO3D";break;
            case 11: marcaPlacaVideo="NVIDIA KFA2";break;
            case 12: marcaPlacaVideo="NVIDIA MSI";break;
            case 13: marcaPlacaVideo="NVIDIA Palit";break;
            case 14: marcaPlacaVideo="NVIDIA PNY ";break;
            case 15: marcaPlacaVideo="NVIDIA Zotac";break;
        }
        do{
            System.out.println("Indique Capacidad de la Placa de Video en MB:");
            System.out.println("1. 2048MB");
            System.out.println("2. 4096MB");
            System.out.println("3. 6144MB");
            System.out.println("4. 8192MB");
            System.out.println("5. 12288MB");
            System.out.println("6. 24576MB");
            opc = teclado.nextInt();
        }while(opc<1 || opc>6);
        switch(opc){
            case 1: capacidadPlacaVideoMB=2048;break;
            case 2: capacidadPlacaVideoMB=4096;break;
            case 3: capacidadPlacaVideoMB=6144;break;
            case 4: capacidadPlacaVideoMB=8192;break;
            case 5: capacidadPlacaVideoMB=12288;break;
            case 6: capacidadPlacaVideoMB=24576;break; 
        }
        if(tipo==1){
            do{
                System.out.println("Indique Capacidad de la Bateria:");
                System.out.println("1. 4400mAh");
                System.out.println("2. 5200mAh");
                System.out.println("3. 5600mAh");
                System.out.println("4. 5800mAh");
                opc = teclado.nextInt();
            }while(opc<1 || opc>4);
            switch(opc){
                case 1: capacidadBateria=4400;break;
                case 2: capacidadBateria=5200;break;
                case 3: capacidadBateria=5600;break;
                case 4: capacidadBateria=5800;break; 
            }
            do{
                System.out.println("Ingrese Peso en Kg.:");
                System.out.println("0.6kg. a 3.0kg.");
                peso = teclado.nextFloat();
            }while(peso<0.6 || peso>3.0);
            inventario.agregarComputadora(new Notebook(capacidadBateria,peso,marcaProcesador,velocidadProcesador,capacidadMemoria,capacidadDiscoGB,rpm,marcaPlacaVideo,capacidadPlacaVideoMB));
        }else{
            do{
                System.out.println("Indique si su Perifericos Soportan Bluetooth:");
                System.out.println("1 = SI  /   2 = NO");
                opc = teclado.nextInt();
            }while(opc<1 || opc>2);
            perifericosBluetooth = opc==1?true:false;
            inventario.agregarComputadora(new All_In_One(perifericosBluetooth,marcaProcesador,velocidadProcesador,capacidadMemoria,capacidadDiscoGB,rpm,marcaPlacaVideo,capacidadPlacaVideoMB));
        }
    }
    public static void imprimirPorVelocidad(NegocioDeComputadora inventario){
        Scanner teclado = new Scanner(System.in);
        float velocidadProcesador;
        do{
            System.out.println("Ingrese Velocidad del Procesador de las Computadoras que Desea Mostrar:");
            System.out.println("1 GHz. a 4 GHz.");
            velocidadProcesador = teclado.nextFloat();
        }while(velocidadProcesador<1 || velocidadProcesador>4);
        inventario.imprimirVelocidad(velocidadProcesador);
    }
    public static void imprimirPorPlaca(NegocioDeComputadora inventario){
        Scanner teclado = new Scanner(System.in);
        int opc;
        String marcaPlacaVideo=null;
        do{
            System.out.println("Indique Marca de Placa de Video de las Computadoras que Desea Mostrar:");
            System.out.println("1. AMD AMD (BBA)");
            System.out.println("2. AMD ASRock");
            System.out.println("3. AMD Gigabyte");
            System.out.println("4. AMD MSI");
            System.out.println("5. AMD PowerColor");
            System.out.println("6. AMD Sapphire");
            System.out.println("7. AMD XFX");
            System.out.println("8. NVIDIA Gainward");
            System.out.println("9. NVIDIA Gigabyte");
            System.out.println("10. NVIDIA INNO3D");
            System.out.println("11. NVIDIA KFA2");
            System.out.println("12. NVIDIA MSI");
            System.out.println("13. NVIDIA Palit");
            System.out.println("14. NVIDIA PNY ");
            System.out.println("15. NVIDIA Zotac");
            opc = teclado.nextInt();
        }while(opc<1 || opc>15);
        switch(opc){
            case 1: marcaPlacaVideo="AMD AMD (BBA)";break;
            case 2: marcaPlacaVideo="AMD ASRock";break;
            case 3: marcaPlacaVideo="AMD Gigabyte";break;
            case 4: marcaPlacaVideo="AMD MSI";break;
            case 5: marcaPlacaVideo="AMD PowerColor";break;
            case 6: marcaPlacaVideo="AMD Sapphire";break;
            case 7: marcaPlacaVideo="AMD XFX";break;
            case 8: marcaPlacaVideo="NVIDIA Gainward";break;
            case 9: marcaPlacaVideo="NVIDIA Gigabyte";break;
            case 10: marcaPlacaVideo="NVIDIA INNO3D";break;
            case 11: marcaPlacaVideo="NVIDIA KFA2";break;
            case 12: marcaPlacaVideo="NVIDIA MSI";break;
            case 13: marcaPlacaVideo="NVIDIA Palit";break;
            case 14: marcaPlacaVideo="NVIDIA PNY ";break;
            case 15: marcaPlacaVideo="NVIDIA Zotac";break;
        }
        inventario.imprimirPlaca(marcaPlacaVideo);
    }
}
