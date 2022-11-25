package entities;

import java.util.ArrayList;
import java.util.HashMap;

public class HabitFactory extends Factory<Habit>{

    public HashMap<String, Habit> habitCollection;

    /**
     * The constructor of the class HabitFactory.
     */
    public HabitFactory(){
        super();
        this.habitCollection = new HashMap<>();
    }

    /**
     * Adding a habit to the HabitFactory by using its name as the key and the entity as the value.
     * @param item - The habit that will be added.
     */
    @Override
    public void addItem(Habit item) {
        habitCollection.put(item.getName(), item);
    }


    /**
     * Removing a habit from the HabitFactory by referring to its name (key).
     * @param item - The habit that will be removed.
     */
    @Override
    public void removeItem(Habit item) {
        habitCollection.remove(item.getName(), item);
    }

    /**
     * Updates the Key value for a habit in the Hashmap when its name is changed.
     */
    public void updateKey(String oldKey, String newKey){
        Habit value = habitCollection.get(oldKey);
        removeItem(value);
        value.setName(newKey);
        addItem(value);

    }
    /**
     * Return habits.
     * @return the Hashmap attribute habitCollection of a HabitFactory.
     */
    public HashMap<String, Habit> getCollection(){return habitCollection;}

    /**
     * Given the user, return an array list of that user's habits.
     * @return this HabitFactory object as an arraylist
     */
    public ArrayList<Habit> convertToArray() {
        ArrayList<Habit> habitList = new ArrayList<>();
        if (!this.habitCollection.isEmpty()) {
            for (String key : this.habitCollection.keySet()) {
                habitList.add(this.habitCollection.get(key));
            }
        } // else don't populate the list
        return habitList;
    }
}

