package controllers.habits;

/**
 * Exception deals with failure of editing a habit.
 */
public class HabitEditFailed extends RuntimeException{

    /**
     *
     * @param error - Message to be displayed when editing of habit failed.
     */
    public HabitEditFailed(String error){
        super(error);
    }
}
