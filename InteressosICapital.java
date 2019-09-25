/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interessos.i.capital;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class InteressosICapital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //  I = (c∗r∗t) / (360∗100)

    //I = Total de interessos produïts

    //c = Capital.

    //r = Taxa d'interès nominal en tant per cent.

    //t= Període de càlcul en dies. 
    
    Scanner teclat = new Scanner(System.in);
    double interessos;
    int capitalinicial;
    int temps;
    double taxa;
    double capitalfinal;
    
    System.out.println("Quants diners?");
    capitalinicial = teclat.nextInt();
    System.out.println(capitalinicial + " euros");
    System.out.println("Quants dies?");
    temps = teclat.nextInt();
    System.out.println(temps + " dies");
    System.out.println("Quina taxa?");
    taxa = teclat.nextInt();
    System.out.println(taxa + "%");
    interessos = (capitalinicial*taxa*temps)/(360*100);
    System.out.println("Els interessos guanyats son : " + interessos + " euros");
    capitalfinal = (capitalinicial + interessos); 
    
    System.out.println("El capital total és " + capitalfinal + "euros");
    
    
    
    
    
    }
    
}
