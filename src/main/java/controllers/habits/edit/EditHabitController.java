package controllers.habits.edit;

import use_cases.habits.create_habit.CreateHabitInputData;
import use_cases.habits.create_habit.CreateHabitOutputData;
import use_cases.habits.edit_habit.EditHabitInputBoundary;
import use_cases.habits.edit_habit.EditHabitInputData;
import use_cases.habits.edit_habit.EditHabitOutputData;


/**
 Controller class for editing a habit.
 */
public class EditHabitController {

    final EditHabitInputBoundary userInput;


    /**
     * Constructor for this class.
     * @param habitGateway - The input from the user.
     */
    public EditHabitController(EditHabitInputBoundary habitGateway) {
        this.userInput = habitGateway;
    }

    /**
     * @param name - The name of habit.
     * @param type - The type of habit.
     * @return returns the output data after creation.
     */
    public EditHabitOutputData edit(String name, String type){
        EditHabitInputData inputData = new EditHabitInputData(name, type);
        return userInput.edit(inputData);
    }
}
