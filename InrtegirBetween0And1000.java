
package inrtegir.between.pkg0.and.pkg1000;

import java.util.Scanner;
public class InrtegirBetween0And1000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);   
        System.out.println("enter number"); 
        int numb=input.nextInt();
        if(numb<1000){
            if(numb>0){
              int a=numb%10;
              
              int dele1dig=numb/10;
              
              int b=dele1dig%10;
              
              int del2dig=dele1dig/10;
              
              int c=del2dig%10;
              
              int theSumOfDigit=a+b+c;
              
                System.out.println("The sum of the digit is "+theSumOfDigit);
                
                
            }
         
        }else if(numb>=1000){
            
            System.out.println("enter number between 0 and 1000");
            
        }
       
        
        
    }
    
}
