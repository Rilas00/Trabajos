/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysapt3;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class ArraysApt3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatori = new Random();
        int[] vector = new int[12];
        int[] vector2 = new int[12];
        int i = 0;
        while (i < vector.length) {
            vector[i] = aleatori.nextInt(100) + 1;
            vector2[i] = vector[i];
            vector2[i] = vector2[i] * 2;
            i++;
        }
        i = 0;
        System.out.println("Vector original: ");
        while (i < vector2.length) {
            System.out.print(vector[i] + " ");
            i++;
        }
        System.out.println();
        i = 0;
        System.out.println("Vector multiplicat: ");
        while (i < vector2.length) {
            System.out.print(vector2[i] + " ");
            i++;
        }
        System.out.println();
    }
}
