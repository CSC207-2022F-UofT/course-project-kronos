package Habit_use_case;
import entities.Habit;

public class TrackHabit {

    public void increaseHabitFrequency(Habit h){
        h.markFrequency();
    }
}
