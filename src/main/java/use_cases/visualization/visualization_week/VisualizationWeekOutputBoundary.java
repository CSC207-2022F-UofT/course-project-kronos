package use_cases.visualization.visualization_week;

public interface VisualizationWeekOutputBoundary {
    VisualizationWeekResponseModel prepareSuccessView(VisualizationWeekResponseModel visualizationWeekResponseModel);

    VisualizationWeekResponseModel prepareFailureView(String errorMessage);
}
