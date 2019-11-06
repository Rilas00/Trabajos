/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysapt4;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class ArraysApt4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatori = new Random();
        int[] vector = new int[15];
        int[] vectorParell = new int[15];
        int i = 0, j = 0;
        while (i < vector.length) {
            vector[i] = aleatori.nextInt(50) + 50;
            if (vector[i] % 2 == 0) {
                vectorParell[j] = vector[i];
                j++;
            }
            i++;
        }
        i = 0;
        System.out.println("Vector original: ");
        while (i < vector.length) {
            System.out.print(vector[i] + " ");
            i++;
        }
//        System.out.println();
        i = 0;
        System.out.println("Vector parell: ");
        while (i < vectorParell.length) {
            System.out.print(vectorParell[i] + " ");
            i++;
        }
//        System.out.println();
    }
}
