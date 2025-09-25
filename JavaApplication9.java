/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author HP
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String condation ="Rainy";
        
        Scanner osmani = new Scanner(System.in);
        System.out.println("enter waether");
        String waether = osmani.nextLaine();
        
        if(waether.equals(condation)){
            System.out.println("do not go today");
        }
            
            
            
    }
    
}
