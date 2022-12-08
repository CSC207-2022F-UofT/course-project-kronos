package use_cases.timer_use_cases;

import entities.TimerTomato;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SetTimer {

    private static final int workTimerMinutes = TimerTomato.getWorkTime();

    private static final int workTimerSeconds = 0;

    public static int getWorkTimerSeconds() {
        return workTimerSeconds;
    }

    public static int getWorkTimerMinutes() {
        return workTimerMinutes;
    }

    private static final int restTimerMinutes = TimerTomato.getRestTime();

    private static final int restTimerSeconds = 0;

    public static int getRestTimerSeconds(){
        return restTimerSeconds;
    }

    public static int getRestTimerMinutes() {
        return restTimerMinutes;
    }

    public static Timer workTimer;
    public static Timer restTimer;

    private static int minutesRemaining;
    private static int secondsRemaining;

    public static void runWorkTimer(int workTime)
    {

        minutesRemaining = workTimerMinutes;
        secondsRemaining = workTimerSeconds;

        workTimer = new Timer(1000, (ActionEvent event) -> {
            if(secondsRemaining == 0)
            {
                if(minutesRemaining == 0)
                {

                    TimerCycle.runMainTimer();
                }
                else
                {
                    minutesRemaining -= 1;
                    secondsRemaining = 59;
                }
            }
            else
            {
                secondsRemaining -= 1;
            }
        });

        workTimer.start();
    }

    public static void runRestTimer()
    {
        minutesRemaining = restTimerMinutes;
        secondsRemaining = restTimerSeconds;


        restTimer = new Timer(1000, (ActionEvent event) -> {
            if(secondsRemaining == restTimerSeconds)
            {
                if(minutesRemaining == 0)
                {
                    TimerCycle.runMainTimer();
                }
                else
                {
                    minutesRemaining -= 1;
                    secondsRemaining = 59;
                }
            }
            else
            {
                secondsRemaining -= 1;
            }
        });

        restTimer.start();
    }







}
