package use_cases.habits.track_habit;

public class TrackHabitOutputData {

    private final String message;
    private String hName;

    private int f;


    /**
     * A constructor that is used when there is a failure to edit task.
     *
     * @param message - the failure message.
     */
    public TrackHabitOutputData(String message){
        this.message = message;
    }

    /**
     * A constructor that is used only when a task is successfully edited.
     *
     * @param message - the success message.
     * @param name - the name of the task after edition.
     * @param  f - frequency
     */
    public TrackHabitOutputData(String message, String name, int f) {
        this.message = message;
        this.hName = name;
        this.f = f;
    }

    public String getMessage() {
        return message;
    }

    public String getHabitName() {
        return hName;
    }

    public int getHabitFrequency() {return f;}
}
