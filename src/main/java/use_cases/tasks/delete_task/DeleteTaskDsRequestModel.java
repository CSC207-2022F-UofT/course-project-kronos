package use_cases.tasks.delete_task;

import entities.Task;

// Use case Layer
public class DeleteTaskDsRequestModel {
    private final Task task;


    public DeleteTaskDsRequestModel(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }
}
