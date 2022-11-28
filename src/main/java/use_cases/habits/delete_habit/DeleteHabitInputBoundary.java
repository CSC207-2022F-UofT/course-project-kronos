package use_cases.habits.delete_habit;

/**
 * This is an interface that passes the inputData to the interactor of task deletion.
 */

public interface DeleteHabitInputBoundary {
    DeleteHabitOutputData delete(DeleteHabitInputData inputData);
}
