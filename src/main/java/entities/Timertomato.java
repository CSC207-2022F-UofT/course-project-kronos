package entities;

import javax.swing.Timer;
public class Timertomato {


    private static String restTime;
    private static String workTime;
    public static int timerCycle;
    private String work_timeLeft;
    private String rest_timeLeft;
    private Timer timer;

    public Timertomato(String workTime, String restTime, int timerCycle){
        this.workTime = workTime;
        this.restTime = restTime;
        this.timerCycle = timerCycle;

    }

    public static void setWorkTime(String workTime) {
        Timertomato.workTime = workTime;
    }

    public static void setRestTime(String restTime) {
        Timertomato.restTime = restTime;
    }

    public void setTimerCycle(int timerCycle) {
        Timertomato.timerCycle = timerCycle;
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
