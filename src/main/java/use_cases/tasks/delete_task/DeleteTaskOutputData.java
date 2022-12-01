package use_cases.tasks.delete_task;

/**
 *  This class is a container for the output data related to deletion of task, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class DeleteTaskOutputData {
    private final String message;

    /**
     * Constructor
     *
     * @param message - the message of the result of deletion.
     */
    public DeleteTaskOutputData(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
