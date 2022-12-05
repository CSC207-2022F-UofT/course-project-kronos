package use_cases.tasks.edit_task;

import java.util.Calendar;

/**
 * -- Application Business Layer --
 *  This class is a container for the input data related to edition/modification of task, it is created by the controller and sent
 *  to the interactor/use case
 */
public class EditTaskInputData {
    private final int taskId;
    private final String inputName;
    private final Calendar inputDeadline;


    /**
     * Constructor for a EditTaskInputData object.
     *
     * @param taskId    - the id of the task that will be edited.
     * @param inputName - the name of the task after edition.
     * @param deadline  - the deadline of the task after edition.
     */
    public EditTaskInputData(int taskId, String inputName, Calendar deadline) {
        this.taskId = taskId;
        this.inputName = inputName;
        this.inputDeadline = deadline;
    }

    /**
     * @return the id of the task that will be edited.
     */
    public int getTaskId() {
        return taskId;
    }

    /**
     * @return the name of the task after edition.
     */
    public String getInputName() {
        return inputName;
    }

    /**
     * @return the deadline of the task after edition.
     */
    public Calendar getInputDeadline() {
        return inputDeadline;
    }
}
