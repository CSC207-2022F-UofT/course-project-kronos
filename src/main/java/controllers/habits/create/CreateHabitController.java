package controllers.habits.create;

import use_cases.habits.create_habit.CreateHabitInputBoundary;
import use_cases.habits.create_habit.CreateHabitInputData;
import use_cases.habits.create_habit.CreateHabitOutputData;


public class CreateHabitController {
    final CreateHabitInputBoundary userInput;

    public CreateHabitController(CreateHabitInputBoundary habitGateway) {
        this.userInput = habitGateway;
    }
    CreateHabitOutputData create(String name, String t){
        CreateHabitInputData inputData = new CreateHabitInputData(name, t);
        return userInput.create(inputData);
    }
}
