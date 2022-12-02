package controllers.habits.track;
import entities.Habit;
import entities.User;
import use_cases.habits.create_habit.CreateHabitInputBoundary;
import use_cases.habits.create_habit.CreateHabitInputData;
import use_cases.habits.create_habit.CreateHabitOutputData;
import use_cases.habits.edit_habit.EditHabitInputBoundary;
import use_cases.habits.edit_habit.EditHabitInputData;
import use_cases.habits.track_habit.TrackHabitInputBoundary;
import use_cases.habits.track_habit.TrackHabitInputData;
import use_cases.habits.track_habit.TrackHabitOutputData;

/**
 Controller class for editing a habit.
 */

public class TrackHabitController {

    final TrackHabitInputBoundary userInput;

    /**
     * Constructor for this class.
     * @param habitGateway - The input from the user.
     */

    public TrackHabitController(TrackHabitInputBoundary habitGateway) {
        this.userInput = habitGateway;
    }

    /**
     * @param name - The name of habit.
     * @return returns the output data after editing.
     */
    public TrackHabitOutputData create(String name){
        TrackHabitInputData inputData = new TrackHabitInputData(name);
        return userInput.track(inputData);
    }
}
