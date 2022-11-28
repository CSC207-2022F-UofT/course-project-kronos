package use_cases.habits.edit_habit;

public class EditHabitOutputData {

    private final String message;
    private String hName;
    private String hType;


    /**
     * A constructor that is used when there is a failure to edit task.
     *
     * @param message - the failure message.
     */
    public EditHabitOutputData(String message){
        this.message = message;
    }

    /**
     * A constructor that is used only when a task is successfully edited.
     *
     * @param message - the success message.
     * @param name - the name of the task after edition.
     * @param t - the deadline of the task after edition.
     */
    public EditHabitOutputData(String message, String name, String t) {
        this.message = message;
        this.hName = name;
        this.hType = t;
    }

    public String getMessage() {
        return message;
    }

    public String getHabitName() {
        return hName;
    }

    public String getHabitType() {
        return hType;
    }
}
