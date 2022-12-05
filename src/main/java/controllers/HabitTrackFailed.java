package controllers.habits;

/**
 * Exception deals with failure of tracking a habit.
 */
public class HabitTrackFailed extends RuntimeException {

    /**
     *
     * @param error - Message to be displayed when tracking of habit failed.
     */
    public HabitTrackFailed(String error){
        super(error);
    }
}
