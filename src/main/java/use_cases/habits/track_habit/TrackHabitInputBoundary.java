package use_cases.habits.track_habit;

/**
 * This is an interface that passes the inputData to the interactor of track habit.
 */
public interface TrackHabitInputBoundary {

    /**
     * @param inputData - data to be passed to the interactor.
     */
    TrackHabitOutputData track(TrackHabitInputData inputData);
}
