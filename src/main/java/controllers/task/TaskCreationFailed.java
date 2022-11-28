package controllers.task;

/**
 * Exception deals with failure of creating task.
 */
public class TaskCreationFailed extends RuntimeException{
    public TaskCreationFailed(String error){
        super(error);
    }
}
