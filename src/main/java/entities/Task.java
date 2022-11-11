package entities;

import java.util.Calendar;
import java.util.Iterator;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Task{
    public String name;
    public boolean completeStatus;
    public boolean reminders;
    public boolean visibility;
    public Category taskCategory;
    public Calendar deadline;

    public Task(String name, boolean reminders, Calendar deadline){
        // @param The name of the task.
        // @param Whether the reminder is turned on. (Remind the user 24h before the deadline)
        // @param The colour for the task. User can choose from 7 given colors. (Red, Orange, Yellow, Green, Blue, Purple, Pink)
        // @param The deadline of the task.

        this.name = name;
        this.completeStatus = FALSE;
        this.reminders = reminders;
        this.visibility = TRUE;
        this.deadline = deadline;
    }

    public void setName(String name){
        this.name = name;

    }

    public void markAsComplete(){
        this.completeStatus = TRUE;
    }
    public void markAsIncomplete(){ this.completeStatus = FALSE;}

    public void setReminders(boolean remindersStatus){
        // Set whether there will be reminders for the task.
        this.reminders = remindersStatus;
    }

    public void setVisibility(boolean visible){
        // Set the visibility of the task. If TRUE, then the task is visible in both to-do list view and calendar view,
        // otherwise the task will be invisible.
        this.visibility = visible;
    }

    public void setTaskCategory(Category taskCategory) {
        this.taskCategory = taskCategory;
    }

    public void setDeadline(Calendar deadline) {
        this.deadline = deadline;
    }

}
