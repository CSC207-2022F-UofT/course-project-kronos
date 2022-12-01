package controllers;


import use_cases.visualization.visualization_week.VisualizationWeekInputBoundary;
import use_cases.visualization.visualization_week.VisualizationWeekRequestModel;
import use_cases.visualization.visualization_week.VisualizationWeekResponseModel;

import java.util.Date;

public class VisualizationWeekController {

    final VisualizationWeekInputBoundary visualizationInput;

    public VisualizationWeekController(VisualizationWeekInputBoundary visualizationInput){
        this.visualizationInput = visualizationInput;
    }


    VisualizationWeekResponseModel showQuantityVisual(String habitName, Date startDate){
        VisualizationWeekRequestModel requestModel = new VisualizationWeekRequestModel(habitName, startDate);

        return visualizationInput.showQuantityVisual(requestModel);
    }


}