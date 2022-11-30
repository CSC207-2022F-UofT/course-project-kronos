package use_cases.tasks.edit_task;

/**
 * -- Application Business Layer --
 * The database gateway for editTask use case.
 */
public interface EditTaskDsGateway {
    /**
     * Save changes about the task based on the request model to the database.
     * @param requestModel - a data structure that contains data about the task that should be saved in the database.
     */
    void save(EditTaskDsRequestModel requestModel);
}
