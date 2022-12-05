package controllers.habits;

import use_cases.habits.edit_habit.EditHabitOutputBoundary;
import use_cases.habits.edit_habit.EditHabitOutputData;

/**
 Presenter class for editing a habit.
 */
public class EditHabitPresenter implements EditHabitOutputBoundary {

    /**
     * @param output - The output to be presented on the screen for successfully editing a habit
     * @return returns the output data
     */

    @Override
    public EditHabitOutputData prepareSuccessView(EditHabitOutputData output) {

        return output;
    }

    /**
     * @param output - The output to be presented on the screen for not successfully editing a habit
     * @return returns the output data
     */
    @Override
    public EditHabitOutputData prepareFailView(EditHabitOutputData output) {

        return output;
    }
}
