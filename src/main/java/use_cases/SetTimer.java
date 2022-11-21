package use_cases;

import entities.Timertomato;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SetTimer {

    private static final String workTime = Timertomato.getWorkTime();

    static String[] work = workTime.split("\\:");
    private static final int workTimer_minutes = Integer.parseInt(work[0]);
    private static final int workTimer_seconds = Integer.parseInt(work[1]);

    public static int getWorkTimer_seconds() {
        return workTimer_seconds;
    }

    public static int getWorkTimer_minutes() {
        return workTimer_minutes;
    }

    private static final String restTime = Timertomato.getRestTime();
    static String[] rest = restTime.split("\\:");
    private static final int restTimer_minutes = Integer.parseInt(rest[0]);
    private static final int restTimer_seconds = Integer.parseInt(rest[1]);

    public static int getRestTimer_seconds(){
        return restTimer_seconds;
    }

    public static int getRestTimer_minutes() {
        return restTimer_minutes;
    }

    public static Timer workTimer;
    public static Timer restTimer;

    private static int minutesRemaining;
    private static int secondsRemaining;

    public static void runWorkTimer(String workTime)
    {
        //System.out.println("Start Long " + String.format("%d", roundsCompleted));

        minutesRemaining = workTimer_minutes;
        secondsRemaining = workTimer_seconds;

        workTimer = new Timer(1000, (ActionEvent event) -> {
            if(secondsRemaining == 0)
            {
                if(minutesRemaining == 0)
                {
                    //continueBT.setVisible(false);
                    //stopBT.setVisible(true);
                    //startPauseBT.setVisible(true);
                    //roundsCompleted++;
                    TimerCycle.runMainTimer();
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
                secondsRemaining -= 1;
                //secondLabel.setText(String.format("%02d", secondsRemaining));
            }
        });

        workTimer.start();
    }

    public static void runRestTimer()
    {
        //System.out.println("Start Short " + String.format("%d", roundsCompleted));
        minutesRemaining = restTimer_minutes;
        secondsRemaining = restTimer_seconds;

        //minuteLabel.setText(String.format("%02d", ORIGINAL_SHORTBREAK_MINUTES));
        //secondLabel.setText(String.format("%02d", ORIGINAL_SHORTBREAK_SECONDS));

        restTimer = new Timer(1000, (ActionEvent event) -> {
            if(secondsRemaining == restTimer_seconds)
            {
                if(minutesRemaining == 0)
                {
                    //continueBT.setVisible(false);
                    // stopBT.setVisible(true);
                    //startPauseBT.setVisible(true);
                    //roundsCompleted++;
                    TimerCycle.runMainTimer();
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
                secondsRemaining -= 1;
                //secondLabel.setText(String.format("%02d", secondsRemaining));
            }
        });

        restTimer.start();
    }







}
