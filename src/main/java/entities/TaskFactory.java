package entities;

import java.util.HashMap;

public class TaskFactory extends Factory<Task>{
    HashMap<Integer, Task> h_items;

    public TaskFactory(){
        super();
        this.h_items = new HashMap<>();
    }

    @Override
    public void addItem(Task item) {
        h_items.put(item.getId(), item);
    }

    @Override
    public void removeItem(Task item) {
        h_items.remove(item.getId(), item);
    }

}
