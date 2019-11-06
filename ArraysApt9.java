/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysapt9;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ArraysApt9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mesPetit = Integer.MAX_VALUE;
        int mesGran = Integer.MIN_VALUE;
        Scanner entrada = new Scanner(System.in);
        int[] vector = new int[10];
        int i = 0;
        //Omplim el vector.
        while (i < vector.length) {
            System.out.print("Inserta un valor: ");
            vector[i] = entrada.nextInt();
            i++;
        }
        //Calcule els valors
        i = 0;
        while (i < vector.length) {
            if (vector[i] < mesPetit) {
                mesPetit = vector[i];
            } else if (vector[i] > mesGran) {
                mesGran = vector[i];
            }
            i++;
        }
        //Imprimim el vector
        i = 0;
        while (i < vector.length) {
            System.out.print(vector[i] + " ");
            i++;
        }
        System.out.println();
        System.out.println("El valor mes petit es: " + mesPetit);
        System.out.println("El valor mes gran es: " + mesGran);
    }
}
