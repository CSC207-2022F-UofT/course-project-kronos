package use_cases.tasks.delete_task;

// Use case Layer
public interface DeleteTaskDsGateway {
    void save(DeleteTaskDsRequestModel requestModel);
}