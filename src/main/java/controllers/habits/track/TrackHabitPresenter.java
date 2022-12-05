package controllers.habits.track;

import use_cases.habits.track_habit.TrackHabitOutputBoundary;
import use_cases.habits.track_habit.TrackHabitOutputData;

public class TrackHabitPresenter implements TrackHabitOutputBoundary {

    /**
     * @param output - The output to be presented on the screen when habit tracked successfully
     * @return returns the output data
     */

    @Override
    public TrackHabitOutputData prepareSuccessView(TrackHabitOutputData output) {

        return output;
    }

    /**
     * @param output - The output to be presented on the screen when habit was not tracked successfully
     * @return returns the output data
     */
    @Override
    public TrackHabitOutputData prepareFailView(TrackHabitOutputData output) {
        return output;
    }
}
