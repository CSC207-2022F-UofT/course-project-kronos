package use_cases.tasks.mark_task_completion;

/**
 * This is an interface that passes the inputData to the Presenter of marking task as complete or incomplete.
 */
public interface MarkCompletionOutputBound {
    // the following codes might be extracted to class afterwards.
    void prepareCalendarSuccessView(MarkCompletionOutputData outputData);
    void prepareTodoSuccessView(MarkCompletionOutputData outputData);
}
