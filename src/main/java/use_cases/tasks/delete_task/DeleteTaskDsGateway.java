package use_cases.tasks.delete_task;

/**
 * -- Application Business Layer --
 * The database gateway for deleteTask use case.
 */
public interface DeleteTaskDsGateway {
    void deleteTask(DeleteTaskDsRequestModel requestModel);
}
