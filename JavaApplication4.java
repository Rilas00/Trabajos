/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclat = new Scanner(System.in);
        
        int numero;
        int numero2;
        System.out.println("Tria un numero");
        numero = teclat.nextInt();
        System.out.println("el primer numero triat es : " + numero);
        System.out.println("Tria un altre numero");
        numero2 = teclat.nextInt();
        System.out.println("el segon numero triat es : " + numero2);
        System.out.println("La suma dels dos es : "+ (numero + numero2));
        
        
        
        
        
        
        
        
    }
    
}
