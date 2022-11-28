package controllers.task;

import use_cases.tasks.create_task.CreateTaskOutputData;
import use_cases.tasks.create_task.CreateTaskOutputBoundary;


public class CreateTaskResponseFormatter implements CreateTaskOutputBoundary {

    @Override
    public CreateTaskOutputData prepareSuccessView(CreateTaskOutputData response) {



        return null;
    }

    @Override
    public CreateTaskOutputData prepareFailView(String error) {
        throw new TaskCreationFailed(error);
    }
}
