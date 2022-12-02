/*
package use_cases.timer_use_cases;

import entities.TimerTomato;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TimerCycle {
    private static final String workTime = TimerTomato.getWorkTime();

    private static final String restTime = TimerTomato.getRestTime();

    private static int TimeCycle;

    private static int roundsCompleted;

    private static int minutesRemaining;
    private static int secondsRemaining;

    private static Timer countDown;


    public static void runMainTimer()
    {
        //System.out.println("Start Main " + String.format("%d", roundsCompleted));
        if(roundsCompleted == TimeCycle)
        {
            //System.out.println("Stop Long " + roundsCompleted);
            SetTimer.workTimer.stop();
            roundsCompleted = 0; // Timer is Reset.
        }

        else if(roundsCompleted > 0 && roundsCompleted % 2 == 0)
        {
            //System.out.println("Stop Short " + roundsCompleted);
            SetTimer.restTimer.stop();
        }
        // else
        {
            System.out.println("Don't Stop Main " + roundsCompleted);
        }

        countDown = new Timer(1000, (ActionEvent event) -> {
            if(secondsRemaining == SetTimer.getWorkTimer_seconds())
            {
                if(minutesRemaining == 0)
                {
                    //startPauseBT.setText("Begin");
                    //startPauseBT.setActionCommand("Start");
                    //mainCompleted = false;
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
                    //minuteLabel.setText(String.format("%02d", minutesRemaining));
                    //secondLabel.setText(String.format("%02d", secondsRemaining));
                }
            }
            else
            {
                if(secondsRemaining > SetTimer.getWorkTimer_seconds())
                {
                    secondsRemaining -= 1;
                    //secondLabel.setText(String.format("%02d", secondsRemaining));
                }
            }
        });

        countDown.start();
    }
}
*/
