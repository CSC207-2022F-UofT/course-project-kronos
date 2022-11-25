package use_cases.tasks;

import entities.Task;
import entities.User;

import java.util.Calendar;

public class CreateTask {

    // Input Boundary will check whether the input is valid
    /**
     * Create a new task. The new task will be added to the user's taskCollection.
     * @param userA - The target user.
     * @param name - The name of the task.
     * @param reminders - Whether the reminder is turned on. (Remind the user 24h before the deadline)
     * @param deadline -  The deadline of the task.
     */
    public void createTask(User userA,String name, boolean reminders, Calendar deadline){
        Task t = new Task(name, deadline);
        // Need User Class to be implemented.
        //userA.getTaskCollection.addItem(t);
    }
    // Database needs to be updated.

    public void unfilledFailure(){}



}
