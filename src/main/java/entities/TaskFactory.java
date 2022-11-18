package entities;

import java.util.ArrayList;
import java.util.HashMap;

public class TaskFactory extends Factory<Task>{
    HashMap<Integer, Task> tasks;

    public TaskFactory(){
        super();
        this.tasks = new HashMap<>();
    }

    /**
     * Adding a task to the Task Factory by using its id as the key and the entity as the value.
     * @param item - The task that will be added.
     */
    @Override
    public void addItem(Task item) {
        tasks.put(item.getId(), item);
    }

    /**
     * Removing a task from the TaskFactory by referring to its id (key).
     * @param item - The task that will be removed.
     */
    @Override
    public void removeItem(Task item) {
        tasks.remove(item.getId());
    }

    /**
     * Return tasks.
     * @return the Hashmap attribute tasks of a TaskFactory.
     */
    public HashMap getTasks(){
        return this.tasks;
    }

    /**
     * Given the user, return an array list of that user's tasks.
     * @return this TaskFactory object as an arraylist
     */
    public ArrayList<Task> convertToArray() {
        ArrayList<Task> taskList = new ArrayList<>();
        if (!this.tasks.isEmpty()) {
            for (Integer key : this.tasks.keySet()) {
                taskList.add(this.tasks.get(key));
            }
        } // else don't populate the list
        return taskList;
    }

}
