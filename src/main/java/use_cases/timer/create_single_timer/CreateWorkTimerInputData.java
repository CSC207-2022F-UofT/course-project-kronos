package use_cases.timer.create_single_timer;

/**
 * Input data of timer creation.
 */
public class CreateWorkTimerInputData {

    private final CreateWorkTimerDsGateway workTimerMinutes;

    /**
     * Constructor of the CreateWorkTimerInputData object.
     * @param workTimerMinutes - the input work timer minutes.
     */
    public CreateWorkTimerInputData(CreateWorkTimerDsGateway workTimerMinutes) {
        this.workTimerMinutes = workTimerMinutes;
    }

    public CreateWorkTimerDsGateway getWorkTimerMinutes(){
        return workTimerMinutes;
    }

    public CreateWorkTimerOutputData create(CreateWorkTimerInputData inputData) {
        return null;
    }
}
