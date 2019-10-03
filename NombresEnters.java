/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombresenters;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class NombresEnters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Introduir dos nombres enters num1 i num2. Determinar quin és el més gran i deixar-lo en la variable z. Imprimir el valor de z amb el format: z=valor
    // Entrada:
    // num1: 4
    // num2: 6 
    // Sortida:
    // z = 6

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduir dos nombres enters: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int z;
        if (num1 > num2) {
            z = num1;
            System.out.println("z = " + z);
        } else if (num1 < num2) {
            z = num2;
            System.out.println("z = " + z);
        }
    }
}