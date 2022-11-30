package use_cases.tasks.mark_task_visibility;

/**
 * -- Application Business Layer --
 * This is an interface that passes the inputData to the Presenter of marking task as visible or invisible.
 */
public interface MarkVisibilityOutputBound {
    /**
     * This method passes output data from the Interactor to the Presenter when the visibility of task is marked.
     * @param outputData - the output data.
     * @return output data.
     */
    MarkVisibilityOutputData prepareSuccessView(MarkVisibilityOutputData outputData);
}
