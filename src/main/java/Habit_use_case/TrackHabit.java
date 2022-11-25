package Habit_use_case;

import entities.Habit;

public class TrackHabit {

    /**
     * Marks the frequency of an existing habit.
     * @param h - Habit to be edited.
     */
    public static void increaseHabitFrequency(Habit h){
        h.markFrequency();
    }
}
