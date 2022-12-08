package use_cases.tasks.edit_task;


import entities.Task;

import java.util.Calendar;

/**
 * -- Application Business Layer --
 * A data structure that stores data about the edited task that should be updated in the database. It passes data to
 * the gateway.
 */

public class EditTaskDsRequestModel {
    private Integer id;
    private Task task;

    public EditTaskDsRequestModel(Integer id, Task task) {
        this.id = id;
        this.task = task;
    }

    public Task getTask(){return this.task;}

    /**
     * @return the id of the task after edition.
     */
    public int getId(){return this.id;}


    /**
     * @param task - Edited task object to be stored
     */
    public void setTask(Task task){this.task = task;}

    /**
     * @param id - id of task object to be edited
     */
    public void setId(Integer id){this.id = id;}


     * @return the completion status of the task.
     */
    public boolean isCompletionStatus() {
        return completionStatus;
    }
}
