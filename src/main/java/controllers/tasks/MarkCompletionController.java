package controllers.tasks;

import use_cases.tasks.mark_task_completion.MarkCompletionInputBound;
import use_cases.tasks.mark_task_completion.MarkCompletionInputData;
import use_cases.tasks.mark_task_completion.MarkCompletionOutputData;

/**
 * -- Interface Adaptor Layer --
 * The Controller that passes input data from the UI to the use case that marks the completion status of the task.
 */
public class MarkCompletionController {
    final MarkCompletionInputBound userInput;

    /**
     * Constructor
     * @param taskGateway - Input Boundary Interface.
     */
    public MarkCompletionController(MarkCompletionInputBound taskGateway) {
        this.userInput = taskGateway;
    }

    /**
     * Calls mark() method in use case Interactor.
     * @param taskId - the id of the chosen task.
     * @return corresponding OutputData object
     */
    public MarkCompletionOutputData mark(int taskId){
        MarkCompletionInputData inputData = new MarkCompletionInputData(taskId);
        return userInput.mark(inputData);
    }

}
