package use_cases.tasks.delete_task;

/**
 * -- Application Business Layer --
 * This is an interface that passes the output to the Presenter of task deletion.
 */
public interface DeleteTaskOutputBoundary {
    // There is no prepareFailView because this use case occurs after the user have selected a specific task. So the
    // chosen task is always existed in the database and TaskFactory. In other words, the deletion will always be
    // success unless there are any bugs in the codes.
    /**
     * This method passes output data from the Interactor to the Presenter when a task is deleted.
     * @param outputData - the output data.
     * @return output data.
     */
    DeleteTaskOutputData prepareSuccessView(DeleteTaskOutputData outputData);

}
