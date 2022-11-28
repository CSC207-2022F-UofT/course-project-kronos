package use_cases.habits.create_habit;
import entities.Habit;
import entities.CommonUser;

public class CreateHabit {

    /**Creates a new habit.
     * @param u -  the user of the habit
     * @param title - the name of the habit that is to be created
     * @param t -  the type of the habit
     * @param v -  State of the reminder of the habit.
     */
    public static void createHabit(CommonUser u, String title, String t, boolean v) {
        Habit h = new Habit(title, t, v);

        u.getHabitCollection().addItem(h);
    }

}
