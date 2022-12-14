package database;

import entities.TimerTomato;
import entities.User;
import use_cases.timer.create_single_timer.CreateWorkTimerDsRequestModel;
import use_cases.timer.edit_timer.EditTimerDsRequestModel;
import use_cases.timer.create_single_timer.CreateWorkTimerDsGateway;
import use_cases.timer.edit_timer.EditTimerDsGateway;

public class DatabaseTimer implements CreateWorkTimerDsGateway, EditTimerDsGateway {

    private final User currUser;
    public DatabaseTimer(DatabaseUser databaseUser){
        this.currUser = databaseUser.currUser;
    }


    /**
     * Saving the work timer related data in the request model.
     *
     * @param requestModel - a data structure that contains data about the new work timer that should be saved in
     *                     the database.
     */
    @Override
    public void saveWorkTimer(CreateWorkTimerDsRequestModel requestModel) {
        TimerTomato tomato = new TimerTomato(requestModel.getWorkTimerMinutes());
        this.currUser.setTomato(tomato);
    }

    /**
     * Saving the work timer related data in the request model.
     *
     * @param requestModel - a data structure that contains data about the new work timer that should be saved in
     *                     the database.
     */
    @Override
    public void saveTimer(EditTimerDsRequestModel requestModel) {
        TimerTomato tomato = new TimerTomato(requestModel.getTimerMinutes());
        this.currUser.setTomato(tomato);
    }
}
