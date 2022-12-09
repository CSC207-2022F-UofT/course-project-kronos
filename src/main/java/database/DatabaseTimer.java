package database;

import use_cases.timer.create_single_timer.CreateWorkTimerDsGateway;
import use_cases.timer.create_single_timer.CreateWorkTimerDsRequestModel;
import use_cases.timer.edit_timer.EditTimerDsGateway;
import use_cases.timer.edit_timer.EditTimerDsRequestModel;

public class DatabaseTimer implements CreateWorkTimerDsGateway, EditTimerDsGateway {
    /**
     * Saving the work timer related data in the request model.
     *
     * @param requestModel - a data structure that contains data about the new work timer that should be saved in
     *                     the database.
     */
    @Override
    public void saveWorkTimer(CreateWorkTimerDsRequestModel requestModel) {

    }

    /**
     * Saving the work timer related data in the request model.
     *
     * @param requestModel - a data structure that contains data about the new work timer that should be saved in
     *                     the database.
     */
    @Override
    public void saveTimer(EditTimerDsRequestModel requestModel) {

    }


}
