package controllers.task;

import use_cases.tasks.edit_task.EditTaskInputBoundary;
import use_cases.tasks.edit_task.EditTaskInputData;
import use_cases.tasks.edit_task.EditTaskOutputData;

import java.util.Calendar;

public class EditTaskController {
    final EditTaskInputBoundary userInput;

    public EditTaskController(EditTaskInputBoundary taskGateway){this.userInput = taskGateway;}

    public EditTaskOutputData edit(int taskId, String inputName, String category, Calendar deadline){
        EditTaskInputData inputData = new EditTaskInputData(taskId, inputName, category, deadline);
        return userInput.edit(inputData);

    }

}
