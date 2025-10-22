
package physicsaceleration;

import java.util.Scanner;


public class PhysicsAceleration {

    
    public static void main(String[] args) {
        
        // a=  (v1-v2)/t1-t2      
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter first velasity");
        double V1=input.nextDouble();
        System.out.println("enter second velasity");
        double V2=input.nextDouble();
        System.out.println("enter time of first velasity");
        int t1=input.nextInt();
        System.out.println("enter time time of second velasity");
        int t2=input.nextInt();
        
        double acceleration= (V1-V2)/(t1-t2);
        
        System.out.println("this is the acceleration"+acceleration);
        
        
        
        
        
    }
    
}
