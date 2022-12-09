package use_cases.tasks.create_task;

/**
 * -- Application Business Layer --
 *  This class is a container for the output data related to creation of task, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class CreateTaskOutputData {
    private final int taskId;
    private final String taskName;

    /**
     * A constructor that is used only when a task is successfully created.
     * @param taskId - the id of the task created.
     * @param taskName - the name of the task created.
     */
    public CreateTaskOutputData(int taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
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

}
