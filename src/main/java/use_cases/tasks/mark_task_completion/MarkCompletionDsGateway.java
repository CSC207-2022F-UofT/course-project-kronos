package use_cases.tasks.mark_task_completion;

/**
 * -- Application Business Layer --
 * The database gateway for markCompletion use case.
 */
public interface MarkCompletionDsGateway {
    /**
     * Saves changes in completion status of the given task to the database.
     * @param requestModel - a data structure that contains data about the task after marking that should be saved in
     *                     the database.
     */
    void save(MarkCompletionDsRequestModel requestModel);
}
