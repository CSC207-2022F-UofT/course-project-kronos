package controllers.tasks;

import use_cases.tasks.mark_task_visibility.MarkVisibilityInputBound;
import use_cases.tasks.mark_task_visibility.MarkVisibilityInputData;
import use_cases.tasks.mark_task_visibility.MarkVisibilityOutputData;

/**
 * -- Interface Adaptor Layer --
 * The Controller that passes input data from the UI to the use case that marks the visibility of the task.
 */
public class MarkVisibilityController {
    final MarkVisibilityInputBound userInput;

    /**
     * Constructor
     * @param taskGateway - Input Boundary Interface.
     */
    public MarkVisibilityController(MarkVisibilityInputBound taskGateway) {
        this.userInput = taskGateway;
    }

    /**
     * Calls mark() method in use case Interactor.
     * @param taskId - the id of the chosen task.
     * @return corresponding OutputData object
     */
    public MarkVisibilityOutputData mark(int taskId){
        MarkVisibilityInputData inputData = new MarkVisibilityInputData(taskId);
        return userInput.mark(inputData);
    }
}
