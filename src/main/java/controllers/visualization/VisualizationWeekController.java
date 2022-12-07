package controllers.visualization;


import use_cases.visualization.visualization_week.VisualizationWeekInputBoundary;
import use_cases.visualization.visualization_week.VisualizationWeekRequestModel;
import use_cases.visualization.visualization_week.VisualizationWeekResponseModel;

import java.util.Calendar;
import java.util.Date;

public class VisualizationWeekController {

    final VisualizationWeekInputBoundary visualizationInput;

    public VisualizationWeekController(VisualizationWeekInputBoundary visualizationInput){
        this.visualizationInput = visualizationInput;
    }


    VisualizationWeekResponseModel showVisual(String habitName, Calendar startDate){
        VisualizationWeekRequestModel requestModel = new VisualizationWeekRequestModel(habitName, startDate, "./");

        return visualizationInput.showVisual(requestModel);
    }


}