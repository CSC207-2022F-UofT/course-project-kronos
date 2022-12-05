package controllers.habits;
import use_cases.habits.delete_habit.DeleteHabitOutputBoundary;
import use_cases.habits.delete_habit.DeleteHabitOutputData;

/**
 Presenter class for deleting a habit.
 */
public class DeleteHabitPresenter implements DeleteHabitOutputBoundary {

    /**
     * @param output - The output to be presented on the screen
     * @return returns the output data
     */

    @Override
    public DeleteHabitOutputData prepareSuccessView(DeleteHabitOutputData output) {

        return output;
    }
}
