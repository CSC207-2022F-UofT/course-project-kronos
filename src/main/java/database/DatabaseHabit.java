package database;

import use_cases.habits.create_habit.CreateHabitDsGateway;
import use_cases.habits.create_habit.CreateHabitDsRequestModel;
import use_cases.habits.delete_habit.DeleteHabitDsGateway;
import use_cases.habits.delete_habit.DeleteHabitDsRequestModel;
import use_cases.habits.edit_habit.EditHabitDsGateway;
import use_cases.habits.edit_habit.EditHabitDsRequestModel;
import use_cases.habits.track_habit.TrackHabitDsGateway;
import use_cases.habits.track_habit.TrackHabitDsRequestModel;

import java.util.HashMap;

public class DatabaseHabit implements CreateHabitDsGateway, DeleteHabitDsGateway, EditHabitDsGateway, TrackHabitDsGateway {

    private HashMap habitCollection;

    public DatabaseHabit(){
        //this.habitCollection = database.getHabits();
    }

    public HashMap getHabitCollection() {
        return this.habitCollection;
    }

    @Override
    public void deleteHabit(DeleteHabitDsRequestModel requestModel) {
        this.habitCollection.remove(requestModel.getHabit().getName());
    }

    @Override
    public void save(EditHabitDsRequestModel requestModel) {
        this.habitCollection.replace(requestModel.getHabit().getName(), requestModel.getHabit());
    }


    @Override
    public void save(CreateHabitDsRequestModel requestModel) {
        this.habitCollection.put(requestModel.getHabit().getName(), requestModel.getHabit());
    }

    @Override
    public void save(TrackHabitDsRequestModel requestModel) {
        this.habitCollection.replace(requestModel.getHabit().getName(), requestModel.getHabit());
    }

}
