package use_cases.habits.edit_habit;
import entities.Habit;
import entities.UserEntity;

public class EditHabit {

    /**Edits the name of an existing habit.
     * @param u -  the user of the habit.
     * @param h - Habit to be edited.
     * @param title - the new name of habit.
     */
    public static void editName(UserEntity u, Habit h, String title){
        String oldKey = h.getName();
        u.getHabitCollection().updateKey(oldKey, title);
    }

    /**Edits the type of existing habit.
     * @param h - Habit to be edited.
     * @param t - the new type of habit.
     */
    public static void editType(Habit h, String t){
        h.setType(t);

    }

    /**
     * Edits the reminder state of a habit.
     * @param h - Habit to be edited.
     * @param v - the new reminder state of habit.
     */
    public static void editReminder(Habit h, Boolean v){
        h.setReminder(v);
    }
}
