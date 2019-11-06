/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysapt8;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ArraysApt8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vector = new int[10];
        int i = 0, comptador = 0;
        while (i < vector.length) {
            System.out.print("Inserta valor casella " + i + ": ");
            vector[i] = entrada.nextInt();
            i++;
        }
        i = 0;
        int j = 1;
        while (i < vector.length) {
            if (vector[i] > vector[j]) {
                comptador++;
            }
            i++;
        }
        if (comptador != 8) {
            System.out.println("No es creixent.");
        } else {
            System.out.println("Es creixent.");
        }
        System.out.println("c " + comptador);
    }
}
