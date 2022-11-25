package entities;

import java.time.LocalDate;
import java.util.HashMap;

public class Habit {

    private String name;
    private String type;
    private boolean reminderTrue;

    private int frequency;
    private HashMap<String, Integer> frequencyMap;

    public Habit(String title, String t, boolean value ){

        this.name = title;
        this.type = t;
        this.reminderTrue = value;
        this.frequency = 0;
        this.frequencyMap = new HashMap<>();
    }

    public void setName(String title) {this.name = title;}

    public void setType(String t) {this.type = t;}

    public void setReminder(boolean v) {this.reminderTrue= v;}

    public String getName() { return this.name;}

    public String getType() { return this.type;}

    public boolean getReminder() {return this.reminderTrue;}


    public int getFrequency() { return this.frequency;}

    public HashMap<String, Integer> getFrequencyMap() { return this.frequencyMap;}

    public boolean isFrequencyMapEmpty() {
        return this.frequencyMap.isEmpty();
    }

    public void markFrequency(){
        this.frequency += 1;
        this.frequencyMap.put(LocalDate.now().toString(), this.frequency);
    }

}