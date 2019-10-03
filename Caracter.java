/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracter;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Caracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Introduir un caràcter ('+', '-', '*', '/' ) i dos nombres enters. 
        // Si el caràcter llegit és un operador matemàtic calcular
        // i visualitzar l’operació corresponent. 
        // Si no hi ha cap símbol d'operació, mostrar un simbol d'error.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduir dos nombres enters: ");
        int enter1 = entrada.nextInt();
        int enter2 = entrada.nextInt();
        System.out.println();

        char operacio;
        System.out.println("Introduir una operació: ");
        System.out.println("Suma --> '+'");
        System.out.println("Resta --> '-'");
        System.out.println("Multiplicació --> '*'");
        System.out.println("Divisió --> '/'");
        System.out.println();
        operacio = entrada.next().charAt(0);
                        
        // Suma
        if (operacio=='+') { 
            System.out.println(enter1 + " + " + enter2 + " = " + (enter1 + enter2));
        }
        
        // Resta
        else if (operacio=='-') { 
            System.out.println(enter1 + " - " + enter2 + " = " + (enter1 - enter2));
        }
        
        // Multiplicació
        else if (operacio=='*') { 
            System.out.println(enter1 + " * " + enter2 + " = " + (enter1 * enter2));
        }
        
        // Divisió
        else if (operacio=='/') { 
            System.out.println(enter1 + " / " + enter2 + " = " + (enter1 / enter2));
        }
        
        else{
            System.out.println("ERROR");
        }
        

    }

}
