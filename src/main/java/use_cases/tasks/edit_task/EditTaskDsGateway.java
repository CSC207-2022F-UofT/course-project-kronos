package use_cases.tasks.edit_task;

/**
 * -- Application Business Layer --
 * The database gateway for editTask use case.
 */
public interface EditTaskDsGateway {
    /**
     * Saves the data about the task after edition to the database.
     * @param requestModel - a data structure that contains data about the task after edition.
     */
    void saveTask(EditTaskDsRequestModel requestModel);
}