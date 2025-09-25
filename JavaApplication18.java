
package javaapplication18;
 
import java.util.Random;
import java.util.Scanner;


public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner input=new Scanner(System.in);
      
      int a=(int)(Math.random() *10);
      int b=(int)(Math.random() *10);
      
      int correctResalt=a+b;
       
        
       
      
      
        System.out.println(" a = "+a +" + b = "+b); 
        System.out.println("eter your answer");
        double Resalt=input.nextDouble();
        
        if(Resalt==correctResalt){
            
            System.out.println("trou answer");
            
        }else{
            
            System.out.println("not correct");
        }
                
        
       
        
        
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
