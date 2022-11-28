package controllers.task;

import use_cases.tasks.create_task.CreateTaskOutputData;
import use_cases.tasks.create_task.CreateTaskOutputBoundary;


public class CreateTaskPresenter implements CreateTaskOutputBoundary {

    @Override
    public CreateTaskOutputData prepareSuccessView(CreateTaskOutputData outputData) {
        return outputData;
    }

    @Override
    public CreateTaskOutputData prepareFailView(String error) {
        throw new TaskCreationFailed(error);
    }
}
