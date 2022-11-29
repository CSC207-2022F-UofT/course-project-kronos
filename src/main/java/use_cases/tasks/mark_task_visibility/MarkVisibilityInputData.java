package use_cases.tasks.mark_task_visibility;

import entities.Task;

/**
 *  This class is a container for the input data, it is created by the controller and sent to the interactor/use case.
 */
public class MarkVisibilityInputData {
    private final int taskId;

    /**
     * Constructor for a MarkVisibilityInputData object.
     *
     * @param taskId - the id of task that will be marked.
     */
    public MarkVisibilityInputData(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskId() {
        return taskId;
    }
}
