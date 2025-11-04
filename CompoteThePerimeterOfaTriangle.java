
package compotetheperimeterofatriangle;

import java.util.Scanner;


public class CompoteThePerimeterOfaTriangle {

    
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Enter the length  three edges of triangle ");
        System.out.println("Enter a ");
        int a=input.nextInt();
        System.out.println("Enter b ");
        int b=input.nextInt();
        System.out.println("Enter c ");
        int c=input.nextInt();
        if(a+b > c){
            if(a+c > b){
                if(b+c > a){
                    System.out.println("The perimeter of triangle is "+(a+b+c));
                }
            }
        }else{
            System.out.println("The input is invalid ");
        }
      
    }
    
}
