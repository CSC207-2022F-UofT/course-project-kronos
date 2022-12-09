package use_cases.habits.track_habit;


/**
 *  This class is a container for the output data related to tracking of habit, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class TrackHabitOutputData {

    private final String hName;

    private final int frequency;


    /**
     * A constructor that is used only when the frequency of a habit is successfully tracked.
     *
     * @param name - the name of the habit to be tracked.
     * @param  freq - frequency
     */
    public TrackHabitOutputData(String name, int freq) {
        this.hName = name;
        this.frequency = freq;
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
