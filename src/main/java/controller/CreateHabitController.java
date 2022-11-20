package controller;
import entities.User;
import input_boundary.CreateHabitInput;


public class CreateHabitController {

    /**
     * Create a new habit. Return whether the habit was successfully created.
     * @param u - The user for the habits
     * @param s - The name of the habit
     * @param t - The type of the habit
     * @param b - The reminder state of the habit
     */
    public static boolean HabitCreation(User u, String s, String t, String b){
        boolean r = b.equals("ON");
        CreateHabitInput habitInput = new CreateHabitInput(u, s, t, r);
        return habitInput.getSuccess();
    }
}
