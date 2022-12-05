package use_cases.tasks.delete_task;

/**
 * -- Application Business Layer --
 *  This class is a container for the output data related to deletion of task, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class DeleteTaskOutputData {
    private final String message;
    private final int taskId;

    /**
     * Constructor
     * @param message - the message of the result of deletion.
     */
    public DeleteTaskOutputData(String message) {
        this.message = message;
        this.taskId = 0;
    }

    /**
     * @return return the message of the output data.
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the id of the deleted task.
     */
    public int getTaskId() {
        return taskId;
    }
}
