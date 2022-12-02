package controllers.visualization;

import use_cases.visualization.visualization_month.VisualizationMonthOutputBoundary;
import use_cases.visualization.visualization_month.VisualizationMonthResponseModel;

public class VisualizationMonthPresenter implements VisualizationMonthOutputBoundary {
    /**
     * return response model for successful use case execution
     *
     * @param visualizationMonthResponseModel
     * @return
     */
    @Override
    public VisualizationMonthResponseModel prepareSuccessView(VisualizationMonthResponseModel visualizationMonthResponseModel) {
        return null; // need to implement
    }

    /**
     * Return response model for unsuccessful use case execution
     *
     * @param errorMessage
     * @return
     */
    @Override
    public VisualizationMonthResponseModel prepareFailureView(String errorMessage) {
        return null;
    }
}
