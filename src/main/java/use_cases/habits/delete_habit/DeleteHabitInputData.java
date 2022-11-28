package use_cases.habits.delete_habit;

/**
 * Application Business Layer
 *
 * This class is a container for the input data related to deletion of a task, it is created by the controller and sent
 * to the interactor/use case.
 */
public class DeleteHabitInputData {
    private final String habitId;

    /**
     * Constructor for a DeleteTaskInputData object.
     * @param id - the id of the task which will be deleted. The task is always existing in the database.
     */
    public DeleteHabitInputData(String id) {
        this.habitId = id;
    }

    /**
     * @return the id of the task that will be deleted / the task attribute of a DeleteTaskInputData object.
     */
    public String getHabitId() {
        return habitId;
    }
}
