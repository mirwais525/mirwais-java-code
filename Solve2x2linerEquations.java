
package solve2x2linerequations;

import java.util.Scanner;


public class Solve2x2linerEquations {

    
    public static void main(String[] args) {
     
      Scanner input=new Scanner(System.in);  
       /*
      
      'a' is the multipule x from  first liner equation
      'c' Is the multipule x from seconde liner equation
      'b' Is the multipule y from first liner equation
      'd' Is the multipule y from second liner equation
      'e' Is the constant of first liner equation 
      'f' Is the constant of second liner equation
      
      */
        System.out.println("Enter a ");
      int a=input.nextInt();
      
        System.out.println("Enter b ");
      int b=input.nextInt();
      
        System.out.println("Enter c ");
      int c=input.nextInt();
      
        System.out.println("Enter d ");
      int d=input.nextInt();
      
        System.out.println("Enter e ");
      int e=input.nextInt();
      
        System.out.println("Enter f ");
      int f=input.nextInt();
      
      int poinOfNoSolu=b*c-a*d;
        
     if(poinOfNoSolu != 0){
         
       double X=(double)(e*d-b*f)/(a*d-b*c);
       
       double Y=(double)(a*f-e*c)/(a*d-b*c);
         
         System.out.println("X  = "+X+" \n  Y  = "+Y); 
         
        
     }   
     else {
         
         System.out.println(" The equation has no solution");
     }   
        
        
   
        
    }
    
}
