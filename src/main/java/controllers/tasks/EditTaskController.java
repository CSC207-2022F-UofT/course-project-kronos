package controllers.tasks;

import use_cases.tasks.edit_task.EditTaskInputBoundary;
import use_cases.tasks.edit_task.EditTaskInputData;
import use_cases.tasks.edit_task.EditTaskOutputData;

import java.util.Calendar;

/**
 * -- Interface Adaptor Layer --
 * The Controller that passes input data from the UI to the use case that edits properties of a task.
 */
public class EditTaskController {
    final EditTaskInputBoundary userInput;

    /**
     * Constructor
     * @param taskGateway - Input Boundary Interface.
     */
    public EditTaskController(EditTaskInputBoundary taskGateway){this.userInput = taskGateway;}

    /**
     * Calls edit() method in the use case Interactor.
     * @param taskId - the id of the chosen task.
     * @param inputName - the input name.

     * @return corresponding OutputData object.
     */
    public EditTaskOutputData edit(int taskId, String inputName){
        EditTaskInputData inputData = new EditTaskInputData(taskId, inputName);
        return userInput.edit(inputData);

    }

}
