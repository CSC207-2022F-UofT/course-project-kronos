package use_cases.timer_use_cases.edit_timer;

public class EditTimerDsRequestModel {

    private final int timerMinutes;

    /**
     * Constructor
     * @param timerMinutes - the minutes of the work timer.
     */

    public EditTimerDsRequestModel(int timerMinutes){
        this.timerMinutes = timerMinutes;
    }

    /**
     * @return the minutes of the work timer.
     */
    public int getTimerMinutes(){
        return timerMinutes;
    }
}
