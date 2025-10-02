
package calculate.tips.pkg2.exercises;

import java.util.Scanner;
public class CalculateTips2Exercises {

  
    public static void main(String[] args) {
      
        Scanner input=new Scanner(System.in);
        System.out.println("enter gratuity rat");
        double gratuityrat=input.nextDouble();
        System.out.println("enter subtotal ");
        double subtotal=input.nextDouble();
        
        double gratuity=(gratuityrat*subtotal)/100;
        double total=gratuity+subtotal;
        
        System.out.println("gratuity "+gratuity);
        System.out.println("total " +total);
        
        
        
        
    }
    
}
