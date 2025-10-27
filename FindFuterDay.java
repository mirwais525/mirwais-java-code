
package findfuterday;

import java.util.Scanner;


public class FindFuterDay {

    
    public static void main(String[] args) {
        
       Scanner input=new Scanner(System.in); 
        /*
       1=saterday
       2=sanday
       3=Monday
       4=Tuosday
       5=Wendsday
       6=thursday
       7=fraiday
       
       */
        // What is today 
        System.out.println("What is today Enter number of day ");
        int numOfToDay=input.nextInt();
         System.out.println("Enter number of futer day");
        int futerDayNum=input.nextInt();
        
        int day=numOfToDay+futerDayNum;
        int rem=day%7;
        
        switch(rem){
            
            case 1: System.out.println("To day is saterday ");break;
            case 2: System.out.println(" To day is sanday ");break;
            case 3: System.out.println(" To day is monday ");break;
            case 4: System.out.println("To day is Tuosday ");break;
            case 5: System.out.println("To day is Wendsday");break;
            case 6: System.out.println("To day is Thursday");break;
            case 7: System.out.println("To day is Fraiday");break;
            
          
        }
        
        
        
        
        
        
        
        
    }
    
}
