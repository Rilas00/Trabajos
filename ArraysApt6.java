/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysapt6;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ArraysApt6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vector = new int[10];
        int i = 0;
        while (i < vector.length) {
            System.out.println("Inserta valor: ");
            int valor = entrada.nextInt();
            if (valor > 0) {
                vector[i] = valor;
                i++;
            }else {
                System.out.println("El valor no pot ser negatiu.");
            }
        }
        for (int j = 0; j < vector.length; j++) {
            System.out.print(vector[j] + " ");
        }
    }

}
