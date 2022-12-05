package use_cases.habits.track_habit;

/**
 * Application Business Layer
 *  This class is a container for the input data related to tracking of habit, it is created by the controller and sent
 *  to the interactor/use case.
 */
public class TrackHabitInputData {

    private final String inputName;

    /**
     * Constructor for this class.
     * @param inputName - the name of the habit to be tracked.
     */
    public TrackHabitInputData(String inputName) {

        this.inputName = inputName;
    }

    /**
     * @return the name of the habit to be tracked.
     */
    public String getInputName() {
        return inputName;
    }

}
