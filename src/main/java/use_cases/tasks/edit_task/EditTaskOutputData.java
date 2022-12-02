package use_cases.tasks.edit_task;

import java.util.Calendar;

/**
 * -- Application Business Layer --
 *  This class is a container for the output data related to edition/modification of task, it is created by the
 *  Interactor and sent to the Presenter.
 */
public class EditTaskOutputData {
    private final int taskId;
    private final String taskName;
    private final Calendar taskDeadline;
    private final String category;

    /**
     * A constructor that is used only when a task is successfully edited.
     *
     * @param taskId       - the id of the task that is being edited.
     * @param taskName     - the name of the task after edition.
     * @param taskDeadline - the deadline of the task after edition.
     * @param category     - the category of the task.
     */
    public EditTaskOutputData(int taskId, String taskName, Calendar taskDeadline, String category) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDeadline = taskDeadline;
        this.category = category;
    }


    /**
     * @return the id of the task edited.
     */
    public int getTaskId() {
        return taskId;
    }

    /**
     * @return the deadline of the task after edition.
     */
    public Calendar getTaskDeadline() {
        return taskDeadline;
    }

    /**
     * @return the name of the task after edition
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @return the category of the task after edition.
     */
    public String getCategory() {
        return category;
    }
}