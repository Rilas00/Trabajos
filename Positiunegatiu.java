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
public class Positiunegatiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner entrada = new Scanner(System.in);

        System.out.print("Introduir un nombre enter: ");
        int enter = entrada.nextInt();
        
         if (enter>0) {
            System.out.println("És positiu");
        }
         else if (enter<0){
             System.out.println("És negatiu");
         }
        else{
            System.out.println("És zero");
    
         }
         }
    }
    

