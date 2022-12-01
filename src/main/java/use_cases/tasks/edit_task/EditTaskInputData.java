package use_cases.tasks.edit_task;

import java.util.Calendar;

/**
 * Application Business Layer
 *  This class is a container for the input data related to edition/modification of task, it is created by the controller and sent
 *  to the interactor/use case
 */
public class EditTaskInputData {
    private final int taskId;
    private final String inputName;
    private final String inputCategory;
    private final Calendar inputDeadline;


    /**
     * Constructor for a EditTaskInputData object.
     *
     * @param taskId    - the id of the task that will be edited.
     * @param inputName - the name of the task after edition.
     * @param category  - the category name of the task after edition.
     * @param deadline  - the deadline of the task after edition.
     */
    public EditTaskInputData(int taskId, String inputName, String category, Calendar deadline) {
        this.taskId = taskId;
        this.inputName = inputName;
        this.inputCategory = category;
        this.inputDeadline = deadline;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getInputName() {
        return inputName;
    }

    public String getInputCategory() {
        return inputCategory;
    }

    public Calendar getInputDeadline() {
        return inputDeadline;
    }
}
