package use_cases.habits.edit_habit;

/**
 * This is an interface that passes the inputData to the interactor of edit habit.
 */
public interface EditHabitInputBoundary {

    /**
     * @param inputData - data to be passed to the interactor.
     */
    EditHabitOutputData edit(EditHabitInputData inputData);
}
