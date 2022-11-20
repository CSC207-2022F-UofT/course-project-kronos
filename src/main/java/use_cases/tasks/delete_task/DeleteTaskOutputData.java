package use_cases.tasks.delete_task;

import entities.Task;

/**
 *  This class is a container for the output data related to deletion of task, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class DeleteTaskOutputData {
    private final String message;
    private final Task task;

    /**
     * Constructor
     * @param message - the message of the result of deletion.
     * @param task - the task that is deleted.
     */
    public DeleteTaskOutputData(String message, Task task) {
        this.message = message;
        this.task = task;
    }

    public String getMessage() {
        return message;
    }

    public Task getTask() {
        return task;
    }

}
