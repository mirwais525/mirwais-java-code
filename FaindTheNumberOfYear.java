
package faind.the.number.of.year;

import java.util.Scanner;
public class FaindTheNumberOfYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        long minutes=input.nextLong();
        
        //1year =525600 minutes
        long year=minutes/525600;
        
        long remMin=minutes%525600;
        
        long day=remMin/1440;
        System.out.println("year  "+year +"day "+day ); 
    }
    
}
