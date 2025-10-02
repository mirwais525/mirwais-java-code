
package converting.feet.metetr2e;

import java.util.Scanner;
public class ConvertingFeetMetetr2E {

    
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        System.out.println("enter meter ");
        double feet=input.nextDouble();
        //1ft =0.3048       
        double meter=feet*0.3048;
        System.out.println("mter "+meter);
    }
    
}
