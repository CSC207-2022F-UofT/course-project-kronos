package use_cases.habits.edit_habit;
import entities.Habit;
import entities.UserEntity;

public class EditHabitInputBoundary {

    /**
     * Check whether the input fields are correct.
     * @param u - The user for the habits
     * @param s - The old name of the habit
     * @param a - The new name of the habit
     * @param t - The new type of the habit
     * @param r - The new reminder state of the habit
     */
    public static void editHabitInputBoundary(UserEntity u, String s, String a, String t, Boolean r){

        if(!(s.equals("") && a.equals("") && t.equals(""))){
            Habit h = u.getHabitCollection().habitCollection.get(s);
            EditHabit.editName(u, h , a);
            EditHabit.editType(h, t);
            EditHabit.editReminder(h, r);
        }

    }
}
