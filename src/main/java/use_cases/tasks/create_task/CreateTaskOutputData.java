package use_cases.tasks.create_task;

import entities.Task;

/**
 *  This class is a container for the output data related to creation of task, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class CreateTaskOutputData {
    private final String message;
    private final Task task;

    /**
     * A constructor that is used when there is a failure to create task.
     * @param message - the failure message.
     */
    public CreateTaskOutputData(String message){
        this.message = message;
        this.task = new Task(null, null);
    }

    /**
     * A constructor that is used only when a task is successfully created.
     * @param task - task object created by the interactor.
     */
    public CreateTaskOutputData(Task task) {
        this.message = null;
        this.task = task;
    }

    public String getMessage() {
        return message;
    }

    public Task getTask() {
        return task;
    }
}
