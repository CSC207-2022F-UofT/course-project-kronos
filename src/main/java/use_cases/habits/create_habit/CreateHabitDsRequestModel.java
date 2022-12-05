package use_cases.habits.create_habit;

import entities.Habit;

/**
 * Request Model class for creating a habit.
 */
public class CreateHabitDsRequestModel {

    private Habit habit;

    /**
     * Constructor for this class.
     * @param habit -
     */
    public CreateHabitDsRequestModel(Habit habit) {
        this.habit = habit;
    }

    /**
     * @return returns the habit
     */
    public Habit getHabit() {
        return habit;
    }

    /**
     * Sets the attribute habit for this class to the given habit.
     * @param h -
     */
    public void setHabit(Habit h) {
        this.habit = h;
    }
}
