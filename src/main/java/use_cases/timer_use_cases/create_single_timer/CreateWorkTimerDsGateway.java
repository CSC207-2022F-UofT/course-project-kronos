package use_cases.timer_use_cases.create_single_timer;

import use_cases.timer_use_cases.edit_timer.EditTimerDsRequestModel;

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

    void saveTimer(EditTimerDsRequestModel requestModel);
}
