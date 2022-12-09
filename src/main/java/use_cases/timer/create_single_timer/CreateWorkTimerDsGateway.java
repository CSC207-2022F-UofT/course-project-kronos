package use_cases.timer.create_single_timer;

/**
 * Create the database gateway for createWorkTimer.
 */

public interface CreateWorkTimerDsGateway{

    /**
     * Saving the work timer related data in the request model.
     * @param requestModel - a data structure that contains data about the new work timer that should be saved in
     *                     the database.
     */

    void saveWorkTimer(CreateWorkTimerDsRequestModel requestModel);
}
