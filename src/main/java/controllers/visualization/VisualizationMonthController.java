package controllers.visualization;

import use_cases.visualization.visualization_month.VisualizationMonthInputBoundary;
import use_cases.visualization.visualization_month.VisualizationMonthRequestModel;
import use_cases.visualization.visualization_month.VisualizationMonthResponseModel;

public class VisualizationMonthController implements VisualizationMonthInputBoundary {

    /**
     * Interface used by the Controller, implemented by interactor. Used by controller to call interactor to show visual
     * habit progression in the month
     *
     * @param requestModel
     * @return
     */
    @Override
    public VisualizationMonthResponseModel showVisual(VisualizationMonthRequestModel requestModel) {
        return null;
    }
}
