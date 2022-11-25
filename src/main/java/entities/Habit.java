package entities;

import java.time.LocalDate;
import java.util.HashMap;

public class Habit {


    private String name;
    private String type;
    private boolean reminderTrue;

    private int frequency;
    private final HashMap<String, Integer> frequencyMap;

    /**
     * Constructor for a Task object.
     * @param title - The name of the habit.
     * @param t - The type of the habit ("daily", "weekly", "monthly")
     * @param value -  Whether the reminder is on or off.
     */

    public Habit(String title, String t, boolean value ){

        this.name = title;
        this.type = t;
        this.reminderTrue = value;
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
     * @param t - The type of the habit.
     */
    public void setType(String t) {this.type = t;}

    /**
     * Set the reminder ON (TRUE) or OFF (FALSE).
     * @param v - The name of the task.
     */
    public void setReminder(boolean v) {this.reminderTrue= v;}


    /**
     * @return returns the name of the habit.
     */
    public String getName() { return this.name;}

    /**
     * @return returns the type of the habit.
     */
    public String getType() { return this.type;}

    /**
     * @return returns whether the reminder for the habit is ON or OFF.
     */
    public boolean getReminder() {return this.reminderTrue;}

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


