package use_cases.habits.delete_habit;

import use_cases.habits.create_habit.CreateHabitOutputData;

public interface DeleteHabitOutputBoundary {
    DeleteHabitOutputData prepareSuccessView(DeleteHabitOutputData outputData);
}
