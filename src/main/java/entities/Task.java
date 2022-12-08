package entities;

import java.io.Serializable;
import java.util.Calendar;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Represents a single task.
 */

public class Task implements Serializable {

    private String name;
    private boolean completeStatus;
    private final int id;
    private static int numberOfTasks = 0;

    /**
     * Constructor for a Task object.
     * @param name - The name of the task.
    */
    public Task(String name){
        this.id = numberOfTasks;
        numberOfTasks += 1;

        this.name = name;
    }

    /**
     * Set the name of the task.
     * @param name - The name of the task.
     */
    public void setName(String name){
        this.name = name;

    }

    /**
     * Mark the task as completed.
     */
    public void markAsComplete(){
        this.completeStatus = TRUE;
    }

    /**
     * Mark the task as incomplete.
     */
    public void markAsIncomplete() {
        this.completeStatus = FALSE;
    }

    /**
     * @return the id (a private attribute) of the task.
     */
    public int getId(){return this.id;}

    /**
     * @return the name of the task.
     */
    public String getName(){
        return this.name;
    }

    /**
     * @return the completionStatus of the task.
     */
    public boolean isCompleteStatus() {
        return completeStatus;
    }
}
