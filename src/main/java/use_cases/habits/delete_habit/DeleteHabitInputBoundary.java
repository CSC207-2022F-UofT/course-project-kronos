package use_cases.habits.delete_habit;

/**
 * This is an interface that passes the inputData to the interactor of habit deletion.
 */

public interface DeleteHabitInputBoundary {

    /**
     * @param inputData - data to be passed to the interactor.
     */
    DeleteHabitOutputData delete(DeleteHabitInputData inputData);
}
