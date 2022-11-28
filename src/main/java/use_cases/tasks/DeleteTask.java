package use_cases.tasks;

import entities.Task;
import entities.CommonUser;

public class DeleteTask {
    /**
     * Delete an existing task. The task will be removed from both the taskCollection and the categoryCollection of the
     * user.
     * @param userA - The target user.
     * @param task - The task that will be deleted.
     */
    public void deleteTask(CommonUser userA, Task task){
        // Need User Class to be implemented.
        //userA.getTaskCollection.removeItem(task);
        //userA.getCategoryCollection.removeItem(task);
    }
    // Database needs to be updated.

}
