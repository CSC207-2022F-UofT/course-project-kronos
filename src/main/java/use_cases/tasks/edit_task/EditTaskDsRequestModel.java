package use_cases.tasks.edit_task;


import java.util.Calendar;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class EditTaskDsRequestModel {
    private final String name;
    private final boolean completeStatus = FALSE;
    private final boolean visibility = TRUE;
    private final String taskCategory;
    private final Calendar deadline;
    private final int id;

    public EditTaskDsRequestModel(int id, String name, Calendar deadline, String taskCategory){
        this.name = name;
        this.taskCategory = taskCategory;
        this.id = id;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Calendar getDeadline() {
        return deadline;
    }

    public String getTaskCategory() {
        return taskCategory;
    }
}
