package controllers.habits;

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
     * @param error - the error message showed.
     * @return habitTrackFailed Exception.
     */
    @Override
    public TrackHabitOutputData prepareFailView(String error) {
        throw new HabitTrackFailed(error);
    }
}
