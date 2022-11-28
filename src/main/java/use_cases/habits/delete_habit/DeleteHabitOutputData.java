package use_cases.habits.delete_habit;

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

    public String getMessage() {
        return message;
    }

}
