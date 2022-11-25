package use_cases.tasks.mark_task_completion;

public interface MarkCompletionDsGateway {
    void save(MarkCompletionDsRequestModel requestModel);
}
