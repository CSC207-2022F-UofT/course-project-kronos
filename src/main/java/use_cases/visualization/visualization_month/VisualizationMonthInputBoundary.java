package use_cases.visualization.visualization_month;

import use_cases.visualization.visualization_week.VisualizationWeekRequestModel;
import use_cases.visualization.visualization_week.VisualizationWeekResponseModel;

/**
 * Interface implemented by interactor, and called by controller to
 */
public interface VisualizationMonthInputBoundary {
    /**
     * Interface used by the Controller, implemented by interactor. Used by controller to call interactor to show visual
     * habit progression in the month
     * @param requestModel
     * @return
     */
    VisualizationMonthResponseModel showVisual(VisualizationMonthRequestModel requestModel);
}
