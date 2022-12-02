package use_cases.tasks.edit_task;


import java.util.Calendar;

/**
 * -- Application Business Layer --
 * A data structure that stores data about the edited task that should be updated in the database. It passes data to
 * the gateway.
 */

public class EditTaskDsRequestModel {
    private final String name;
    private final String taskCategory;
    private final Calendar deadline;
    private final int id;

    /**
     * Constructor
     * @param id - the id of the task being edited.
     * @param name - the name of the task after edition.
     * @param deadline - the deadline of the task after edition.
     * @param taskCategory - the category of the task after edition.
     */
    public EditTaskDsRequestModel(int id, String name, Calendar deadline, String taskCategory){
        this.name = name;
        this.taskCategory = taskCategory;
        this.id = id;
        this.deadline = deadline;
    }

    /**
     * @return the name of the task after edition.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the id of the task after edition.
     */
    public int getId() {
        return id;
    }

    /**
     * @return the deadline of the task after edition.
     */
    public Calendar getDeadline() {
        return deadline;
    }

    /**
     * @return the category of the task after edition.
     */
    public String getTaskCategory() {
        return taskCategory;
    }

}
