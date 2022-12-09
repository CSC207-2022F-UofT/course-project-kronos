package use_cases.habits.track_habit;


/**
 * Gateway for tracking the frequency of a habit.
 */
public interface TrackHabitDsGateway {

    /**
     * Saves the data about the task after edition to the database.
     * @param requestModel - a data structure that contains data about the task after edition.
     */

    void save(TrackHabitDsRequestModel requestModel);
}
