package use_cases.tasks.mark_task_visibility;

/**
 * -- Application Business Layer --
 * The database gateway for markVisibility use case.
 */
public interface MarkVisibilityDsGateway {
    /**
     * Saves changes in visibility of the given task to the database.
     * @param requestModel - a data structure that contains data about the task after marking that should be saved in
     *                     the database.
     */
    void save(MarkVisibilityDsRequestModel requestModel);
}
