package use_cases.tasks.create_task;

/**
 * -- Application Business Layer --
 * This is an interface that passes the output to the Presenter of task creation.
 */
public interface CreateTaskOutputBoundary {
    CreateTaskOutputData prepareSuccessView(CreateTaskOutputData outputData);
    CreateTaskOutputData prepareFailView(String error);
}
