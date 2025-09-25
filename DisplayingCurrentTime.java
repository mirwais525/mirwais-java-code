
package displaying.current.time;

import static java.lang.System.currentTimeMillis;


public class DisplayingCurrentTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long totalmilliseconds=System.currentTimeMillis();
       
        long totalseconds=totalmilliseconds/100;
        
        long currentSeconds=totalseconds%60;
        long totalminut=totalseconds/60;
        
        long currentMinut=totalminut%60;
        long totalhours=totalminut/60;
        
        long currenthours=totalminut%24;
        
        System.out.println("Current Time "+currenthours+" : "+currentMinut+":"+currentSeconds+"GMT");
        
        
        
    }
    
}
