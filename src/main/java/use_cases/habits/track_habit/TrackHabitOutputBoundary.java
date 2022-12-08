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
     * @param error - the error message showed.
     *      * @return output data.
     */
    TrackHabitOutputData prepareFailView(String error);
}
