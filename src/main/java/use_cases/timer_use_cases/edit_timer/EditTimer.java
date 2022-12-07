package use_cases.timer_use_cases.edit_timer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Edit properties of the whole timer. Properties include: work timer minutes and rest timer minutes.
 */

public class EditTimer {

    private final EditTimerOutputBoundary outputBoundary;

    public EditTimer(EditTimerOutputBoundary outputBoundary) {
        this.outputBoundary = outputBoundary;
    }

    /**
     * Edit the properties of a timer. The edible properties are work timer minutes and rest timer minutes for a
     * timer object.
     *
     * @param inputData - the input data which contain an input work timer minutes and an input rest timer minutes.
     * @return the output data after editing.
     */

    Timer timer;
    int second;
    int minute;


    public EditTimerOutputData edit(EditTimerInputData inputData) {
        second = 0;
        minute = inputData.getWorkTimerMinutes();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                second--;

                if(second == -1){
                    second = 59;
                    minute = - minute++;
                }

                if(minute == 0 && second == 0){
                    timer.stop();
                }
            }
        });

        EditTimerOutputData outputData = new EditTimerOutputData(timer);
        return outputBoundary.prepareFailView(outputData);
    }
}
