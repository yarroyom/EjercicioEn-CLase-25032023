/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reproductor;

import java.util.Scanner;

/**
 *
 * @author Fernanda
 */
public class ListaCanciones {
    NodoMusic primero;

    public ListaCanciones(){
        primero= null;
                }

       private String leerCancion(){
        System.out.println("Ingrese valor, -1 para terminar");
        return (new Scanner(System.in).nextLine());
        
    }
    public ListaCanciones crearLista(){
       String x;
        primero = null;
        do{
            
            x = leerCancion();
            if ( x != -1){
            primero = new NodoMusic( x,primero);
        }
        }
            while (x != -1);
        return this;
        
        }
     public ListaCanciones insertarCabezLista (int entrada){
        Cancion nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }
    
    
    public void visuaLizar(){
        Nodo n;
        int k = 0;
        n = primero ;
        while ( n!=null)
            System.out.println(n.dato+"");
             n= n.enlace;
             k++;
               System.out.print((k%15 !=0 ? " ": "\n"));
    }
}
