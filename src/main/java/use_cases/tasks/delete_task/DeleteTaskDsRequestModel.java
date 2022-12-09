package use_cases.tasks.delete_task;

/**
 * -- Application Business Layer --
 * A data structure that stores data about the id of the task that should be removed from the database. It passes data
 * to the gateway.
 */
public class DeleteTaskDsRequestModel {
    private Integer  taskId;

    /**
     * Constructor
     * @param taskId - the id of the task.
     */
    public DeleteTaskDsRequestModel(Integer taskId) {
        this.taskId = taskId;
    }

    /**
     * @return the id of the deleted task.
     */
    public Integer getId() {
        return taskId;
    }

    /**
     * @param taskId - id of task to be deleted
     */
    public void setTaskId(Integer taskId){this.taskId = taskId;}
}
