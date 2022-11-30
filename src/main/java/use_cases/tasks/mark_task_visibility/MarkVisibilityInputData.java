package use_cases.tasks.mark_task_visibility;

/**
 * -- Application Business Layer --
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

    /**
     * @return the id of the task that will be marked.
     */
    public int getTaskId() {
        return taskId;
    }
}
