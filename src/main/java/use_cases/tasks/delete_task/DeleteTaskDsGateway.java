package use_cases.tasks.delete_task;

/**
 * -- Application Business Layer --
 * The database gateway for deleteTask use case.
 */
public interface DeleteTaskDsGateway {
    /**
     * Deletes the task based on data in the request model from the database.
     * @param requestModel - a data structure that contains data about the task that should be removed from the database.
     */
    void deleteTask(DeleteTaskDsRequestModel requestModel);
}
