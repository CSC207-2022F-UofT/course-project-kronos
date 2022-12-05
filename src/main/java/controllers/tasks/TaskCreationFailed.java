package controllers.tasks;

/**
 * Exception deals with failure of creating task.
 */
public class TaskCreationFailed extends RuntimeException{
    /**
     * Exception Constructor.
     * @param error - the error message.
     */
    public TaskCreationFailed(String error){
        super(error);
    }
}
