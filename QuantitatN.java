/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quantitatn;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class QuantitatN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Introduir una quantitat N per teclat i : 
    // si n<500 restar-li un 5%
    // si n>=500 i n< 1000 restar-li un 8%
    // si n>=1000 i n<=5000 restar-li un 15%
    // si n>5000 restar-li un 25%
    // Visualitzar el resultat.

  Scanner entrada = new Scanner(System.in);
        System.out.print("Introduir una quantitat: ");
        int n = entrada.nextInt();
        int descompte;

        if (n < 500) {
            descompte = (n * 5) / 100;
            System.out.println(n - descompte);

        } else if (n >= 500 && n < 1000) {
            descompte = (n * 8) / 100;
            System.out.println(n - descompte);

        } else if (n >= 1000 && n <= 5000) {
            descompte = (n * 15) / 100;
            System.out.println(n - descompte);

        } else if (n > 5000) {
            descompte = (n * 25) / 100;
            System.out.println(n - descompte);
        }

    }
}
