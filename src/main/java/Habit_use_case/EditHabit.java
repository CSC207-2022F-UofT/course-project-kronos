package Habit_use_case;
import entities.Habit;
import entities.HabitFactory;
import entities.User;

public class EditHabit {

    /**
     * The constructor of Order.
     * @param u -  the user of the habit.
     * @param h - Habit to be edited.
     * @param title - the new name of habit.
     */
    public static void editName(User u, Habit h, String title){
        String oldKey = h.getName();
        u.getHabitCollection().updateKey(oldKey, title);
    }

    /**
     * The constructor of Order.
     * @param h - Habit to be edited.
     * @param t - the new type of habit.
     */
    public static void editType(Habit h, String t){
        h.setType(t);

    }

    /**
     * The constructor of Order.
     * @param h - Habit to be edited.
     * @param v - the new reminder state of habit.
     */
    public static void editReminder(Habit h, Boolean v){
        h.setReminder(v);
    }
}
