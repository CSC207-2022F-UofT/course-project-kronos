package Habit_use_case;

import entities.Habit;

public class TrackHabit {

    public static void increaseHabitFrequency(Habit h){
        h.markFrequency();
    }
}
