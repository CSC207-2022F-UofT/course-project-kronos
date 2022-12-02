package use_cases.tasks.create_task;

import entities.Task;

import java.util.Calendar;
import java.util.HashMap;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * -- Application Business Layer --
 * A data structure that stores data about the new task that should be saved by the database. It passes data to the
 * gateway.
 */

public class CreateTaskDsRequestModel {
    private final Integer id;
    private final Task task;

    public CreateTaskDsRequestModel(Integer id, Task task) {
        this.id = id;
        this.task = task;
    }

    public Task getTask(){return this.task;}

    public int getId(){return this.id;}

}
