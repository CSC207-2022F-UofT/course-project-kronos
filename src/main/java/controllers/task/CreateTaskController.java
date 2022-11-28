package controllers.task;

import use_cases.tasks.create_task.CreateTaskInputBoundary;
import use_cases.tasks.create_task.CreateTaskInputData;
import use_cases.tasks.create_task.CreateTaskOutputData;

import java.util.Calendar;

public class CreateTaskController {
    final CreateTaskInputBoundary userInput;

    public CreateTaskController(CreateTaskInputBoundary taskGateway) {
        this.userInput = taskGateway;
    }
    CreateTaskOutputData create(String name, Calendar deadline){
        CreateTaskInputData inputData = new CreateTaskInputData(name, deadline);
        return userInput.create(inputData);
    }
}
