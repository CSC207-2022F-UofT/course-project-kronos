package database;

import entities.Habit;
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
    private final HashMap<String, Habit> habitCollection;

    /**
     * Constructor for DatabaseHabit
     * @param database - Database object
     */
    public DatabaseHabit(DatabaseUser database){
        this.habitCollection = database.getHabits();
    }

    /**
     * @return hashmap of all habits stored for the user
     */
    public HashMap<String, Habit> getHabitCollection() {
        return this.habitCollection;
    }

    /**
     * Delete the habit from database
     * @param requestModel
     */
    @Override
    public void deleteHabit(DeleteHabitDsRequestModel requestModel) {
        this.habitCollection.remove(requestModel.getHabitName());
    }

    /**
     * Save the edited habit to database
     * @param requestModel
     */
    @Override
    public void save(EditHabitDsRequestModel requestModel) {
        this.habitCollection.replace(requestModel.getHabit().getName(), requestModel.getHabit());
    }

    /**
     * save the created habit to database
     * @param requestModel
     */
    @Override
    public void save(CreateHabitDsRequestModel requestModel) {
        this.habitCollection.put(requestModel.getHabit().getName(), requestModel.getHabit());
    }

    /**
     * Update the habit once a new change for completion has been tracked
     * @param requestModel
     */
    @Override
    public void save(TrackHabitDsRequestModel requestModel) {
        this.habitCollection.replace(requestModel.getHabitName(), requestModel.getHabit());
    }

}