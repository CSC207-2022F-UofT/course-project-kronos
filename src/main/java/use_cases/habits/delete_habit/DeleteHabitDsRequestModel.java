package use_cases.habits.delete_habit;



/**
 * Request Model class for deleting a habit.
 */
public class DeleteHabitDsRequestModel {

    private final String habitName;


    /**
     * Constructor for this class.
     * @param habitName - Name of habit to be deleted.
     */
    public DeleteHabitDsRequestModel(String habitName) {
        this.habitName = habitName;
    }

    /**
     *
     * @return habit
     */
    public String getHabitName() {
        return this.habitName;
    }
}
