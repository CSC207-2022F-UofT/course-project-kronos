package use_cases.tasks.edit_task;

/**
 * -- Application Business Layer --
 *  This class is a container for the output data related to edition/modification of task, it is created by the
 *  Interactor and sent to the Presenter.
 */
public class EditTaskOutputData {
    private final int taskId;
    private final String taskName;

    /**
     * A constructor that is used only when a task is successfully edited.
     *
     * @param taskId       - the id of the task that is being edited.
     * @param taskName     - the name of the task after edition.
     */
    public EditTaskOutputData(int taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
    }


    /**
     * @return the id of the task edited.
     */
    public int getTaskId() {
        return taskId;
    }

    /**
     * @return the name of the task after edition
     */
    public String getTaskName() {
        return taskName;
    }

}