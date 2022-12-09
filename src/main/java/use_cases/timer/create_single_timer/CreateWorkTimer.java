package use_cases.timer.create_single_timer;

import entities.TimerTomato;

public class CreateWorkTimer  {

    /**
    Create a new work timer.
    * @param minute - the minutes of the work timer.
     */

    public static void createWorkTimer(int minute) {
        TimerTomato t = new TimerTomato(minute);
    }

}