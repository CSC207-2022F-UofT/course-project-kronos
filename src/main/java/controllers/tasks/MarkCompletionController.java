package controllers.tasks;

import use_cases.tasks.mark_task_completion.MarkCompletionInputBound;
import use_cases.tasks.mark_task_completion.MarkCompletionInputData;
import use_cases.tasks.mark_task_completion.MarkCompletionOutputData;

public class MarkCompletionController {
    final MarkCompletionInputBound userInput;


    public MarkCompletionController(MarkCompletionInputBound userInput) {
        this.userInput = userInput;
    }
    public MarkCompletionOutputData mark(int taskId){
        MarkCompletionInputData inputData = new MarkCompletionInputData(taskId);
        return userInput.mark(inputData);
    }

}
