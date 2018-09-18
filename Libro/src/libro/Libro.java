/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libro;

import java.util.Scanner;


public class Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Datos d=new Datos();
         Scanner Sc= new Scanner(System.in);
            libroa();
            librob();
            libroc();
            librod();
            libroe();
            

        
        
    
    }

    public static void libroa() {
        Scanner Sc=new Scanner(System.in);
        
        String nombre;
        String tamaño;
        String editorial;
        String genero = null;
        
        System.out.print("nombre del libro a: ");
        nombre=Sc.next();
        System.out.print("Tamaño del libro a: ");
        tamaño=Sc.next();
        System.out.print("Editorial del libro a: ");
        editorial=Sc.next();
        System.out.print("Genero del libro a: ");
        
        System.out.println("El Nombre es: "+nombre);
        System.out.println("El Tamaño es: "+tamaño);
        System.out.println("El Editorial es: "+editorial);
        System.out.println("El Genero es: "+genero);
        
    }

    private static void librob() {
         Scanner Sc=new Scanner(System.in);
        
        String nombre;
        String tamaño;
        String editorial;
        String genero = null;
        
        System.out.print("nombre del libro b: ");
        nombre=Sc.next();
        System.out.print("Tamaño del libro b: ");
        tamaño=Sc.next();
        System.out.print("Editorial del libro b: ");
        editorial=Sc.next();
        System.out.print("Genero del libro b: ");
        
        System.out.println("El Nombre es: "+nombre);
        System.out.println("El Tamaño es: "+tamaño);
        System.out.println("El Editorial es: "+editorial);
        System.out.println("El Genero es: "+genero);

    }

    private static void libroc() {
     
     Scanner Sc=new Scanner(System.in);
        
        String nombre;
        String tamanio;
        String editorial;
        String genero = null;
        
        System.out.print("nombre del libro c: ");
        nombre=Sc.next();
        System.out.print("Tamaño del libro c: ");
        tamanio=Sc.next();
        System.out.print("Editorial del libro c: ");
        editorial=Sc.next();
        System.out.print("Genero del libro c: ");
        
        System.out.println("El Nombre es: "+nombre);
        System.out.println("El Tamaño es: "+tamanio);
        System.out.println("El Editorial es: "+editorial);
        System.out.println("El Genero es: "+genero);
}

    private static void librod() {
      Scanner Sc=new Scanner(System.in);
        
        String nombre;
        String tamanio;
        String editorial;
        String genero = null;
        
        System.out.print("nombre del libro d: ");
        nombre=Sc.next();
        System.out.print("Tamaño del libro d: ");
        tamanio=Sc.next();
        System.out.print("Editorial del libro d: ");
        editorial=Sc.next();
        System.out.print("Genero del libro d: ");
        
        System.out.println("El Nombre es: "+nombre);
        System.out.println("El Tamaño es: "+tamanio);
        System.out.println("El Editorial es: "+editorial);
        System.out.println("El Genero es: "+genero);

    }

    private static void libroe() {
     
     Scanner Sc=new Scanner(System.in);
        
        String nombre;
        String tamanio;
        String editorial;
        String genero = null;
        
        System.out.print("nombre del libro e: ");
        nombre=Sc.next();
        System.out.print("Tamaño del libro e: ");
        tamanio=Sc.next();
        System.out.print("Editorial del libro e: ");
        editorial=Sc.next();
        System.out.print("Genero del libro e: ");
        
        System.out.println("El Nombre es: "+nombre);
        System.out.println("El Tamaño es: "+tamanio);
        System.out.println("El Editorial es: "+editorial);
        System.out.println("El Genero es: "+genero);    
    }

    
}
