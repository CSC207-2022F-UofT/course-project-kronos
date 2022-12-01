package database;

import use_cases.visualization.visualization_week.VisualizationWeekDsGateway;
import use_cases.visualization.visualization_week.VisualizationWeekDsRequestModel;

import java.util.HashMap;

public class DatabaseVisualization implements VisualizationWeekDsGateway {

    private HashMap collection;

    public DatabaseVisualization(Database database){
        this.collection = database.currUser.getHabitCollection().getCollection();
    }

    @Override
    public HashMap createChart(VisualizationWeekDsRequestModel requestModel) {

    }

    @Override
    public boolean existsByName(String habitName) {
        return collection.containsKey(habitName);
    }
}
