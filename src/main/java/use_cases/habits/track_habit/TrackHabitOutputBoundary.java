package use_cases.habits.track_habit;

/**
 * This is an interface that passes the output to the Presenter of trackhabit.
 */

public interface TrackHabitOutputBoundary {

    /**
     * @param outputData - Output to be displayed on successful tracking of a habit.
     */
    TrackHabitOutputData prepareSuccessView(TrackHabitOutputData outputData);

    /**
     * @param outputData - Output to be displayed on unsuccessful tracking of a habit.
     */
    TrackHabitOutputData prepareFailView(TrackHabitOutputData outputData);
}
