/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysapt2;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class ArraysApt2 {

    /**
     * @param args the command line arguments
     *
     * Assignar de forma aleatòria valors a un vector de 20 elements. Imprimir
     * la llista. Sumar-la. Calcular la mitjana. Mostrar els valors més grans a
     * la mitjana. Mostrar els valors més petits a la mitjana.
     *
     */
    public static void main(String[] args) {
        Random aleatori = new Random();
        int[] vector = new int[20];
        int i = 0, j = 0, suma = 0;
        double mitjana = 0;
        while (i < vector.length) {
            vector[i] = aleatori.nextInt(100);
            System.out.print(vector[i] + " ");
            suma = suma + vector[i];
            mitjana = suma / vector.length;
            i++;
        }
        System.out.println();
        System.out.println("La mitjana es: " + mitjana);
        System.out.println("Valors mes grans que la mitjana");
        while (j < vector.length) {
            if (vector[j] > mitjana) {
                System.out.print(vector[j] + " ");
            }
            j++;
        }
        j = 0;
        System.out.println();
        System.out.println("Valors mes petits que la mitjana:");
        while (j < vector.length) {
            if (vector[j] < mitjana) {
                System.out.print(vector[j] + " ");
            }
            j++;
        }
        System.out.println();
    }
}
