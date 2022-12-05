package use_cases.tasks.delete_task;

/**
 * -- Application Business Layer --
 * A data structure that stores data about the id of the task that should be removed from the database. It passes data
 * to the gateway.
 */
public class DeleteTaskDsRequestModel {
    private final int  taskId;

    /**
     * Constructor
     * @param taskId - the id of the task.
     */
    public DeleteTaskDsRequestModel(int taskId) {
        this.taskId = taskId;
    }

    /**
     * @return the id of the delected task.
     */
    public int getTaskId() {
        return taskId;
    }
}
