package controllers.tasks;

import use_cases.tasks.create_task.CreateTaskInputBoundary;
import use_cases.tasks.create_task.CreateTaskInputData;
import use_cases.tasks.create_task.CreateTaskOutputData;

import java.util.Calendar;

/**
 * -- Interface Adaptor Layer --
 * The Controller that passes input data from the UI to the use case that creates new task.
 */
public class CreateTaskController {
    final CreateTaskInputBoundary userInput;

    /**
     * Constructor
     * @param taskGateway - Input Boundary Interface.
     */
    public CreateTaskController(CreateTaskInputBoundary taskGateway) {
        this.userInput = taskGateway;
    }

    /**
     * Calls create() method in use case Interactor.
     * @param name - the input name of the task.
     * @return corresponding OutputData object.
     */
    public CreateTaskOutputData create(String name){
        CreateTaskInputData inputData = new CreateTaskInputData(name);
        return userInput.create(inputData);
    }
}
