package use_cases.timer_use_cases.edit_timer;

import javax.swing.*;
/**
 * Output data related to the creation of timer.
 */
public class EditTimerOutputData {

    private final Timer timer;

    /**
     * Constructor that timer edited successfully.
     */

    public EditTimerOutputData(Timer timer) {
        this.timer = timer;
    }

    /**
     * @return the work timer.
     */
    public Timer getTimer(){
        return timer;
    }
}

