package use_cases.timer.create_single_timer;

import javax.swing.*;

/**
 * Output data related to the creation of timer.
 */
public class CreateWorkTimerOutputData {

    private final Timer workTimer;

    /**
     * Constructor that timer created successfully.
     */

    public CreateWorkTimerOutputData(Timer workTimer) {
        this.workTimer = workTimer;
    }

    /**
     * @return the work timer.
     */
    public Timer getWorkTimer(){
        return workTimer;
    }
}
