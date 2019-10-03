/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entermesgran;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EnterMesGran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Introduir dos nombres enters “a” i “b” que compleixin que a>b i calcular:
    // La suma
    // La resta
    // La multiplicació
    // La divisió
    // Si a<b donar un missatge de error.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduir dos nombres enters: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();

        int suma = a + b;
        int resta = a - b;
        int multiplicacio = a * b;
        int divisio = a / b;
        
        if (a>b) {
            System.out.println();
            System.out.println(a + " + " + b + " = " + suma);
            System.out.println(a + " - " + b + " = " + resta);
            System.out.println(a + " * " + b + " = " + multiplicacio);
            System.out.println(a + " / " + b + " = " + divisio);
        }
        else{
            System.out.println("ERROR: " + a + " no és més gran que " + b);
        }


    }
}