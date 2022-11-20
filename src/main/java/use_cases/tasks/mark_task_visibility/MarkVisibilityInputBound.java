package use_cases.tasks.mark_task_visibility;

/**
 * This is an interface that passes the inputData to the interactor of marking task as visible or invisible.
 */
public interface MarkVisibilityInputBound {
    MarkVisibilityOutputData mark(MarkVisibilityInputData inputData);
}
