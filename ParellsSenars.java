/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parellssenars;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ParellsSenars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Demanar un nombre enter i dir si és parell o senar.
          Scanner entrada = new Scanner(System.in);
        System.out.print("Introduir un nombre enter: ");
        int enter = entrada.nextInt();
        
        if (enter%2==0) {
            System.out.println("És parell");
        }
        else{
            System.out.println("És senar");
        }
    }
}