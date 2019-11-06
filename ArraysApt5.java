/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysapt5;

/**
 *
 * @author alumne
 */
public class ArraysApt5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = {10, 3, 5, 6, 7, 8, 9, 7, 6, 3};
        int i = vector.length-1;
        while (i >= 0) {
            System.out.println(vector[i]);
            i--;
        }
    }
}
