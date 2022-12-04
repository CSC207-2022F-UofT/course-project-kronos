package use_cases.timer_use_cases.edit_timer;

public class EditTimerInputData {

    private final int workTimerMinutes;

    private final int restTimerMinutes;

    /**
     * Constructor for a EditTimerInputData object.
     * @param workTimerMinutes - the minutes that the user needed for setting the work timer.
     * @param restTimerMinutes - the minutes that the user needed for setting the rest timer.
     */

    public EditTimerInputData(int workTimerMinutes, int restTimerMinutes) {
        this.workTimerMinutes = workTimerMinutes;
        this.restTimerMinutes = restTimerMinutes;
    }

    public int getWorkTimerMinutes() {
        return workTimerMinutes;
    }

    public int getRestTimerMinutes() {
        return restTimerMinutes;
    }
}
