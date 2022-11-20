package use_cases.tasks.create_task;

/**
 * This is an interface that passes the output to the Presenter of task creation.
 */
public interface CreateTaskOutputBoundary {
    CreateTaskOutputData prepareSuccessView(CreateTaskOutputData outputData);
    CreateTaskOutputData prepareFailView(CreateTaskOutputData outputData);
}
