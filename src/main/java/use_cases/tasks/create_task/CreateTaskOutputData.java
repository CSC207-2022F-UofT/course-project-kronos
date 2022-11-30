package use_cases.tasks.create_task;

import java.util.Calendar;

/**
 * -- Application Business Layer --
 *  This class is a container for the output data related to creation of task, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class CreateTaskOutputData {
    private String message;
    private final int taskId;
    private final String taskName;
    private final Calendar taskDeadline;

    /**
     * A constructor that is used only when a task is successfully created.
     * @param taskId - the id of the task created.
     * @param taskName - the name of the task created.
     * @param taskDeadline - the deadline of the task created.
     */
    public CreateTaskOutputData(int taskId, String taskName, Calendar taskDeadline) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDeadline = taskDeadline;
    }

    /**
     * @return the message of the output data.
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the id of the task created.
     */
    public int getTaskId() {
        return taskId;
    }

    /**
     * @return the name of the task created.
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @return the deadline of the task created.
     */
    public Calendar getTaskDeadline() {
        return taskDeadline;
    }
}
