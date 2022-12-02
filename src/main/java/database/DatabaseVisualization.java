package database;

import entities.Habit;
import use_cases.visualization.visualization_month.VisualizationMonthDsGateway;
import use_cases.visualization.visualization_week.VisualizationWeekDsGateway;
import use_cases.visualization.visualization_week.VisualizationWeekDsRequestModel;
import use_cases.visualization.visualization_year.VisualizationYearDsGateway;

import java.util.HashMap;

public class DatabaseVisualization implements VisualizationWeekDsGateway, VisualizationMonthDsGateway, VisualizationYearDsGateway {

    private HashMap<String, Habit> collection;

    public DatabaseVisualization(DatabaseUser database){
        this.collection = database.currUser.getHabitCollection().getCollection();
    }

    @Override
    public void createChart(VisualizationWeekDsRequestModel requestModel) {
        // need to implement
    }

    @Override
    public void createChart(VisualizationYearDsGateway requestModel) {

    }

    @Override
    public boolean existsByName(String habitName) {
        return collection.containsKey(habitName);
    }

    @Override
    public boolean checkRecordsExist(String habitName) {
        return collection.get(habitName).getFrequencyMap().size() > 0;
    }
}
