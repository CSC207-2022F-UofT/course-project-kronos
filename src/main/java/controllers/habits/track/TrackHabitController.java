package controllers.habits.track;

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
    public TrackHabitOutputData track(String name){
        TrackHabitInputData inputData = new TrackHabitInputData(name);
        return userInput.track(inputData);
    }
}
