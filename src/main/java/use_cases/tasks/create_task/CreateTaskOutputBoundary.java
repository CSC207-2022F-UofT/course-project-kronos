package use_cases.tasks.create_task;

/**
 * This is an interface that passes the output to the Presenter of task creation.
 */
public interface CreateTaskOutputBoundary {
    void prepareCalendarSuccessView(CreateTaskOutputData outputData);
    void prepareCalendarFailView(CreateTaskOutputData outputData);
    void prepareTodoSuccessView(CreateTaskOutputData outputData);
    void prepareTodoFailView(CreateTaskOutputData outputData);
}
