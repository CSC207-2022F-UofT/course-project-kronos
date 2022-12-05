package controllers.tasks;

/**
 * Exception deals the failure of task editing.
 */
public class TaskEditionFailed extends RuntimeException{
    /**
     * Exception Constructor.
     * @param error - the error message.
     */
    public TaskEditionFailed(String error){
        super(error);
    }
}
