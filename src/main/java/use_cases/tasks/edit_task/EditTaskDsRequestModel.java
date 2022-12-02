package use_cases.tasks.edit_task;


import entities.Task;

import java.util.Calendar;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class EditTaskDsRequestModel {
    private final Integer id;
    private final Task task;

    public EditTaskDsRequestModel(Integer id, Task task) {
        this.id = id;
        this.task = task;
    }

    public Task getTask(){return this.task;}

    public int getId(){return this.id;}
}
