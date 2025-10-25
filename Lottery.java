
package lottery;

import java.util.Scanner;


public class Lottery {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int Lattrey=(int)(Math.random()*100);
         
        System.out.println("Enter guess towdigits");
        int guess=input.nextInt();
        
        int LatteryDigit1=Lattrey/10;
        int LatteryDigit2=Lattrey%10;
        
        int guessDigit1=guess/10;
        int guessDigit2=guess%10;
        
       
        
         System.out.println("The lottery number is "+Lattrey);       
        if(guess==Lattrey){
            System.out.println("you win 10000$");
        }
        else if(guessDigit1==LatteryDigit2
                && guessDigit2==LatteryDigit1){
            
            System.out.println("You win 3000$");
        }
        else if(guessDigit1==LatteryDigit1
               || guessDigit1==LatteryDigit2
                || guessDigit2==LatteryDigit1
                || guessDigit2==LatteryDigit2){
            
            System.out.println("You win 1000$");
        }
        else{
            System.out.println("You lose the game");
        }
        
        
        
        
        
    }
    
}
