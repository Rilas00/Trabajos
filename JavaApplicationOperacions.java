/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.operacions;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JavaApplicationOperacions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       
        
        Scanner teclat = new Scanner(System.in);
        
    
      
      System.out.println("suma");
        int numero1;
        int numero2;
        System.out.println("Tria un numero");
        numero1 = teclat.nextInt();
        System.out.println("el primer numero triat es : " + numero1);
        System.out.println("Tria un altre numero");
        numero2 = teclat.nextInt();
        System.out.println("el segon numero triat es : " + numero2);
        System.out.println("La suma dels dos es : "+ (numero1 + numero2));
        
        
        
    
       
        System.out.println("resta");
        System.out.println("Tria un numero");
        numero1 = teclat.nextInt();
        System.out.println("el primer numero triat es : " + numero1);
        System.out.println("Tria un altre numero");
        numero2 = teclat.nextInt();
        System.out.println("el segon numero triat es : " + numero2);
        System.out.println("La resta dels dos es : "+ (numero1 - numero2));
        
        
        
        System.out.println("Multiplicació");
        System.out.println("Tria un numero");
        numero1 = teclat.nextInt();
        System.out.println("el primer numero triat es : " + numero1);
        System.out.println("Tria un altre numero");
        numero2 = teclat.nextInt();
        System.out.println("el segon numero triat es : " + numero2);
        System.out.println("La multiplicació dels dos es : "+ (numero1 * numero2));
        
        
        
        System.out.println("divisió");
        System.out.println("Tria un numero");
        numero1 = teclat.nextInt();
        System.out.println("el primer numero triat es : " + numero1);
        System.out.println("Tria un altre numero");
        numero2 = teclat.nextInt();
        System.out.println("el segon numero triat es : " + numero2);
        System.out.println("La divisió dels dos es : "+ (numero1 / numero2));
        
    }
    
}
