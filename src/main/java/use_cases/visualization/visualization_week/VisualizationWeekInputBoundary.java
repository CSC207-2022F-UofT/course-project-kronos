package use_cases.visualization.visualization_week;

public interface VisualizationWeekInputBoundary {
    /**
     * Interface used by the Controller, implemented by interactor. Used by controller to call interactor to show visual
     * habit progression in the week
     * @param requestModel
     * @return
     */
    VisualizationWeekResponseModel showVisual(VisualizationWeekRequestModel requestModel);
}
