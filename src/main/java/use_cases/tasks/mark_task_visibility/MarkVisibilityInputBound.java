package use_cases.tasks.mark_task_visibility;

/**
 * -- Application Business Layer --
 * This is an interface that passes the inputData to the interactor of marking task as visible or invisible.
 */
public interface MarkVisibilityInputBound {
    /**
     * Mark task as visible or invisible based on input data.
     * @param inputData - input data including the id of the task.
     */
    MarkVisibilityOutputData mark(MarkVisibilityInputData inputData);
}
