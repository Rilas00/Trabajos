/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.mitjanaaritm;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class SumaMitjanaaritm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclat = new Scanner(System.in);
    System.out.println("suma");
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int suma;
        float mitjana;
      
        
        System.out.println("Tria un numero");
        numero1 = teclat.nextInt();
        System.out.println("el primer numero triat es : " + numero1);
        System.out.println("Tria un altre numero");
        numero2 = teclat.nextInt();
        System.out.println("el segon numero triat es : " + numero2);
        System.out.println("Tria un altre numero");
        numero3 = teclat.nextInt();
        System.out.println("el tercer numero triat es : " + numero3);
        System.out.println("Tria l'ultim numero");
        numero4 = teclat.nextInt();
        System.out.println("el quart numero triat es : " + numero4);
        System.out.println("La suma dels quatre es : "+ (numero1 + numero2 + numero3 + numero4));
        suma = (numero1 + numero2 +numero3 +numero4);
        mitjana = (suma/4f);
        System.out.println("La mitjana aritmètica es : " + mitjana);
        
        
        
    
    }
    
}
