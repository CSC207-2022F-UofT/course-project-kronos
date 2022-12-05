package entities;

import javax.swing.Timer;
import java.io.Serializable;

public class TimerTomato implements Serializable {


    private static String restTime;


    private static String workTime;
    public static int timerCycle;
    private String work_timeLeft;
    private String rest_timeLeft;
    private Timer timer;

    public TimerTomato(String workTime, String restTime, int timerCycle) {
        this.workTime = workTime;
        this.restTime = restTime;
        this.timerCycle = timerCycle;
    }
}

