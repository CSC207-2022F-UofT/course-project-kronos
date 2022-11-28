package use_cases.habits.track_habit;

public class TrackHabitInputData {

    private final String inputName;

    /**
     * Constructor for a EditTaskInputData object.
     *
     * @param inputName - the name of the task after edition.
     * @param t         - the category name of the task after edition.
     */
    public TrackHabitInputData(String inputName, String t) {
        this.inputName = inputName;
    }

    public String getInputName() {
        return inputName;
    }

}
