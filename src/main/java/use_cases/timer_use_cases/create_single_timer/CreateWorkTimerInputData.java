package use_cases.timer_use_cases.create_single_timer;

/**
 * Input data of timer creation.
 */
public class CreateWorkTimerInputData {

    private final int workTimerMinutes;

    /**
     * Constructor of the CreateWorkTimerInputData object.
     * @param workTimerMinutes - the input work timer minutes.
     */
    public CreateWorkTimerInputData(int workTimerMinutes) {
        this.workTimerMinutes = workTimerMinutes;
    }

    public int getWorkTimerMinutes(){
        return workTimerMinutes;
    }
}
