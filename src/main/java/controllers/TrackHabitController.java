package controllers;
import entities.Habit;
import entities.UserEntity;
import use_cases.habits.track_habit.TrackHabitInputBoundary;


public class TrackHabitController {

    /**
     * Create a new habit. Return whether the habit was successfully created.
     * @param u - The user for the habits
     * @param s - The name of the habit
     */
    public static void TrackHabitC (UserEntity u, String s) {

        Habit h = u.getHabitCollection().habitCollection.get(s);
        TrackHabitInputBoundary.trackHabit(h);
    }
}
