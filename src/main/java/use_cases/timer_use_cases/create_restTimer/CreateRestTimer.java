package use_cases.timer_use_cases.create_restTimer;

import entities.TimerTomato;

public class CreateRestTimer {

    /**
     Create a new work timer.
     * @param m - the minutes of the work timer.
     */

    public static void createRestTimer(int m) {
        TimerTomato t = new TimerTomato(m);
    }
}
