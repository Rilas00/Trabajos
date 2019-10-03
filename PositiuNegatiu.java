/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positiunegatiu;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PositiuNegatiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Demanar dos nombres enters i dir quin és el més gran o si són iguals.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduir dos nombres enters: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " és més gran que " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " és més gran que " + num1);
        }
        else{
            System.out.println("Són iguals");
        }
    }
}


