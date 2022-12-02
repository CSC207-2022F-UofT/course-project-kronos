package controllers.tasks;

import use_cases.tasks.mark_task_visibility.MarkVisibilityOutputBound;
import use_cases.tasks.mark_task_visibility.MarkVisibilityOutputData;

/**
 * -- Interface Adaptor Layer --
 * The Presenter that passes output data from the use case of MarkVisibility (for task) to the UI.
 */
public class MarkVisibilityPresenter implements MarkVisibilityOutputBound{
    /**
     * This method is called when the marking the Visibility of task is successful. It prepares view.
     * @param outputData - the output data.
     * @return the output data.
     */
    @Override
    public MarkVisibilityOutputData prepareSuccessView(MarkVisibilityOutputData outputData) {
        return outputData;
    }

}
