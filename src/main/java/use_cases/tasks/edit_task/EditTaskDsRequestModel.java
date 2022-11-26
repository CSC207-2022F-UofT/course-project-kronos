package use_cases.tasks.edit_task;

import entities.Task;

public class EditTaskDsRequestModel {
    private Task task;

    public EditTaskDsRequestModel(Task task){
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
