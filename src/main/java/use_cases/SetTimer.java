package use_cases;

import entities.Timertomato;

import javax.swing.*;

public class SetTimer {

    private static final String workTime = Timertomato.getWorkTime();
    private static final String restTime = Timertomato.getRestTime();
    private static int workTime_minutes;
    private static int workTime_seconds;
    private static int restTimer_minutes;
    private static int restTimer_seconds;


    private Timer workTimer;
    private Timer restTimer;

    private int minutesRemaining;
    private int secondsRemaining;



}
