package entities;

import javax.swing.Timer;
public class TimerTomato {


    private static String restTime;
    private static String workTime;
    public static int timerCycle;
    private String work_timeLeft;
    private String rest_timeLeft;
    private Timer workTimer;
    private Timer restTimer;

    public TimerTomato(){}

    public TimerTomato(String workTime, String restTime, int timerCycle){
        TimerTomato.workTime = workTime;
        TimerTomato.restTime = restTime;
        TimerTomato.timerCycle = timerCycle;

    }


    /**
     * Set the minutes of the work Timer.
     * @param workTime - The minutes needs for the work timer.
     */

    public static void setWorkTime(String workTime) {
        TimerTomato.workTime = workTime;
    }

    /**
     * Set the minutes of the rest Timer.
     * @param restTime - The minutes needs for the rest timer.
     */

    public static void setRestTime(String restTime) {
        TimerTomato.restTime = restTime;
    }

    /**
     * Set the number of cycle needed for the loop of workTimer and restTimer.
     * @param timerCycle - The cycle needs for the work timer.
     */

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
