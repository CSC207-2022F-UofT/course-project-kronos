package use_cases.visualization.visualization_month;

/**
 * Interface implemented by interactor, and called by controller to
 */
public interface VisualizationMonthInputBoundary {
    /**
     * Interface used by the Controller, implemented by interactor. Used by controller to call interactor to show visual
     * habit progression in the month
     */
    VisualizationMonthResponseModel showVisual(VisualizationMonthRequestModel requestModel);
}
