
package solvequadraticequations;

import java.util.Scanner;


public class SolveQuadraticEquations {

    
    public static void main(String[] args) {
    
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("   aXX+bX+c=0  ");
        System.out.println("Enter a, ");
        int a=input.nextInt();
        System.out.println("Enter b  ");
        int b=input.nextInt();
        System.out.println("Enter c");
        int c=input.nextInt();
        
        double dalta=b*b-4*a*c;
        
        if(dalta>=0){
        
       double X1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
       double X2=-(-b+Math.sqrt(b*b-4*a*c))/2*a;
       
       if(X1 != X2){
           
           
           System.out.println("It have towe  solutuions ");
           System.out.println("X1 = "+X1);
           System.out.println("X2 = "+X2);
           
           
       }
       if(X1 == X2){
           
           System.out.println("It have one solution ");
           System.out.println("X1 = "+X1);
       }
       
       
        } 
        if(dalta<0){
            
            System.out.println("Desn't have R solve");
        }
        
        
        
        
        
        
    }
    
}
