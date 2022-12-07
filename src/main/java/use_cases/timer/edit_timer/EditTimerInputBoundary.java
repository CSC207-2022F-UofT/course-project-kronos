package use_cases.timer.edit_timer;

/**
 * This is an interface that passes the inputData to the interactor of timer modification/edition.
 */
public interface EditTimerInputBoundary {
    /**
     * Create a new work timer based on the input data.
     *
     * @param inputData - input data of the new timer.
     */
    EditTimerOutputData edit(EditTimerInputData inputData);
}
