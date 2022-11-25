package input_boundary;
import Habit_use_case.TrackHabit;
import entities.Habit;

public class TrackHabitInput {

    /**
     * Marks the frequency of a habit.
     * @param h - The habit for which the frequency is to be increased.
     */
    public static void TrackAHabit(Habit h){ TrackHabit.increaseHabitFrequency(h);}
}
