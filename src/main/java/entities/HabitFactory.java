package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class HabitFactory extends Factory<Habit> implements Serializable {

    public HashMap<String, Habit> h_items;

    public HabitFactory(){
        super();
        this.h_items = new HashMap<>();
    }

    /**
     * Adding a habit to the HabitFactory by using its name as the key and the entity as the value.
     * @param item - The habit that will be added.
     */
    @Override
    public void addItem(Habit item) {
        h_items.put(item.getName(), item);
    }


    /**
     * Removing a habit from the HabitFactory by referring to its id (key).
     * @param item - The habit that will be removed.
     */
    @Override
    public void removeItem(Habit item) {
        h_items.remove(item.getName(), item);
    }

    /**
     * Updates the Key value for a habit in the Hashmap when its name is changed.
     */
    public void updateKey(String oldKey, String newKey){
        Habit value = h_items.get(oldKey);
        removeItem(value);
        value.setName(newKey);
        addItem(value);

    }
    /**
     * Return habits.
     * @return the Hashmap attribute h_items of a HabitFactory.
     */
    public HashMap<String, Habit> getCollection(){return h_items;}

    /**
     * Given the user, return an array list of that user's habits.
     * @return this HabitFactory object as an arraylist
     */
    public ArrayList<Habit> convertToArray() {
        ArrayList<Habit> habitList = new ArrayList<>();
        if (!this.h_items.isEmpty()) {
            for (String key : this.h_items.keySet()) {
                habitList.add(this.h_items.get(key));
            }
        } // else don't populate the list
        return habitList;
    }
}

