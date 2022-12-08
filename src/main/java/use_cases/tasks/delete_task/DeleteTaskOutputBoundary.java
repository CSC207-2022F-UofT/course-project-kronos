package use_cases.tasks.delete_task;

/**
 * -- Application Business Layer --
 * This is an interface that passes the output to the Presenter of task deletion.
 */
public interface DeleteTaskOutputBoundary {
    /**
     * This method passes output data from the Interactor to the Presenter when a task is deleted.
     * @param outputData - the output data.
     * @return output data.
     */
    DeleteTaskOutputData prepareSuccessView(DeleteTaskOutputData outputData);

}
