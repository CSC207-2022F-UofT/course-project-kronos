package controllers.visualization;

import use_cases.visualization.visualization_week.VisualizationWeekOutputBoundary;
import use_cases.visualization.visualization_week.VisualizationWeekResponseModel;

public class VisualizationWeekPresenter implements VisualizationWeekOutputBoundary {
    @Override
    public VisualizationWeekResponseModel prepareSuccessView(VisualizationWeekResponseModel visualizationWeekResponseModel) {
        // need to implement
    }

    @Override
    public VisualizationWeekResponseModel prepareFailureView(String errorMessage) {
        throw new RuntimeException(errorMessage);
    }
}