package controllers.habits.edit;

import use_cases.habits.edit_habit.EditHabitInputBoundary;

public class EditHabitController {

    final EditHabitInputBoundary userInput;

    public EditHabitController(EditHabitInputBoundary habitGateway) {
        this.userInput = habitGateway;
    }
}
