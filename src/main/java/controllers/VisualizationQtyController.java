package controllers;


import use_cases.visualization.visualization_quantity.VisualizationInputBoundary;
import use_cases.visualization.visualization_quantity.VisualizationRequestModel;
import use_cases.visualization.visualization_quantity.VisualizationResponseModel;

import java.util.Date;

public class VisualizationQtyController {

    final VisualizationInputBoundary visualizationInput;

    public VisualizationQtyController(VisualizationInputBoundary visualizationInput){
        this.visualizationInput = visualizationInput;
    }


    VisualizationResponseModel showQtyVisual(String habitName, Date startDate, Date endDate){
        VisualizationRequestModel requestModel = new VisualizationRequestModel(habitName, startDate, endDate);

        return visualizationInput.showQuantityVisual(requestModel);
    }


}