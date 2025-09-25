
package javaapplication13;

import java.util.Scanner;




public class JavaApplication13 {


    
    
    public static void main(String[] args) {
    
           Scanner loanpayment=new Scanner(System.in);
           System.out.println("enter loanamount");
           double loanamount=loanpayment.nextDouble();
           System.out.println("enter monthlyInterestRate");
           double monthlyInterestRate=loanpayment.nextDouble();
           
           double monthlypayment=(loanamount*monthlyInterestRate)/(1-(1/1+monthlyInteresteRate));
        
        System.out.println(monthlyInterestRate);
        
        
        
        
        
        
        
        
        
    }
    
}
