package use_cases.timer_use_cases.edit_timer;

/**
 * Edit properties of the whole timer. Properties include: work timer minutes and rest timer minutes.
 */

public class EditTimer {

    private final EditTimerOutputBoundary outputBoundary;

    public EditTimer (EditTimerOutputBoundary outputBoundary) {
        this.outputBoundary = outputBoundary;
    }

    /**
     * Edit the properties of a timer. The edible properties are work timer minutes and rest timer minutes for a
     * timer object.
     *
     * @param inputData - the input data which contain an input work timer minutes and an input rest timer minutes.
     *
     * @return the output data after editing.
     */

    public EditTimerOutputData edit(EditTimerInputData inputData) {
        //If one of the input is empty or containing things not integer.
        EditTimerOutputData outputData = new EditTimerOutputData();
        return outputBoundary.prepareFailView(outputData);
    }

}
