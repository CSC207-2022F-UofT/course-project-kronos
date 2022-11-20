package use_cases.tasks.mark_task_completion;

import entities.Task;

/**
 *  This class is a container for the output data, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class MarkCompletionOutputData {
    private final Task task;
    /**
     * @param task - the task after being marked.
     */
    public MarkCompletionOutputData(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }
}
