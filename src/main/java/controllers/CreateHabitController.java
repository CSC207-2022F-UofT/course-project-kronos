package controllers;
import entities.User;
import use_cases.habits.create_habit.CreateHabitInputBoundary;


public class CreateHabitController {

    /**
     * Create a new habit. Return whether the habit was successfully created.
     * @param u - The user for the habits
     * @param s - The name of the habit
     * @param t - The type of the habit
     * @param b - The reminder state of the habit
     */
    public static boolean createHabitC(User u, String s, String t, String b){
        boolean r = b.equals("ON");
        CreateHabitInputBoundary habitInput = new CreateHabitInputBoundary(u, s, t, r);
        return habitInput.getSuccess();
    }
}
