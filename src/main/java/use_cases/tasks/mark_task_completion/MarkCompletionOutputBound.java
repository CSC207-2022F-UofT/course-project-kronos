package use_cases.tasks.mark_task_completion;

/**
 * -- Application Business Layer --
 * This is an interface that passes the inputData to the Presenter of marking task as complete or incomplete.
 */
public interface MarkCompletionOutputBound {
    /**
     * This method passes output data from the Interactor to the Presenter when the completion of task is marked.
     * @param outputData - the output data.
     * @return output data.
     */
    MarkCompletionOutputData prepareSuccessView(MarkCompletionOutputData outputData);
}
