/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treballs.tema.pkg1.m3;
import java.util.Scanner; 
/**
 *
 * @author alumne
 */
public class TreballsTema1M3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     Scanner entrada = new Scanner(System.in);
    
    System.out.print("Introdueix un nombre enter: ");
    int enter = entrada.nextInt();

        if (enter%2==0) {
            System.out.println("És parell");
        }
        else{
            System.out.println("És imparell");
        }

        
    
    }
    
}
