package use_cases.habits.edit_habit;

public interface EditHabitOutputBoundary {

    EditHabitOutputData prepareSuccessView(EditHabitOutputData outputData);
    EditHabitOutputData prepareFailView(EditHabitOutputData outputData);
}
