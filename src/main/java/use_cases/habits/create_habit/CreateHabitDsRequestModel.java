package use_cases.habits.create_habit;

import entities.Habit;

/**
 * Request Model class for creating a habit.
 */
public class CreateHabitDsRequestModel {

    private final Habit habit;


    /**
     * Constructor for this class.
     * @param habit - The habit to be created.
     */
    public CreateHabitDsRequestModel(Habit habit) {

        this.habit = habit;
    }

    /**
     * @return returns the habit
     */
    public Habit getHabit() {
        return this.habit;
    }

}
