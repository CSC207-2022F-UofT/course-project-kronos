package use_cases.tasks.edit_task;

/**
 * This is an interface that passes the output to the Presenter of task edition/modification.
 */
public interface EditTaskOutputBoundary {
    EditTaskOutputData prepareSuccessView(EditTaskOutputData outputData);
    EditTaskOutputData prepareFailView(String error);

}
