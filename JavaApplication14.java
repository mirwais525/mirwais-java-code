
package javaapplication14;

import java.util.Scanner;
public class JavaApplication14 {

   
    public static void main(String[] args) {
     
        Scanner input=new Scanner(System.in);
        System.out.println("enter many");
        double many=input.nextDouble();
        int cent=(int) (many*100);
        
        int dollar=(cent/100);
        cent=cent%100;
       int quater=cent/25;
       
       cent=cent%25;
       
       int dimes=cent/10;
       
       cent=cent%10;
       
       int nickle=cent/5;
       
       int pennies=cent%5;
       
        System.out.println("dollar "+dollar);
        System.out.println("quater "+quater);
        System.out.println("dimes "+dimes);
        System.out.println("nickle "+pennies);
        
       
       
     
        
//        int rem=(manybaycent%dollar*100);
//        int nickle=(rem/75);
//        int halfdollar=(rem/50);
//        int quater=rem/25;
       
        
        
        
        
        
        
        
    }
    
}
