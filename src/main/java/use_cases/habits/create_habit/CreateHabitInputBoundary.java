package use_cases.habits.create_habit;
import entities.HabitFactory;


public interface CreateHabitInputBoundary {

    CreateHabitOutputData create(CreateHabitInputData inputData);
}
