package use_cases.habits.edit_habit;
import entities.Habit;
import entities.User;

public interface EditHabitInputBoundary {

    EditHabitOutputData edit(EditHabitInputData inputData);
}
