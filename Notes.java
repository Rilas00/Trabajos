/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Notes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Demanar 4 notes d'un alumne, calcular i mostrar la seva mitjana, 
        // sabent que la 1ra i 2a tenen un 20% de pes cadascuna, 
        // la 3ra i 4ta tenen 30% de pes cadascuna. 
        // Si la nota és superior o igual a 5 mostrar el missatge "Aprovat."
        // En cas contrari posar "Suspès".
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = entrada.nextDouble();
        
        System.out.print("Nota 2: ");
        double nota2 = entrada.nextDouble();
        
        System.out.print("Nota 3: ");
        double nota3 = entrada.nextDouble();
        
        System.out.print("Nota 4: ");
        double nota4 = entrada.nextDouble();
        
        double calculNota1=(nota1*20)/100;
        double calculNota2=(nota2*20)/100;
        double calculNota3=(nota3*30)/100;
        double calculNota4=(nota4*30)/100;
        
        double notaFinal= (calculNota1 + calculNota2 + calculNota3 + calculNota4);
        
        if (notaFinal >= 5) {
            System.out.println("Aprovat");
        }
        else{
            System.out.println("Suspès");
        }
    }

}
