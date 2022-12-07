package use_cases.tasks.mark_task_completion;

import java.util.Calendar;

/**
 * -- Application Business Layer --
 *  This class is a container for the output data, it is created by the Interactor and sent to the Presenter.
 */
public class MarkCompletionOutputData {
    int taskId;
    String name;
    boolean completionStatus;

    /**
     *
     * @param taskId - the id of the task.
     * @param taskName - the name of the task.
     * @param completionStatus - the completion status of the task ofter marked.
     */
    public MarkCompletionOutputData(int taskId, String taskName, boolean completionStatus) {
        this.taskId = taskId;
        this.name = taskName;
        this.completionStatus = completionStatus;
    }

    /**
     * @return the id of the task marked.
     */
    public int getTaskId() {
        return taskId;
    }

    /**
     * @return the name of the task marked.
     */
    public String getName() {
        return name;
    }

    /**
     * @return whether the task marked is completed.
     */
    public boolean isCompletionStatus() {
        return completionStatus;
    }
}
