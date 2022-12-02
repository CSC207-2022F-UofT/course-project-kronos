package use_cases.habits.edit_habit;


/**
 *  This class is a container for the output data related to editing of habit, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class EditHabitOutputData {

    private final String message;
    private String hName;
    private String hType;


    /**
     * A constructor for this class when habit is not edited.
     * @param message - the failure message.
     */
    public EditHabitOutputData(String message){
        this.message = message;
    }

    /**
     * A constructor that is used only when a habit is successfully edited.
     * @param message - the success message.
     * @param name - the name of the habit after edition.
     * @param type - the type of the habit after edition.
     */
    public EditHabitOutputData(String message, String name, String type) {
        this.message = message;
        this.hName = name;
        this.hType = type;
    }

    /**
     * @return the success/failure message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the name of the habit
     */
    public String getHabitName() {
        return hName;
    }

    /**
     * @return the type of habit
     */
    public String getHabitType() {
        return hType;
    }
}
