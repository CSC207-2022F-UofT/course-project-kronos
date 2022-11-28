package use_cases.habits.edit_habit;

public class EditHabitInputData {
    private final String inputName;
    private final String inputType;


    /**
     * Constructor for a EditTaskInputData object.
     *
     * @param inputName - the name of the task after edition.
     * @param t  - the category name of the task after edition.
     */
    public EditHabitInputData(String inputName, String t) {
        this.inputName = inputName;
        this.inputType = t;
    }

    public String getInputName() {
        return inputName;
    }

    public String getInputType() {
        return inputType;
    }

}
