
package displaying.taime.pkg2;

import java.util.Scanner;
public class DisplayingTaime2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner input=new Scanner(System.in);
        System.out.println("enetr seconds ");
        int second=input.nextInt();
        
        int minuts=second/60;
        
        int sec=second%60;
        
        
        System.out.println("minuts "+minuts+"seconds "+sec);
        
    }
    
}
