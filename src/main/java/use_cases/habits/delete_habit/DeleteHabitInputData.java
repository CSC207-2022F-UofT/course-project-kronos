package use_cases.habits.delete_habit;

/**
 * Application Business Layer
 * This class is a container for the input data related to deletion of a habit, it is created by the controller and sent
 * to the interactor/use case.
 */
public class DeleteHabitInputData {
    private final String habitId;

    /**
     * Constructor for this class.
     * @param id - the id of the habit which will be deleted. The habit is always existing in the database.
     */
    public DeleteHabitInputData(String id) {
        this.habitId = id;
    }

    /**
     * @return the id of the habit that will be deleted / the habit attribute of a DeleteHabitInputData object.
     */
    public String getHabitId() {
        return habitId;
    }
}
