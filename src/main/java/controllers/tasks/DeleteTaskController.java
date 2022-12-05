package controllers.tasks;

import use_cases.tasks.delete_task.DeleteTaskInputBoundary;
import use_cases.tasks.delete_task.DeleteTaskInputData;
import use_cases.tasks.delete_task.DeleteTaskOutputData;

/**
 * -- Interface Adaptor Layer --
 * The Controller that passes input data from the UI to the use case that deletes task.
 */
public class DeleteTaskController {
    final DeleteTaskInputBoundary userInput;

    /**
     * Constructor
     * @param taskGateway - Input Boundary Interface.
     */
    public DeleteTaskController(DeleteTaskInputBoundary taskGateway) {
        this.userInput = taskGateway;
    }

    /**
     * Calls delete() method in the use case Interactor.
     * @param taskID - the id of the chosen task.
     * @return corresponding OutputData object.
     */
    public DeleteTaskOutputData delete(int taskID){
        DeleteTaskInputData inputData = new DeleteTaskInputData(taskID);
        return userInput.delete(inputData);
    }
}
