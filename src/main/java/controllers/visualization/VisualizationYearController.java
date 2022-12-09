package controllers.visualization;

import use_cases.visualization.visualization_week.VisualizationWeekRequestModel;
import use_cases.visualization.visualization_week.VisualizationWeekResponseModel;
import use_cases.visualization.visualization_year.VisualizationYearInputBoundary;
import use_cases.visualization.visualization_year.VisualizationYearOutputBoundary;

public class VisualizationYearController implements VisualizationYearInputBoundary {
    /**
     * Interface used by the Controller, implemented by interactor. Used by controller to call interactor to show visual
     * habit progression in the Year
     *
     * @param requestModel
     * @return
     */
    @Override
    public VisualizationWeekResponseModel showVisual(VisualizationWeekRequestModel requestModel) {
        return null;
    }
}
