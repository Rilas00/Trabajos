/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diners;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Diners {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    // Escriu un programa que demani una quantitat entera de diners (en cèntims d'euro) i mostri per pantalla la quantitat mínima de monedes necessària per lliurar aquesta quantitat. Les monedes poden ser de 1, 2,5,10,20,50,100,200 cèntims d'euro.
    // Exemple:
    // Entrada
    // Introdueix una quantitat (cèntims euro): 123
    // sortida:
    // 1 monedes d'1 euro
    // 1 monedes de 20 cèntims
    // 1 moneda de 2 cèntims
    // 1 moneda de 1 cèntims
    // Comprova: 1. La quantitat sigui més gran o igual a zero    }
    
    Scanner entrada = new Scanner(System.in);
        System.out.print("Introduir una quantitat de cèntims: ");
        int centim = entrada.nextInt();

        // 1 euro
        int num1 = centim % 200; // Residu
        int num2 = centim / 200; // Quocient

        // 2 euros
        int num3 = num1 % 100; // Residu
        int num4 = num1 / 100; // Quocient

        // 50 cèntims
        int num5 = num3 % 50; // Residu
        int num6 = num3 / 50; // Quocient

        // 20 cèntims
        int num7 = num5 % 20; // Residu
        int num8 = num5 / 20; // Quocient

        // 10 cèntims
        int num9 = num7 % 10; // Residu
        int num10 = num7 / 10; // Quocient

        // 5 cèntims
        int num11 = num9 % 5; // Residu
        int num12 = num9 / 5; // Quocient

        // 2 cèntims
        int num13 = num11 % 2; // Residu
        int num14 = num11 / 2; // Quocient

        // 1 cèntim
        int num15 = num13 % 1; // Residu
        int num16 = num13 / 1; // Quocient

        System.out.println("Sortida:");
        
        if (num2 >0) {
            System.out.println(num2 + " monedes de 2 euros");
        }
        
        if (num4 >0) {
            System.out.println(num4 + " monedes d'1 euro");
        }
        
        if (num6 >0) {
            System.out.println(num6 + " monedes de 50 cèntims");
        }
        
        if (num8 >0) {
            System.out.println(num8 + " monedes de 20 cèntims");
        }
        
        if (num10 >0) {
            System.out.println(num10 + " monedes de 10 cèntims");
        }
        
        if (num12 >0) {
            System.out.println(num12 + " monedes de 5 cèntims");
        }
        
        if (num14 >0) {
            System.out.println(num14 + " monedes de 2 cèntims");
        }
        
        if (num16 >0) {
            System.out.println(num16 + " monedes de 1 cèntim");
        }
        
    }
}
