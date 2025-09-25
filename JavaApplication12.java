/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JavaApplication1
    

    public static void main(String[] args) {
        
     Scanner input= new Scanner(System.in);
        System.out.println("enter price");
     double proprice=input.nextDouble();
        System.out.println("enter sale tax");
     double saletax=input.nextDouble();   
        double taxAmount=(saletax * proprice)/100;
        double totalproductprice = (taxAmount + proprice);
        
        System.out.printf("fainal pro price is %.2f",totalproductprice);
    }
    
}
