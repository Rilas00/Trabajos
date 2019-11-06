/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysapt7;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ArraysApt7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vector = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println("Inserta un valor: ");
        int valor = entrada.nextInt();
        int i = 0;
        while (i < vector.length) {
            if (valor == vector[i]) {
                System.out.println("Es troba en la llista.");
            } else {
                System.out.println("NO es troba en la llista");
            }
            i++;
        }
    }
}
