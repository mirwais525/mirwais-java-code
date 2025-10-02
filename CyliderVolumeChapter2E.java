
package cylider.volume.chapter2e;

import java.util.Scanner;
public class CyliderVolumeChapter2E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        System.out.println("enter radius");
        double radius=input.nextDouble();
        
        System.out.println("enter lenght");
        double lenght=input.nextDouble();
        
        
        double area=radius*radius*(3.14);
        double volume=lenght*area;
        
        
        System.out.println("sylider volume "+volume);
        
    }
    
}
