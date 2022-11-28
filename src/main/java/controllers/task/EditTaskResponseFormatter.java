package controllers.task;

import use_cases.tasks.edit_task.EditTaskOutputBoundary;
import use_cases.tasks.edit_task.EditTaskOutputData;

public class EditTaskResponseFormatter implements EditTaskOutputBoundary{


    @Override
    public EditTaskOutputData prepareSuccessView(EditTaskOutputData outputData) {
        return outputData;
    }

    @Override
    public EditTaskOutputData prepareFailView(String error) {
        throw new TaskEditionFailed(error);
    }
}
