
package Switchh;

import java.util.Scanner;


public class Switch1 {

    
    public static void main(String[] args) {
       
    Scanner entrada = new Scanner(System.in);
            
    System.out.println("introdueix un mes del any del 1 al 12");
                    
    int mes = entrada.nextInt();
            
     switch (mes){            
             
     case 1 : System.out.println("Gener");
       break;             
     case 2 : System.out.println("Febrer");
      break;
     case 3 : System.out.println("Març");
    break;
     case 4 : System.out.println("Abril");
     break;
     case 5 : System.out.println("Maig");
     break;
     case 6 : System.out.println("Juny");
     break;
     case 7 : System.out.println("Juliol");
     break;
     case 8 : System.out.println("Agost");
     break;
     case 9 : System.out.println("septembre");
     break;
     case 10 : System.out.println("Octubre");
     break;
     case 11 : System.out.println("Novembre");
     break;
     case 12 : System.out.println("decembre");
    }
    
}
}