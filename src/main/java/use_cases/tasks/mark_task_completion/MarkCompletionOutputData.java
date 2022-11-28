package use_cases.tasks.mark_task_completion;

import java.util.Calendar;

/**
 *  This class is a container for the output data, it is created by the Interactor and sent to the Presenter.
 */
public class MarkCompletionOutputData {
    int taskId;
    String name;
    Calendar taskDeadline;
    boolean visibility;

    /**
     *
     * @param taskId - the id of the task.
     * @param taskName - the name of the task.
     * @param taskDeadline - the deadline of the task
     * @param visibility - the completion status of the task ofter marked.
     */
    public MarkCompletionOutputData(int taskId, String taskName, Calendar taskDeadline, boolean visibility) {
        this.taskId = taskId;
        this.name = taskName;
        this.taskDeadline = taskDeadline;
        this.visibility = visibility;
    }

    public int getTaskId() {
        return taskId;
    }

    public Calendar getTaskDeadline() {
        return taskDeadline;
    }

    public String getName() {
        return name;
    }

    public boolean isVisibility() {
        return visibility;
    }
}
