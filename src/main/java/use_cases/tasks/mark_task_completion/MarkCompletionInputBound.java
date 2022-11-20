package use_cases.tasks.mark_task_completion;

/**
 * This is an interface that passes the inputData to the interactor of marking task as completed or incomplete.
 */
public interface MarkCompletionInputBound {
    void mark(MarkCompletionInputData inputData);
}
