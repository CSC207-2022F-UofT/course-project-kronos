package use_cases.habits.track_habit;
import entities.Habit;

public class TrackHabitInputBoundary {

    /**
     * Marks the frequency of a habit.
     * @param h - The habit for which the frequency is to be increased.
     */
    public static void trackHabit(Habit h){ TrackHabit.increaseHabitFrequency(h);}
}
