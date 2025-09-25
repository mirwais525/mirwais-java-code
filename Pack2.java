/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;

import java.util.Scanner;

public class Pack2 {

   
    public static void main(String[] args) {
        
        Scanner osmani = new Scanner(String.in);
        System.out.println("enter your name please" );
        String name=osmani.next();
        System.out.println("now enter your salary ");
        
        int salary=osmani.nextInt();


        System.out.println("welcome "+ name);
        System.out.println("your salary is "+ salary );

    }
    
}
