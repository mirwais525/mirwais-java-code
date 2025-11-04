
package findnumberofdaysinmonth;

import java.util.Scanner;


public class FindNumberOfDaysInMonth {

    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in); 
        System.out.println("Enter number Of  Year ");
        int numOfYear=input.nextInt();
        System.out.println("Enter number of month ");
        int numOfMonth=input.nextInt();
        switch(numOfMonth){
            case 1: System.out.println("This is january Of "+numOfYear+" it has 31 days ");break; 
            case 2: System.out.println("This is feberuary Of "+numOfYear+"it has 28 if leap year 29 days ");break;
            case 3: System.out.println("This is March Of "+numOfYear+"it has 31 days ");break;
            case 4: System.out.println("This is Appril Of "+numOfYear+"it has 30 days ");break;
            case 5: System.out.println("This is May Of "+numOfYear+"it has 31 days ");break;
            case 6: System.out.println("This is jun Of "+numOfYear+"it has 30 days ");break;
            case 7: System.out.println("This is july Of "+numOfYear+"it has 31 days ");break;
            case 8: System.out.println("This is agusst Of "+numOfYear+"it has 31 days ");break;
            case 9: System.out.println("This is september Of "+numOfYear+"it has 30 days ");break;
            case 10: System.out.println("This is october Of "+numOfYear+"it has 31 days ");break;
            case 11: System.out.println("This is november Of "+numOfYear+"it has 30 days ");break;
            case 12: System.out.println("This is desember Of "+numOfYear+"it has 31 days ");break;
            default : System.out.println("Enter correct month Of number ");
        }
      
    }
    
}
