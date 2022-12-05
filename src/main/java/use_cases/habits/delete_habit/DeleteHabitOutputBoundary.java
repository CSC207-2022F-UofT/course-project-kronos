package use_cases.habits.delete_habit;

/**
 * This is an interface that passes the output to the Presenter of habit deletion.
 */
public interface DeleteHabitOutputBoundary {

    /**
     * @param outputData - Output to be displayed on successful deletion of a habit.
     */
    DeleteHabitOutputData prepareSuccessView(DeleteHabitOutputData outputData);
}
