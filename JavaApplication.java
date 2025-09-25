
package javaapplication;

import java.util.Scanner;
public class JavaApplication {

    // BMI           BMI               BMI
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter haight bay m");
        double height=input.nextDouble();
        System.out.println("enter weight");
        double waight=input.nextDouble();
        
        double BMI=(waight/(height*height));
        
        if(BMI<18.5){
            
            System.out.println("Underweight");
            
            
        }
        
        else if(BMI<25.0){
            
            
             
                System.out.println("normal");
            
              
        }else if(BMI<30.0){
            
                
                System.out.println("Overweight");
            
            
          
        }else if(BMI>30.0){
            
            System.out.println("Obese");
        }

      
    }
    
}
