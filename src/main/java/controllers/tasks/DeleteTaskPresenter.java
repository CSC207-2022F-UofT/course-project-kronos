package controllers.tasks;

import use_cases.tasks.delete_task.DeleteTaskOutputBoundary;
import use_cases.tasks.delete_task.DeleteTaskOutputData;

/**
 * -- Interface Adaptor Layer --
 * The Presenter that passes output data from the use case of DeleteTask to the UI.
 */
public class DeleteTaskPresenter implements DeleteTaskOutputBoundary {
    /**
     * This method is called when the deletion of task is successful. It prepares view.
     * @param outputData - the output data.
     * @return the output data.
     */
    @Override
    public DeleteTaskOutputData prepareSuccessView(DeleteTaskOutputData outputData) {
        return outputData;
    }
}
