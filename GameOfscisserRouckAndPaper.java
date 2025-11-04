
package gameofscisser.rouck.andpaper;

import java.util.Scanner;


public class GameOfscisserRouckAndPaper {

   
    public static void main(String[] args) {
      int random=(int)(Math.random()*2);
        
        Scanner input=new Scanner(System.in);
        System.out.println("number 0 show scissor ");
        System.out.println("number 1 show  rock ");
        System.out.println("number 2 show paper ");
        
        System.out.println("Enumber on digit ");
        int number=input.nextInt();
        if(number==0 && random==0){
            System.out.println("The computer is scisser,you are scisser too , It is a draw ");
        }
        if(number==1 && random==1){
            System.out.println("The computer is rock ,you are rock too, It is a draw ");
        }
        if(number==2 && random==2){
            System.out.println("The computer is paper ,you are rock too, It is a draw ");
        }
       if(number==1 && random==0){
            System.out.println("The computer is scisser ,you are rock , You wine  ");
        } if(number==1 && random==2){
            System.out.println("The computer is paper ,you are rock , You lose ");
        }
        if(number==0 && random==1){
            System.out.println("The computer is rock ,you are scisser, yuo lose ");
        }
        if(number==0 && random==2){
            System.out.println("The computer is paper ,you are scisser, you wine ");
        }
        if(number==2 && random==1){
            System.out.println("The computer is rock ,you are paper, you wine  ");
        }
        if(number==2 && random==0){
            System.out.println("The computer is scisser ,you are paper, you lose ");
        }
        else{
            System.out.println("Enter correct number ");
        }
        
    }
    
}
