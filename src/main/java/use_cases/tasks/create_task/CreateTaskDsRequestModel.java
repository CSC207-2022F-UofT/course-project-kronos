package use_cases.tasks.create_task;

import entities.Task;

import java.time.LocalDateTime;

// Use case Layer

public class CreateTaskDsRequestModel {
    private Task task;
    private final LocalDateTime creationTime;

    public CreateTaskDsRequestModel(Task task, LocalDateTime creationTime) {
        this.task = task;
        this.creationTime = creationTime;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }
}
