
package salary.tax.in.afghanistan;

import java.util.Scanner;
public class SalaryTaxInAfghanistan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter salary");
        double salary=input.nextInt();
        
        if(salary<=5000){
            
            System.out.println("salary is "+salary);
      
        }
                
        else if(salary<=12500){
            
               double tax=(salary-5000)*2/100;
               
               double Salary1=salary-tax;
               System.out.println("salary after teaking tax");
            System.out.println(Salary1);
        }
        else if(salary<=100000){
            
            double tax1=(12500-5000)*2/100;
            double tax2=(salary-12500)*10/100;
            
            double salary2=salary-(tax1+tax2); 
            System.out.println("salary after teaking tax");
            System.out.println(salary2); 
          
        }   
        else if(salary>100000){
            
           double tax1=(12500-5000)*2/100;
            double tax2=(100000-12500)*10/100;  
            double tax3=(salary-100000)*20/100;
            
            double salary3=salary-(tax1+tax2+tax3);
            
            System.out.println("salary after taeking tax");
            System.out.println(salary3);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
