package use_cases.tasks.delete_task;

import entities.Task;

/**
 * This class is a container for the input data related to deletion of a task, it is created by the controller and sent
 * to the interactor/use case.
 */
public class DeleteTaskInputData {
    private final Task task;

    /**
     * Constructor for a DeleteTaskInputData object.
     * @param task - the input task which will be deleted. The input task is always existing in the database.
     */
    public DeleteTaskInputData(Task task) {
        this.task = task;
    }

    /**
     * @return the task that will be deleted / the task attribute of a DeleteTaskInputData object.
     */
    public Task getTask() {
        return task;
    }
}
