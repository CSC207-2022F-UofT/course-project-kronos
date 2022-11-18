package entities;

import java.util.HashMap;

public class TaskFactory extends Factory<Task>{
    HashMap<Integer, Task> h_items;

    public TaskFactory(){
        super();
        this.h_items = new HashMap<>();
    }

    /**
     * Adding a task to the Task Factory by using its id as the key and the entity as the value.
     * @param item - The task that will be added.
     */
    @Override
    public void addItem(Task item) {
        h_items.put(item.getId(), item);
    }

    /**
     * Removing a task from the TaskFactory by referring to its id (key).
     * @param item - The task that will be removed.
     */
    @Override
    public void removeItem(Task item) {
        h_items.remove(item.getId());
    }

}
