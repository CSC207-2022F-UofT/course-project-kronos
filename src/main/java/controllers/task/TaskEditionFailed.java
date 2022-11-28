package controllers.task;

/**
 * Exception deals the failure of task editing.
 */
public class TaskEditionFailed extends RuntimeException{
    public TaskEditionFailed(String error){
        super(error);
    }
}
