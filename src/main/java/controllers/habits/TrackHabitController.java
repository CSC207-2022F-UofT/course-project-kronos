package controllers.habits;

import use_cases.habits.track_habit.TrackHabitInputBoundary;
import use_cases.habits.track_habit.TrackHabitInputData;

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
     */
    public void track(String name){
        TrackHabitInputData inputData = new TrackHabitInputData(name);
        userInput.track(inputData);
    }
}
