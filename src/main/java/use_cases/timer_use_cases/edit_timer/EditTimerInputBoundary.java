package use_cases.timer_use_cases.edit_timer;

/**
 * This is an interface that passes the inputData to the interactor of timer modification/edition.
 */
public interface EditTimerInputBoundary {
    EditTimerOutputData edit(EditTimerInputData inputData);
}