package use_cases.tasks.mark_task_completion;

import entities.Task;

/**
 *  This class is a container for the input data, it is created by the controller and sent to the interactor/use case.
 */
public class MarkCompletionInputData {
    private final Task task;

    /**
     * Constructor for a MarkCompletionInputData object.
     * @param task - the task that will be marked.
     */
    public MarkCompletionInputData(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }
}
