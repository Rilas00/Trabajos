/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homesdones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class HomesDones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    // Desenvolupar un programa que demani quants homes i quantes dones hi ha en una aula 
    // i que permeti calcular el percentatge d'homes i dones. 
    // S'ha de mostrar el missatge amb els valors calculats 
    // i indicant si el% d'homes és superior o inferior al de dones.
    
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduir la quantitat d'homes en l'aula: ");
    int homes = entrada.nextInt();
    
    System.out.print("Introduir la quantitat de dones en l'aula: ");
    int dones = entrada.nextInt();
    
    int aula = homes + dones;
    
    double percentatgeHomes = (homes * 100)/aula;
    double percentatgeDones = (dones * 100)/aula;
    
    System.out.println(percentatgeHomes + " % d'homes");
    System.out.println(percentatgeDones + " % de dones");
    
    

    }
    
}
