package use_cases.timer_use_cases.create_single_timer;

public class CreateWorkTimerDsRequestModel {

    private final int workTimerMinutes;

    /**
     * Constructor
     * @param m - the minutes of the work timer.
     */

    public CreateWorkTimerDsRequestModel(int workTimerMinutes){
        this.workTimerMinutes = workTimerMinutes;
    }

    /**
     * @return the minutes of the work timer.
     */
    public int getWorkTimerMinutes(){
        return workTimerMinutes;
    }
}
