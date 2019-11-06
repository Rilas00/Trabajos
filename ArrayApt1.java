/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapt1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ArrayApt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vector = new int[5];
        int i = 0;
        while (i < vector.length) {
            System.out.print("Inserta valor casella " + i + ": ");
            vector[i] = entrada.nextInt();
            i++;
        }
        i = 0;
        System.out.print("Valors: ");
        while (i < vector.length) {
            System.out.print(vector[i] + " ");
            i++;
        }
        System.out.println();
        int suma = 0;
        i = 0;
        while (i < vector.length) {
            suma += vector[i];
            i++;
        }
        double mitjana = (suma / vector.length);
        System.out.println("La suma es: " + suma);
        System.out.println("Mitjana: " + mitjana);
        System.out.print("Valors mes grans: ");
        i = 0;
        while (i < vector.length) {
            if (vector[i] > mitjana) {
                System.out.print(vector[i] + " ");
            }
            i++;
        }
        i = 0;
        System.out.println();
        System.out.print("Valors mes petits: ");
        while (i < vector.length) {
            if (vector[i] < mitjana) {
                System.out.print(vector[i] + " ");
            }
            i++;
        }
        System.out.println();
    }
}
