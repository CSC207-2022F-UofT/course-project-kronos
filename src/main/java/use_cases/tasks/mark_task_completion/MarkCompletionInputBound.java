package use_cases.tasks.mark_task_completion;

/**
 * -- Application Business Layer --
 * This is an interface that passes the inputData to the interactor of marking task as completed or incomplete.
 */
public interface MarkCompletionInputBound {
    /**
     * Mark task as completed or incomplete based on input data.
     * @param inputData - input data including the id of the task.
     */
    MarkCompletionOutputData mark(MarkCompletionInputData inputData);
}
