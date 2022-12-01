package use_cases.visualization.visualization_week;

public interface VisualizationWeekInputBoundary {
    /**
     * Interface used by the Controller, implemented by interactor. Used by controller to call interactor to perform use case
     * @param requestModel
     * @return
     */
    VisualizationWeekResponseModel showQuantityVisual(VisualizationWeekRequestModel requestModel);
}
