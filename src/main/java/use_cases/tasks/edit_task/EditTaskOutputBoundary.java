package use_cases.tasks.edit_task;

/**
 * This is an interface that passes the output to the Presenter of task edition/modification.
 */
public interface EditTaskOutputBoundary {
    void prepareCalendarSuccessView(EditTaskOutputData outputData);
    void prepareCalendarFailView(EditTaskOutputData outputData);
    void prepareTodoSuccessView(EditTaskOutputData outputData);
    void prepareTodoFailView(EditTaskOutputData outputData);
}
