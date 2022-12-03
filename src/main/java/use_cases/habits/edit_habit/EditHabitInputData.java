package use_cases.habits.edit_habit;

/**
 * Application Business Layer
 * This class is a container for the input data related to editing of a habit, it is created by the controller and sent
 * to the interactor/use case.
 */
public class EditHabitInputData {
    private final String inputName;
    private final String inputType;


    /**
     * Constructor for a EditHabitInputData object.
     *
     * @param inputName - the name of the habit after editing.
     * @param type  - the type of the habit after editing.
     */
    public EditHabitInputData(String inputName, String type) {
        this.inputName = inputName;
        this.inputType = type;
    }

    /**
     * @return the name for the habit.
     */
    public String getInputName() {
        return inputName;
    }

    /**
     * @return the type of habit.
     */
    public String getInputType() {
        return inputType;
    }

}
