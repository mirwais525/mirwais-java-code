
package nondation;

/**
 *
 * @author HP
 */
public class Nondation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long totalTimeMillis = System.currentTimeMillis();
        
        long totalSecond = totalTimeMillis/1000;
        long currentSecond =totalSecond%60;
        System.out.println(currentSecond);
       
        
        
    }
        
 
    
}