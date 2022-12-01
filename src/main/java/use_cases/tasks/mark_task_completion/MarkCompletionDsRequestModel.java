package use_cases.tasks.mark_task_completion;

import entities.Task;

public class MarkCompletionDsRequestModel {
    private final int id;
    private final boolean completeStatus;

    public MarkCompletionDsRequestModel(int id, boolean completeStatus){
        this.id = id;
        this.completeStatus = completeStatus;
    }

    public int getId() {
        return id;
    }

    public boolean isCompleteStatus() {
        return completeStatus;
    }
}
