package use_cases.tasks.mark_task_visibility;

/**
 * -- Application Business Layer --
 * The database gateway for markVisibility use case.
 */
public interface MarkVisibilityDsGateway {
    /**
     * Saves the data about the task after marking to the database.
     * @param requestModel - a data structure that contains data about the task after marking.
     */
    void saveTask(MarkVisibilityDsRequestModel requestModel);
}
