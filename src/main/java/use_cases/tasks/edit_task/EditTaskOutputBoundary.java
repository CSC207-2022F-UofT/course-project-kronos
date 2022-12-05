package use_cases.tasks.edit_task;

/**
 * -- Application Business Layer --
 * This is an interface that passes the output to the Presenter of task edition/modification.
 */
public interface EditTaskOutputBoundary {
    /**
     * This method passes output data from the Interactor to the Presenter if the edition of task is successful.
     * @param outputData - the output data.
     * @return output data.
     */
    EditTaskOutputData prepareSuccessView(EditTaskOutputData outputData);
    /**
     * This method passes output data from the Interactor to the Presenter if the edition of task is failed.
     *
     * @param error - the error message showed.
     * @return output data.
     */
    EditTaskOutputData prepareFailView(String error);

}

