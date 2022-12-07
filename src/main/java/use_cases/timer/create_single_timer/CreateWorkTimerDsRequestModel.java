package use_cases.timer.create_single_timer;

public class CreateWorkTimerDsRequestModel {

    private final int workTimerMinutes;

    /**
     * Constructor
     * @param workTimerMinutes - the minutes of the work timer.
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
