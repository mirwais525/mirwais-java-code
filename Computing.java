
package computing;

import java.util.Scanner;

public class Computing {

    
    public static void main(String[] args) {
        
        Scanner inpot=new Scanner(System.in);
        System.out.println("Enter x1 ");
        double x1=inpot.nextDouble();
        System.out.println("Enter y1 ");
        double y1=inpot.nextDouble();
        System.out.println("Enter x2");
        double x2=inpot.nextDouble();
        System.out.println("Enter y2 ");
        double y2=inpot.nextDouble();
        System.out.println("Enter x3 ");
        double x3=inpot.nextDouble();
        System.out.println("Enter y3 ");
        double y3=inpot.nextDouble();
        double a=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        double b=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        double c=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        
        double A=Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*c*b)));
        double B=Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
        double C=Math.toDegrees(Math.acos((c*c-a*a-b*b)/(-2*a*b)));
        System.out.println("The three angles of traingle  A ="+
               Math.round(A *100)/100.0+" "+
               Math.round(B*100 )/100.0 + " " 
                +Math.round(C* 100)/100.0);
        
        
        
        
        
    }
    
}
