package Habit_use_case;
import entities.Habit;
import entities.User;

public class CreateHabit {

    /**
     * The constructor of Order.
     * @param u -  the user of the habit
     * @param title - the name of the habit that is to be created
     * @param t -  the type of the habit
     * @param v -  State of the reminder of the habit.
     */
    public static void createHabit(User u, String title, String t, boolean v) {
        Habit h = new Habit(title, t, v);

        u.getHabitCollection().addItem(h);
    }

}
