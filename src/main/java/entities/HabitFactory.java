package entities;

import java.io.Serializable;
import java.util.HashMap;

public class HabitFactory extends Factory<Habit> implements Serializable {

    public HashMap<String, Habit> h_items;

    public HabitFactory(){
        super();
        this.h_items = new HashMap<String, Habit>();
    }

    @Override
    public void addItem(Habit item) {
        h_items.put(item.getName(), item);
    }

    @Override
    public void removeItem(Habit item) {
        h_items.remove(item.getName(), item);
    }

    public void updateKey(String oldKey, String newKey){
        Habit value = h_items.get(oldKey);
        removeItem(value);
        value.setName(newKey);
        addItem(value);

    }
}

