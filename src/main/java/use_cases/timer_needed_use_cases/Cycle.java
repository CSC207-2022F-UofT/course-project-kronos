package use_cases.timer_needed_use_cases;

import entities.TimerTomato;

import java.util.Timer;
import java.util.TimerTask;

public class Cycle {

    int cycle = TimerTomato.getTimerCycle();
    Timer timer = new Timer();

    public void timer_cycle(int cycle){
        for(final int[] i = {1}; i[0] <= cycle; i[0]++){

            timer.schedule(new TimerTask() {

                public void run() {
                    i[0]--;
                    System.out.println("Time Cycle Left" + i[0]);
                }
            }, 0, 60 * 1000);
        }
    }

}
