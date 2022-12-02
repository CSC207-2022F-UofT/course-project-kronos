package use_cases.habits.create_habit;

/**
 * This is an interface that passes the output to the Presenter of habit creation.
 */
public interface CreateHabitOutputBoundary {

    /**
     * @param outputData - Output to be displayed on successful creation of a habit.
     */
    CreateHabitOutputData prepareSuccessView(CreateHabitOutputData outputData);

    /**
     * @param error - Message to be displayed on failure of habit creation.
     */
    CreateHabitOutputData prepareFailView(String error);

}
