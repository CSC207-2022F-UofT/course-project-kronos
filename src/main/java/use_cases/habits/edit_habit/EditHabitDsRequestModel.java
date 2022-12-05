package use_cases.habits.edit_habit;

import entities.Habit;

/**
 * Request Model class for editing a habit.
 */
public class EditHabitDsRequestModel {

    private Habit habit;

    /**
     * Constructor for this class.
     * @param h - Habit to be edited.
     */
    public EditHabitDsRequestModel(Habit h){
        this.habit = h;
    }

    /**
     *
     * @return habit.
     */
    public Habit getHabit() {
        return habit;
    }

    /**
     * Sets the attribute habit of this class to the given habit.
     * @param habit - given habit
     */
    public void setHabit(Habit habit) {
        this.habit = habit;
    }
}
