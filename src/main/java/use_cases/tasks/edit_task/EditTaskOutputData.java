package use_cases.tasks.edit_task;

import java.util.Calendar;

/**
 *  This class is a container for the output data related to edition/modification of task, it is created by the
 *  Interactor and sent to the Presenter.
 */
public class EditTaskOutputData {
    private final String message;
    private int taskId;
    private String taskName;
    private Calendar taskDeadline;


    /**
     * A constructor that is used when there is a failure to edit task.
     *
     * @param message - the failure message.
     */
    public EditTaskOutputData(String message){
        this.message = message;
    }

    /**
     * A constructor that is used only when a task is successfully edited.
     *
     * @param message - the success message.
     * @param taskId  - the id of the task that is being edited.
     * @param taskName - the name of the task after edition.
     * @param taskDeadline - the deadline of the task after edition.
     */
    public EditTaskOutputData(String message, int taskId, String taskName, Calendar taskDeadline) {
        this.message = message;
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDeadline = taskDeadline;
    }

    public String getMessage() {
        return message;
    }

    public int getTaskId() {
        return taskId;
    }

    public Calendar getTaskDeadline() {
        return taskDeadline;
    }

    public String getTaskName() {
        return taskName;
    }
}