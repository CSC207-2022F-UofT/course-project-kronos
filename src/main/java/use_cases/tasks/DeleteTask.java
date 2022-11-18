package use_cases.tasks;

import entities.Task;
import entities.User;

import java.util.Calendar;

public class DeleteTask {
    /**
     * Delete an existing task. The task will be removed from both the taskCollection and the categoryCollection of the
     * user.
     * @param userA - The target user.
     * @param task - The task that will be deleted.
     */
    public void deleteTask(User userA, Task task){
        // Need User Class to be implemented.
        //userA.taskCollection.removeItem(task);
        //userA.categoryCollection.removeItem(task);
    }
    // Database needs to be updated.

}
