package use_cases.habits.delete_habit;
import entities.Habit;
import entities.User;

public class DeleteHabit {

    /**
     * Deletes an existing habit.
     * @param u -  the user of the habit.
     * @param title - the name of habit that is to be deleted.
     */
    public static boolean deleteHabit(User u, String title) {

        Habit h = u.getHabitCollection().habitCollection.get(title);

        u.getHabitCollection().removeItem(h);

        return u.getHabitCollection().habitCollection.containsValue(h);
    }

}
