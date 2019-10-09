
package switchcase;

import java.util.Scanner;


public class SwitchCase {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix la teva opció (A,B,C): ");
        char opcio = entrada.next().charAt(0);
        
        switch (opcio) {
            
            case 'a' :
            case 'A' : System.out.println("Has triat A");
                    break;
                    
            case 'b' :       
            case 'B' : System.out.println("Has triat B");
                    break;
                    
            case 'c' :        
            case 'C' : System.out.println("Has triat C");
                    break;
                   
            default : System.out.println("Opció incorrecta ");
        }
        
    }
    
}
