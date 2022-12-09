package use_cases.habits.create_habit;

import entities.Habit;

/**
 * Request Model class for creating a habit.
 */
public class CreateHabitDsRequestModel {

    private Habit habit;

    private String id;



    /**
     * Constructor for this class.
     * @param habit - The habit to be created.
     */
    public CreateHabitDsRequestModel(Habit habit) {

        this.habit = habit;
        this.id = habit.getName();
    }

    /**
     * @return returns the habit
     */
    public Habit getHabit() {
        return this.habit;
    }

    /**
     * @return returns the habit id
     */
    public String getHabitId() {
        return this.id;
    }

}
