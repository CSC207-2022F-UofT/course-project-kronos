package use_cases.habits.edit_habit;

import entities.Habit;

/**
 * Request Model class for editing a habit.
 */
public class EditHabitDsRequestModel {

    private Habit habit;

    private String id;

    /**
     * Constructor for this class.
     * @param habit - Habit to be edited.
     */
    public EditHabitDsRequestModel(Habit habit){

        this.habit = habit;
        this.id = habit.getName();
    }

    /**
     *
     * @return habit.
     */
    public Habit getHabit() {
        return habit;
    }

    /**
     *
     * @return id.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the attribute habit of this class to the given habit.
     * @param habit - given habit
     */
    public void setHabit(Habit habit) {
        this.habit = habit;
    }

    /**
     * Sets the attribute habit of this class to the given habit.
     * @param id - given id
     */
    public void setId(String id) {
        this.id = id;
    }
}
