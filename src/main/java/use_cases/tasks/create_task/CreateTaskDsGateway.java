package use_cases.tasks.create_task;

// Use case layer
public interface CreateTaskDsGateway {
    void save(CreateTaskDsRequestModel requestModel);
}
