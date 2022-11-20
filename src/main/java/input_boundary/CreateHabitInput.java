package input_boundary;

import Habit_use_case.CreateHabit;
import entities.User;


public class CreateHabitInput {

    private Boolean success;

    /**
     * Check whether the input fields are correct.
     * @param u - The user for the habits
     * @param s - The name of the habit
     * @param t - The type of the habit
     * @param r - The reminder state of the habit
     * success is true if no fields are empty and a Habit is created.
     */
    public CreateHabitInput(User u, String s, String t, Boolean r){
        if(s.equals("") && t.equals("")){
            CreateHabit.createHabit(u, s, t, r);
            this.success = true;
        }
    }

    /**
     * @return - Returns whether habit was created successfully.
     */
    public Boolean getSuccess() {
        return this.success;
    }
}
