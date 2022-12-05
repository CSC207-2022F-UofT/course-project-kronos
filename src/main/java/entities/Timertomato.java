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

    public TimerTomato(String workTime, String restTime, int timerCycle){
        TimerTomato.workTime = workTime;
        TimerTomato.restTime = restTime;
        TimerTomato.timerCycle = timerCycle;

    }
    public TimerTomato(){};

    public static void setWorkTime(String workTime) {
        TimerTomato.workTime = workTime;
    }

    public static void setRestTime(String restTime) {
        TimerTomato.restTime = restTime;
    }

    public void setTimerCycle(int timerCycle) {
        TimerTomato.timerCycle = timerCycle;
    }

    public static String getWorkTime() {
        return workTime;
    }

    public static String getRestTime(){
        return restTime;
    }

    public static int getTimerCycle() {
        return timerCycle;
    }

    public String getWork_timeLeft() {
        return work_timeLeft;
    }

    public String getRest_timeLeft() {
        return rest_timeLeft;
    }

    public int getTimeStatus(Timer timer){
        // timerState:
        // value 0 - stop
        // value 1 - on
        // value 2 - pause
        int timerState;
        if (timer.isRunning()){
            timerState = 1;
        }
        else if (!timer.isRunning()) {
            timerState = 0;
        }
        else  {
            timerState = 2;
        }
        return timerState;
    }


}
