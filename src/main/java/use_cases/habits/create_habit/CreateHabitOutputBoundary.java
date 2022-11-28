package use_cases.habits.create_habit;

/**
 * This is an interface that passes the output to the Presenter of habit creation.
 */
public interface CreateHabitOutputBoundary {
    CreateHabitOutputData prepareSuccessView(CreateHabitOutputData outputData);
    CreateHabitOutputData prepareFailView(String error);

}
