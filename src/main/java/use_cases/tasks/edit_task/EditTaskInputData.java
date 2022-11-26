package use_cases.tasks.edit_task;

import entities.Task;

import java.util.Calendar;

/**
 *  This class is a container for the input data related to edition/modification of task, it is created by the controller and sent
 *  to the interactor/use case
 */
public class EditTaskInputData {
    private final Task task;
    private final String inputName;
    private final String inputCategory;
    private final Calendar inputDeadline;


    /**
     * Constructor for a EditTaskInputData object.
     * @param task- the task that will be edited.
     * @param inputName - the name of the task after edition.
     * @param category - the category name of the task after edition.
     * @param deadline - the deadline of the task after edition.
     */
    public EditTaskInputData(Task task, String inputName, String category, Calendar deadline) {
        this.task = task;
        this.inputName = inputName;
        this.inputCategory = category;
        this.inputDeadline = deadline;
    }

    public Task getTask() {
        return task;
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
