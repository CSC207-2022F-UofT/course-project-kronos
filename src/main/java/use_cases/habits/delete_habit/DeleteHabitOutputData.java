package use_cases.habits.delete_habit;

/**
 *  This class is a container for the output data related to deletion of habit, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class DeleteHabitOutputData {

    private final String message;

    /**
     * Constructor
     *
     * @param message - the message of the result of deletion.
     */
    public DeleteHabitOutputData(String message) {
        this.message = message;
    }

    /**
     * @return the message displayed when habit is deleted.
     */
    public String getMessage() {
        return message;
    }

}
