/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;




public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=1;i<=8;i++){
            for(int x=1;x<=i;x++){
                
                System.out.print(x+" ");
            }
            
            
            System.out.println(" ");
            
            
            
        }
      
        
        for(int i=8;i>=1;i--){
           for(int x=1;x<=i;x++){
               System.out.print(x+" ");
           } 
            System.out.println("");

        }
       
        for(int i=8;i>=1;i--){
            for(int x=8;x>=i;x--){
                System.out.print(x+" ");
            }
            
            System.out.println(""); 
        }
        
       for(int i=1;i<=8;i++){
            for(int x=8;x>=i;x--){
                System.out.print(x+" ");
            }
            
            System.out.println(""); 
        }
        
        
        
        
        
        
    }
}
