package use_cases.tasks.create_task;

/**
 * -- Application Business Layer --
 * The database gateway for createTask use case.
 */
public interface CreateTaskDsGateway {
    /**
     * Saves the data in the request model to the database.
     * @param requestModel - a data structure that contains data about the new task that should be saved in the database.
     */
    void saveTask(CreateTaskDsRequestModel requestModel);
}

