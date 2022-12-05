package controllers.tasks;

import use_cases.tasks.edit_task.EditTaskOutputBoundary;
import use_cases.tasks.edit_task.EditTaskOutputData;
import use_cases.timer_use_cases.edit_timer.EditTimerOutputData;

/**
 * -- Interface Adaptor Layer --
 * The Presenter that passes output data from the use case of EditTask to the UI.
 */
public class EditTaskPresenter implements EditTaskOutputBoundary{

    /**
     * This method is called when the edition of task is successful. It prepares view.
     * @param outputData - the output data.
     * @return the output data.
     */
    @Override
    public EditTaskOutputData prepareSuccessView(EditTaskOutputData outputData) {
        return outputData;
    }

    /**
     * This method is called when the edition of task is failed. It prepares view.
     *
     * @param error - the error message showed.
     * @return taskEditionFailed Exception.
     */
    @Override
    public EditTimerOutputData prepareFailView(String error) {
        throw new TaskEditionFailed(error);
    }
}
