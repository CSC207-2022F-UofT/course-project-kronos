package use_cases.tasks.delete_task;

/**
 *  This class is a container for the output data related to deletion of task, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class DeleteTaskOutputData {
    private final String message;
    private final String name;

    /**
     * Constructor
     * @param message - the message of the result of deletion.
     * @param name - the name of the task that is deleted.
     */
    public DeleteTaskOutputData(String message, String name) {
        this.message = message;
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
