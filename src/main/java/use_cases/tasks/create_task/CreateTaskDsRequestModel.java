package use_cases.tasks.create_task;

import java.util.Calendar;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * -- Application Business Layer --
 * A data structure that stores data about the new task that should be saved by the database. It passes data to the
 * gateway.
 */

public class CreateTaskDsRequestModel {
    private final String name;
    private final boolean completeStatus = FALSE;
    private final Calendar deadline;
    private final int id;

    /**
     * Constructor
     * @param id - the id of the created task.
     * @param name - the name of the created task.
     * @param deadline - the deadline of the created task.
     */
    public CreateTaskDsRequestModel(int id, String name, Calendar deadline) {
        this.name = name;
        this.deadline = deadline;
        this.id = id;
    }

    /**
     * @return the name of the created task.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the deadline of the created task.
     */
    public Calendar getDeadline() {
        return deadline;
    }

    /**
     * @return the id of the created task.
     */
    public int getId() {
        return id;
    }

}
