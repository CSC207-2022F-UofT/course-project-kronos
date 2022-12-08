package entities;

import javax.swing.Timer;
import java.io.Serializable;

public class TimerTomato implements Serializable {


    private static int restTime;
    private static int workTime;
    public static int timerCycle;
    private static int workTimeLeft;
    private static int restTimeLeft;
    private Timer workTimer;
    private Timer restTimer;

    public TimerTomato(){}

    public TimerTomato(int workTime, int restTime, int timerCycle){
        TimerTomato.workTime = workTime;
        TimerTomato.restTime = restTime;
        TimerTomato.timerCycle = timerCycle;
        TimerTomato.workTimeLeft = workTime;
        TimerTomato.restTimeLeft = restTime;

    }

    public TimerTomato(int workTime){
        TimerTomato.workTime = workTime;
    }



    /**
     * Set the minutes of the work Timer.
     * @param workTime - The minutes needs for the work timer.
     */

    public void setWorkTime(int workTime) {
        TimerTomato.workTime = workTime;
    }

    /**
     * Set the minutes of the rest Timer.
     * @param restTime - The minutes needs for the rest timer.
     */

    public void setRestTime(int restTime) {
        TimerTomato.restTime = restTime;
    }

    /**
     * Set the number of cycle needed for the loop of workTimer and restTimer.
     * @param timerCycle - The cycle needs for the work timer.
     */

    public void setTimerCycle(int timerCycle) {
        TimerTomato.timerCycle = timerCycle;
    }

    public static int getWorkTime() {
        return workTime;
    }

    public static int getRestTime(){
        return restTime;
    }

    public static int getTimerCycle() {
        return timerCycle;
    }

    public static int getWorkTimeLeft() {
        return workTimeLeft;
    }

    public static int getRestTimeLeft() {
        return restTimeLeft;
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