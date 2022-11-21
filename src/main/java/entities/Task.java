package entities;

import java.util.Calendar;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Represents a single task.
 */

public class Task{

    private String name;
    public boolean completeStatus;
    public boolean visibility;
    private String taskCategory;
    public Calendar deadline;
    private final int id;
    private static int numberOfTasks = 0;

    /**
     * Constructor for a Task object.
     * @param name - The name of the task.
     * @param deadline -  The deadline of the task.
     */
    public Task(String name, Calendar deadline){

        this.id = numberOfTasks;
        numberOfTasks += 1;

        this.name = name;
        this.visibility = TRUE;
        this.deadline = deadline;
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
     * Set the Visibility of the task.
     * @param visible - "TRUE" if the user wants the task to be visible. "FALSE" if the user wants the task to be
     *                invisible.
     */
    public void setVisibility(boolean visible){

        this.visibility = visible;
    }

    /**
     * Set the category of the task to the given category.
     * @param taskCategory - The category that the users wants the task to belong to.
     */
    public void setTaskCategory(String taskCategory) {
        this.taskCategory = taskCategory;
    }

    /**
     * Set the deadline of the task to the given deadline.
     * @param deadline - The deadline that the users wants the task to have.
     */
    public void setDeadline(Calendar deadline) {
        this.deadline = deadline;
    }
    /**
     * @return returns the id (a private attribute) of the task.
     */
    public int getId(){return this.id;}

    public String getName(){
        return this.name;
    }

    public String getTaskCategory() {
        return taskCategory;
    }

    public Calendar getDeadline() {
        return deadline;
    }

    public boolean isCompleteStatus() {
        return completeStatus;
    }

    public boolean isVisibility() {
        return visibility;
    }
}