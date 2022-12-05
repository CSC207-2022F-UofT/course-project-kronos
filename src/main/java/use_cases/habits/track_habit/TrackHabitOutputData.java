package use_cases.habits.track_habit;


/**
 *  This class is a container for the output data related to tracking of habit, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class TrackHabitOutputData {

    private final String message;
    private String hName;

    private int frequency;


    /**
     * A constructor that is used when there is a failure to track the frequency of the habit.
     *
     * @param message - the failure message.
     */
    public TrackHabitOutputData(String message){
        this.message = message;
    }

    /**
     * A constructor that is used only when the frequency of a habit is successfully tracked.
     *
     * @param message - the success message.
     * @param name - the name of the habit to be tracked.
     * @param  freq - frequency
     */
    public TrackHabitOutputData(String message, String name, int freq) {
        this.message = message;
        this.hName = name;
        this.frequency = freq;
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
     * @return frequency of the habit
     */
    public int getHabitFrequency() {return frequency;}
}
