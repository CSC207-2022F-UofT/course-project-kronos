package controllers.tasks;

import use_cases.tasks.mark_task_visibility.MarkVisibilityInputBound;
import use_cases.tasks.mark_task_visibility.MarkVisibilityInputData;
import use_cases.tasks.mark_task_visibility.MarkVisibilityOutputData;

public class MarkVisibilityController {
    final MarkVisibilityInputBound userInput;


    public MarkVisibilityController(MarkVisibilityInputBound userInput) {
        this.userInput = userInput;
    }

    public MarkVisibilityOutputData mark(int taskId){
        MarkVisibilityInputData inputData = new MarkVisibilityInputData(taskId);
        return userInput.mark(inputData);
    }
}
