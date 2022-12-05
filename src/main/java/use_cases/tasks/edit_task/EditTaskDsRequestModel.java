package use_cases.tasks.edit_task;


import java.util.Calendar;

/**
 * -- Application Business Layer --
 * A data structure that stores data about the edited task that should be updated in the database. It passes data to
 * the gateway.
 */

public class EditTaskDsRequestModel {
    private final String name;
    private final boolean completionStatus;
    private final int id;

    /**
     * Constructor
     * @param id - the id of the task being edited.
     * @param name - the name of the task after edition.
     * @param completionStatus - the completionStatus of the task after edition.
     */
    public EditTaskDsRequestModel(int id, String name, boolean completionStatus){
        this.name = name;
        this.id = id;
        this.completionStatus = completionStatus;
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
     * @return the completion status of the task.
     */
    public boolean isCompletionStatus() {
        return completionStatus;
    }
}
