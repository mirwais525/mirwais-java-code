
package converting.pound.to.kilogram.pkg2exersises;

import java.util.Scanner;
public class ConvertingPoundToKilogram2exersises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner input=new Scanner(System.in);
        System.out.println("enetr pound ");
       double pound=input.nextDouble();
        // 1 pound = 0.454 kilogram
        double kilogram=pound*0.454;        
        System.out.println("kilogram "+kilogram);  
    }
    
}
