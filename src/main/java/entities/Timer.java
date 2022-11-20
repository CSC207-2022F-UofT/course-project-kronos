package entities;

import java.io.Serializable;
import java.sql.Time;

public class Timer implements Serializable {


    private Time restTime;
    private Time workTime;
    private int timerCycle;
    private Time timeLeft;
    // timerState:
    // value 0 - stop
    // value 1 - on
    // value 2 - pause
    private int timerState;

    public Timer(){

    }
}
