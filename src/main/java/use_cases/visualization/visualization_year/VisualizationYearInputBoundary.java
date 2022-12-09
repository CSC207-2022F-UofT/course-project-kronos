package use_cases.visualization.visualization_year;

import use_cases.visualization.visualization_week.VisualizationWeekRequestModel;
import use_cases.visualization.visualization_week.VisualizationWeekResponseModel;

public interface VisualizationYearInputBoundary {
    /**
     * Interface used by the Controller, implemented by interactor. Used by controller to call interactor to show visual
     * habit progression in the Year
     */
    VisualizationWeekResponseModel showVisual(VisualizationWeekRequestModel requestModel);
}
