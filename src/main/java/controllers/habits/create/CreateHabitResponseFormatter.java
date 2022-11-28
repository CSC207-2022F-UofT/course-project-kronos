package controllers.habits.create;

import controllers.habits.HabitCreationFailed;
import use_cases.habits.create_habit.CreateHabitOutputBoundary;
import use_cases.habits.create_habit.CreateHabitOutputData;

public class CreateHabitResponseFormatter implements CreateHabitOutputBoundary {

    @Override
    public CreateHabitOutputData prepareSuccessView(CreateHabitOutputData response) {

        return null;
    }

    @Override
    public CreateHabitOutputData prepareFailView(String error) {
        throw new HabitCreationFailed(error);
    }
}
