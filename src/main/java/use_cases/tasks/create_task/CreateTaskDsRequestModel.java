package use_cases.tasks.create_task;

import entities.Task;

/**
 * -- Application Business Layer --
 * A data structure that stores data about the new task that should be saved by the database. It passes data to the
 * gateway.
 */
public class CreateTaskDsRequestModel {
    private Integer id;
    private Task task;

    public CreateTaskDsRequestModel(Integer id, Task task) {
        this.id = id;
        this.task = task;
    }

    /**
     * @return Task object to be created
     */
    public Task getTask() {
        return this.task;
    }

    /**
     * @return id of the task
     */
    public int getId() {
        return this.id;
    }

    /**
     * @param task - Task object to be created
     */
    public void setTask(Task task){this.task = task;}

    /**
     * @param id - id of task object to be created
     */
    public void setId(Integer id){this.id = id;}

}

