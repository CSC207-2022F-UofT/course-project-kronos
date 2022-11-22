package use_cases.tasks.mark_task_completion;

import entities.Task;

public class MarkCompletionDsRequestModel {
    private Task task;
    public MarkCompletionDsRequestModel(Task task){
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    // Might extract to a general class afterwards. (As duplicate code appears in EditTaskDsRequestModel,
    // MarkCompletionDsRequestModel, and MarkVisibilityDsRequestModel.)
}
