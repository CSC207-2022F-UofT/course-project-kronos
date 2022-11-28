package controllers.task;

import use_cases.tasks.delete_task.DeleteTaskInputBoundary;
import use_cases.tasks.delete_task.DeleteTaskInputData;
import use_cases.tasks.delete_task.DeleteTaskOutputData;


import entities.Task;
import use_cases.tasks.delete_task.DeleteTaskOutputData;

public class DeleteTaskController {
    final DeleteTaskInputBoundary userInput;

    public DeleteTaskController(DeleteTaskInputBoundary taskGateway) {
        this.userInput = taskGateway;
    }


    public DeleteTaskOutputData delete(int taskID){
        DeleteTaskInputData inputData = new DeleteTaskInputData(taskID);
        return userInput.delete(inputData);
    }
}
