
package sortthreeintegers;

import java.util.Scanner;


public class SortThreeIntegers {

    
    public static void main(String[] args) {
      
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first integer ");
        int number1=input.nextInt();
        System.out.println("Enter second integer ");
        int number2=input.nextInt();
        System.out.println("Enter third integer ");
        int number3=input.nextInt();
        if(number1>number2){
            if(number1>number3){
               if(number2>number3){
                   System.out.println(number3+","+number2+","+number1); 
                 
               } 
               else{
                   System.out.println(number2+","+number3+","+number1);
               } 
            }
           
        }
        
          if(number2>number1){
            if(number2>number3){
               if(number1>number3){
                   System.out.println(number3+","+number1+","+number2); 
                 
               } 
               else{
                   System.out.println(number1+","+number3+","+number1);
               } 
            }
           
        }
        
          if(number3>number2){
            if(number3>number1){
               if(number2>number1){
                   System.out.println(number1+","+number2+","+number3); 
                 
               } 
               else{
                   System.out.println(number2+","+number1+","+number3);
               } 
            }
           
        }
        
        
        
        
    }
    
}
