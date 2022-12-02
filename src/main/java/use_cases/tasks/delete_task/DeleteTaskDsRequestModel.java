package use_cases.tasks.delete_task;

import entities.Task;

// Use case Layer
public class DeleteTaskDsRequestModel {
    private final Integer id;


    public DeleteTaskDsRequestModel(Integer id) {
        this.id = id;
    }

    public Integer getId(){return this.id;}
}
