/*
package controllers.habits.edit;

import use_cases.habits.edit_habit.EditHabitInputBoundary;
import use_cases.habits.edit_habit.EditHabitInputData;
import use_cases.habits.edit_habit.EditHabitOutputData;


*/
/**
 Controller class for editing a habit.
 *//*

public class EditHabitController {

    final EditHabitInputBoundary userInput;


    */
/**
     * Constructor for this class.
     * @param habitGateway - The input from the user.
     *//*

    public EditHabitController(EditHabitInputBoundary habitGateway) {
        this.userInput = habitGateway;
    }

    */
/**
     * @param oldName - The name of habit before editing.
     * @param newName - The name of habit after editing.
     * @param type - The type of habit.
     * @return returns the output data after creation.
     *//*

    public EditHabitOutputData edit(String oldName, String newName, String type){
        EditHabitInputData inputData = new EditHabitInputData(oldName, newName, type);
        return userInput.edit(inputData);
    }
}
*/
