
package javaapplication20;

import java.util.Scanner;
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // calling method
        
        Scanner input=new Scanner(System.in);
        
        int number=input.nextInt();
        
        if(number%2==0 && number%3==0){
            
            System.out.println("Tis number divisible by 2 and 3"); 
          
        }
         if(number%2==0 || number%3==0){
            
         
            System.out.println("The number divisible by 2 or 3");
        }
         if(number%2==0 ^ number%3==0){
            
            System.out.println("number divisible by 3 or 2 not by both are");
        }
        else{
            
            System.out.println("no one ");
        }
    }
    
}
