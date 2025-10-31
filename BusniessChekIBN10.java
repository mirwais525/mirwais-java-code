
package busniesschekibn.pkg10;

import java.util.Scanner;

public class BusniessChekIBN10 {

    
    public static void main(String[] args) {
       
      Scanner input=new Scanner(System.in);
        System.out.println("Enter first number ");
      int num1=input.nextInt();
        System.out.println("Enter second number ");
      int num2=input.nextInt();
        System.out.println("Enter third number ");
      int num3=input.nextInt();
        System.out.println("Enter fourth number ");
      int num4=input.nextInt();
        System.out.println("Enter fifth number ");
      int num5=input.nextInt();
        System.out.println("Enter sixth number ");
      int num6=input.nextInt();
        System.out.println("Enter seventh number ");
      int num7=input.nextInt();
        System.out.println("Enter eighth number ");
      int num8=input.nextInt();
        System.out.println("Enter ninth number ");
      int num9=input.nextInt();
        
       int num10=(num1*1+num2*2+num3*3+num4*4+num5*5+num6*6+num7*7+num8*8+num9*9)%11; 
        if(num10!=10){
            
            System.out.println("ISBN is "+num1+num2+num3+num4+num5+num6+num7+num8+num9+num10);
        }
        else{
            
            System.out.println("ISBN is "+num1+num2+num3+num4+num5+num6+num7+num8+num9+"X");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
