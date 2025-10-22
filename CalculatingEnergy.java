
package calculatingenergy;

import java.util.Scanner;


public class CalculatingEnergy {

    
    public static void main(String[] args) {
        /* formal of caiculating energy
        *Q=M* (finalTemperature - initialTemperature) * 4184
        *
        */
        Scanner input=new Scanner(System.in);
        System.out.println("enter amuont of water in kilograms");
        double M=input.nextDouble();
        System.out.println("enter IniTemp");
        double initialTemperature=input.nextDouble();
        System.out.println("enter final Temp");
        double finaltemperature=input.nextDouble();
        
        double Q=M * (finaltemperature-initialTemperature) *4184;
        
        System.out.println("this is the quantity  of energy"+Q);
        
  
        
    }
    
}
