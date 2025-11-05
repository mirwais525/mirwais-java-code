
package geometry.pointincircale;

import java.util.Scanner;

public class GeometryPointInCircale {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Enter point (x,y) point\n Enter x ");
        int x=input.nextInt();
        int y=input.nextInt();
        double distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        if(distance>10){
            System.out.println("The point is outside of circale ");
        }else{
            System.out.println("The point is inside the circale ");
        }
       
    }
    
}
