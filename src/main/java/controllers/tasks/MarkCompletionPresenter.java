package controllers.tasks;

import use_cases.tasks.mark_task_completion.MarkCompletionOutputBound;
import use_cases.tasks.mark_task_completion.MarkCompletionOutputData;

/**
 * -- Interface Adaptor Layer --
 * The Presenter that passes output data from the use case of MarkCompletion (for task) to the UI.
 */
public class MarkCompletionPresenter implements MarkCompletionOutputBound {
    /**
     * This method is called when the marking the completion status of task is successful. It prepares view.
     * @param outputData - the output data.
     * @return the output data.
     */
    @Override
    public MarkCompletionOutputData prepareSuccessView(MarkCompletionOutputData outputData) {
        return outputData;
    }
}
