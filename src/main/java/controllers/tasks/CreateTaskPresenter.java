package controllers.tasks;

import use_cases.tasks.create_task.CreateTaskOutputData;
import use_cases.tasks.create_task.CreateTaskOutputBoundary;

/**
 * -- Interface Adaptor Layer --
 * The Presenter that passes output data from the use case of CreateTask to the UI.
 */
public class CreateTaskPresenter implements CreateTaskOutputBoundary {

    /**
     * This method is called when the creation of new task is successful. It prepares view.
     * @param outputData - the output data.
     * @return the output data.
     */
    @Override
    public CreateTaskOutputData prepareSuccessView(CreateTaskOutputData outputData) {
        return outputData;
    }

    /**
     * This method is called when the creation of new task is failed. It prepares view.
     * @param error - the error message showed.
     * @return taskCreationFailed Exception.
     */
    @Override
    public CreateTaskOutputData prepareFailView(String error) {
        throw new TaskCreationFailed(error);
    }
}
