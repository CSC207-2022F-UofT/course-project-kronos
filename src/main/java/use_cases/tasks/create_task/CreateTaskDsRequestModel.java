package use_cases.tasks.create_task;

import java.util.Calendar;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

// Use case Layer

public class CreateTaskDsRequestModel {
    private final String name;
    private final boolean completeStatus = FALSE;
    private final boolean visibility = TRUE;
    private final String taskCategory;
    private final Calendar deadline;
    private final int id;


    public CreateTaskDsRequestModel(int id, String name, Calendar deadline) {
        this.name = name;
        this.deadline = deadline;
        this.taskCategory = null;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Calendar getDeadline() {
        return deadline;
    }

    public String getTaskCategory() {
        return taskCategory;
    }

    public int getId() {
        return id;
    }
}
