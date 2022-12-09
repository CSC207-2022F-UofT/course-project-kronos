package use_cases.habits.edit_habit;

/**
 * This is an interface that passes the output to the Presenter of habit editing.
 */
public interface EditHabitOutputBoundary {

    /**
     * @param outputData - Output to be displayed on successful editing of a habit.
     */
    EditHabitOutputData prepareSuccessView(EditHabitOutputData outputData);

    /**
     * @param error - the error message showed.
     * @return output data.
     */
    EditHabitOutputData prepareFailView(String error);
}
