package use_cases.tasks.mark_task_completion;

/**
 * -- Application Business Layer --
 * The database gateway for markCompletion use case.
 */
public interface MarkCompletionDsGateway {
    /**
     * Saves the data about the task after marking to the database.
     * @param requestModel - a data structure that contains data about the task after marking.
     */
    void saveTask(MarkCompletionDsRequestModel requestModel);
}
