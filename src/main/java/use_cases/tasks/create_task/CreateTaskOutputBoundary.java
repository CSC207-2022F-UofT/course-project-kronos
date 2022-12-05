package use_cases.tasks.create_task;

/**
 * -- Application Business Layer --
 * This is an interface that passes the output to the Presenter of task creation.
 */
public interface CreateTaskOutputBoundary {
    /**
     * This method passes output data from the Interactor to the Presenter if the creation of task is successful.
     * @param outputData - the output data.
     * @return output data.
     */
    CreateTaskOutputData prepareSuccessView(CreateTaskOutputData outputData);

    /**
     * This method passes output data from the Interactor to the Presenter if the creation of task is failed.
     * @param error - the error message showed.
     * @return output data.
     */
    CreateTaskOutputData prepareFailView(String error);
}
