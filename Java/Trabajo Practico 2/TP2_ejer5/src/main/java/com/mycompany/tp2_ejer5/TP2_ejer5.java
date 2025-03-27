/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp2_ejer5;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class TP2_ejer5 {

    public static void main(String[] args) {
        Libro l = new Libro();
        int isbn,ndpaginas;
        String autor,titulo;
        
        Scanner teclado = new Scanner (System.in);
        do{
        System.out.println("Ingrese el ISBN del libro");
        isbn=teclado.nextInt();
        
                }while(isbn<=9999 || isbn>99999);
        l.setIsbn(isbn);
        
        do{
        System.out.println("cuantas paginas tiene el libro");
        ndpaginas=teclado.nextInt();
        }while(ndpaginas<=0);
        l.setPaginas(ndpaginas);
        
        System.out.println("autor del libro");
        autor=teclado.nextLine();
        l.setAutor(autor);
        
        System.out.println("Titulo del libro");
        titulo=teclado.nextLine();
        l.setTitulo(titulo);
        
        
        
        System.out.println(l.toString());
    }
}
