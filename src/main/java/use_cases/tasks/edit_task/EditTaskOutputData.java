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
    private final boolean completionStatus;

    /**
     * A constructor that is used only when a task is successfully edited.
     *
     * @param taskId       - the id of the task that is being edited.
     * @param taskName     - the name of the task after edition.
     * @param completionStatus - the deadline of the task after edition.
     */
    public EditTaskOutputData(int taskId, String taskName, boolean completionStatus) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.completionStatus = completionStatus;
    }


    /**
     * @return the id of the task edited.
     */
    public int getTaskId() {
        return taskId;
    }

    /**
     * @return the completion status of the task.
     */
    public boolean isCompletionStatus() {
        return completionStatus;
    }

    /**
     * @return the name of the task after edition
     */
    public String getTaskName() {
        return taskName;
    }

}