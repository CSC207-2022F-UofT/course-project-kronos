package use_cases.tasks.mark_task_visibility;

/**
 * This is an interface that passes the inputData to the Presenter of marking task as visible or invisible.
 */
public interface MarkVisibilityOutputBound {
    // the following codes might be extracted to class afterwards.
    void prepareCalendarSuccessView(MarkVisibilityOutputData outputData);
    void prepareTodoSuccessView(MarkVisibilityOutputData outputData);
}
