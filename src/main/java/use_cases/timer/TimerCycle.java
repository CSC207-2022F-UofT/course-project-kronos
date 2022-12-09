package use_cases.timer;


import entities.TimerTomato;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TimerCycle {
    private static final int workTime = TimerTomato.getWorkTime();

    private static final int restTime = TimerTomato.getRestTime();

    private static int TimeCycle;

    private static int roundsCompleted;

    private static int minutesRemaining;
    private static int secondsRemaining;

    private static Timer countDown;


    public static void runMainTimer()
    {

        if(roundsCompleted == TimeCycle)
        {

            SetTimer.workTimer.stop();
            roundsCompleted = 0; // Timer is Reset.
        }

        else if(roundsCompleted > 0 && roundsCompleted % 2 == 0)
        {

            SetTimer.restTimer.stop();
        }
        else
        {
            System.out.println("Don't Stop Main " + roundsCompleted);
        }

        countDown = new Timer(1000, (ActionEvent event) -> {
            if(secondsRemaining == SetTimer.getWorkTimerSeconds())
            {
                if(minutesRemaining == 0)
                {

                    roundsCompleted++;

                    // Selection of which break timer to run.
                    if(roundsCompleted == TimeCycle)
                    {
                        SetTimer.runWorkTimer(workTime);
                    }
                    else if(roundsCompleted > 0 && roundsCompleted % 2 == 0)
                    {
                        SetTimer.runRestTimer();
                    }
                }
                else
                {
                    minutesRemaining -= 1;
                    secondsRemaining = 59;

                }
            }
            else
            {
                if(secondsRemaining > SetTimer.getWorkTimerSeconds())
                {
                    secondsRemaining -= 1;
                }
            }
        });

        countDown.start();
    }
}
