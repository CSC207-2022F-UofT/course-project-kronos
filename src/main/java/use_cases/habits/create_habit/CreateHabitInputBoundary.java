package use_cases.habits.create_habit;

/**
 * This is an interface that passes the inputData to the interactor of habit creation.
 */
public interface CreateHabitInputBoundary {

    /**
     * @param inputData - Data to be passed to the interactor.
     */
    CreateHabitOutputData create(CreateHabitInputData inputData);

}
