package use_cases.habits.delete_habit;

import entities.Habit;

/**
 * Request Model class for deleting a habit.
 */
public class DeleteHabitDsRequestModel {

    private final Habit habit;


    /**
     * Constructor for this class.
     * @param h - Habit to be deleted.
     */
    public DeleteHabitDsRequestModel(Habit h) {
        this.habit = h;
    }

    /**
     *
     * @return habit
     */
    public Habit getHabit() {
        return habit;
    }
}
