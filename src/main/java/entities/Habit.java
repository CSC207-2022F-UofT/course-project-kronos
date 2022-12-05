package entities;

import java.time.LocalDate;
import java.util.HashMap;

/**
 * Entity class for Habit feature.
 */
public class Habit {

    private String name;
    private String type;
    private int frequency;
    private final HashMap<String, Integer> frequencyMap;

    /**
     * Constructor for a Habit object.
     * @param title - The name of the habit.
     * @param type - The type of the habit ("daily", "weekly", "monthly")
     */

    public Habit(String title, String type){

        this.name = title;
        this.type = type;
        this.frequency = 0;
        this.frequencyMap = new HashMap<>();
    }

    /**
     * Set the name of the habit.
     * @param title - The name of the habit.
     */
    public void setName(String title) {this.name = title;}

    /**
     * Set the type of the habit.
     * @param type - The type of the habit.
     */
    public void setType(String type) {this.type = type;}

    /**
     * @return returns the name of the habit.
     */
    public String getName() { return this.name;}

    /**
     * @return returns the type of the habit.
     */
    public String getType() { return this.type;}

    /**
     * @return returns the frequency of the habit.
     */
    public int getFrequency() { return this.frequency;}

    /**
     * @return returns the frequency of the habit in String format.
     */
    public String getFrequencyString() { return Integer.toString(this.getFrequency());}

    /**
     * @return returns a Hashmap of habits mapped to their frequency for a particular date.
     */
    public HashMap<String, Integer> getFrequencyMap() { return this.frequencyMap;}

    /**
     * @return returns whether the Hashmap of habits is empty or not.
     */
    public boolean isFrequencyMapEmpty() {
        return this.frequencyMap.isEmpty();
    }

    /**
     * marks the frequency of a habit.
     */
    public void markFrequency(){
        this.frequency += 1;
        this.frequencyMap.put(LocalDate.now().toString(), this.frequency);
    }

}


