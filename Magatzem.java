/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magatzem;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Magatzem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Al realitzar una compra en un cert magatzem, si la quantitat comprada d'un mateix article és de:
    // 100 unitats o més ens fan un descompte d’un 40%
    // entre 25 i 100 unitats un 20%
    // entre 10 i 24 un 10%
    // i no hi ha descompte per una compra igual o inferior a 10 unitats.
    // Es demana calcular l’import a pagar.
    // Entrada:
    // Introdueix el codi de l'article: 111
    // Introdueix la quantitat: 150
    // Introdueix el preu de l'article: 10
    // Sortida:
    // Article Quantitat       Preu    Descompte       Total
    // 111      150            10      40%             900.0
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduir una quantitat: ");
        int quantitat = entrada.nextInt();
        int descompte;
        if (quantitat >= 100) {
            descompte = (quantitat * 40) / 100;
            System.out.println(quantitat - descompte);            
        } else if (quantitat < 100 && quantitat > 24) {
            descompte = (quantitat * 20) / 100;
            System.out.println(quantitat - descompte);
        } else if (quantitat > 10 && quantitat < 25) {
            descompte = (quantitat * 10) / 100;
            System.out.println(quantitat - descompte);            
        } else if (quantitat <= 10) {
            System.out.println(quantitat);
        }
    }
}
