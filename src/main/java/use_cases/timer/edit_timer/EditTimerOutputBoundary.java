package use_cases.timer.edit_timer;

/**
 * This is an interface that passes the output to the Presenter of task edition/modification.
 */
public interface EditTimerOutputBoundary {
    EditTimerOutputData prepareSuccessView(EditTimerOutputData outputData);
    EditTimerOutputData prepareFailView(EditTimerOutputData outputData);

}