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
     * @param outputData - Output to be displayed on failure of editing of a habit.
     */

    EditHabitOutputData prepareFailView(EditHabitOutputData outputData);

}
