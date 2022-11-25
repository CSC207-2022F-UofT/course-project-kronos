package use_cases.tasks.edit_task;

import entities.Task;
import use_cases.tasks.create_task.CreateTaskOutputData;

import java.util.Calendar;

/**
 *  This class is a container for the output data related to edition/modification of task, it is created by the
 *  Interactor and sent to the Presenter.
 */
public class EditTaskOutputData {
    private final String message;
    private final Task task;

    /**
     * A constructor that is used when there is a failure to edit task.
     * @param message - the failure message.
     */
    public EditTaskOutputData(String message){
        this.message = message;
        this.task = new Task(null, null);
    }

    /**
     * A constructor that is used only when a task is successfully edited.
     * @param message - the success message.
     * @param task - task object after modification.
     */
    public EditTaskOutputData(String message, Task task) {
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