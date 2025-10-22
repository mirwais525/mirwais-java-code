
package populstionprojaction;

import java.util.Scanner;


public class PopulstionProjaction {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter year number to shown the population of that year ");
        int numberOfyear=input.nextInt();
        
        //the 2025 year population rate is 312032486
        //population in one  year is 4505142
        // date rate of year is 3266031
        //Imegrant rate  in one year is 700800
        int poplaOf2025=312032486;
        int detRate=3266031;
        int imegrantRate=700800;
        int year=numberOfyear-2025;
                
        int netPopulation=(year*4505142)+poplaOf2025-detRate+imegrantRate;
        
        System.out.println("this is the poplation of "+numberOfyear+"   ="+netPopulation);
        
        
        
        
        
        
    }
    
}
