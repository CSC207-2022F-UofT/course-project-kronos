package use_cases.habits.track_habit;

/**
 * Gateway for tracking the frequency of a habit.
 */
public interface TrackHabitDsGateway {

    void save(TrackHabitDsRequestModel requestModel);
}
