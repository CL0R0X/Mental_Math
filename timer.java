import java.util.Timer;
import java.util.TimerTask;

public class timer {
    private static int second = 0;
    static Timer timer = new Timer() ;
    static TimerTask task = new TimerTask() {
            public void run() {
                second++;                
            }            
        };
// problem unable to stop the timer

    public static void start(){
        timer.scheduleAtFixedRate(task, 100, 100);
    }
    
    public static void stop(){
        timer.cancel();
    }

    public static void displaySec() {
        System.out.println("It took you "+ second + " seconds to finish 10 problems to get " + (10 - counter.score()) + " questions wrong");
    }
}
