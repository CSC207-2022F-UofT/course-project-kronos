package controllers.habits.delete;

import use_cases.habits.delete_habit.DeleteHabitInputBoundary;
import use_cases.habits.delete_habit.DeleteHabitInputData;
import use_cases.habits.delete_habit.DeleteHabitOutputData;

public class DeleteHabitController {

    final DeleteHabitInputBoundary userInput;

    public DeleteHabitController(DeleteHabitInputBoundary habitGateway) {
        this.userInput = habitGateway;
    }


    DeleteHabitOutputData delete(String habitID){
        DeleteHabitInputData inputData = new DeleteHabitInputData(habitID);
        return userInput.delete(inputData);
    }
}
