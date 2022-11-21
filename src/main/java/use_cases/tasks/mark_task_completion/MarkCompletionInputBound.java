package use_cases.tasks.mark_task_completion;

/**
 * This is an interface that passes the inputData to the interactor of marking task as completed or incomplete.
 */
public interface MarkCompletionInputBound {
    MarkCompletionOutputData mark(MarkCompletionInputData inputData);
}
