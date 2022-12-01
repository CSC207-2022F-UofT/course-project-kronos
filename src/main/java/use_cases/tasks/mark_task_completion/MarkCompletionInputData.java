package use_cases.tasks.mark_task_completion;

/**
 *  This class is a container for the input data, it is created by the controller and sent to the interactor/use case.
 */
public class MarkCompletionInputData {
    private final int taskId;

    /**
     * Constructor for a MarkCompletionInputData object.
     * @param taskId - the id of task that will be marked.
     */
    public MarkCompletionInputData(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskId() {
        return taskId;
    }
}
