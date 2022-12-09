package use_cases.visualization.visualization_month;

public interface VisualizationMonthOutputBoundary {

    /**
     * return response model for successful use case execution
     */
    VisualizationMonthResponseModel prepareSuccessView(VisualizationMonthResponseModel visualizationMonthResponseModel);

    /**
     * Return response model for unsuccessful use case execution
     */
    VisualizationMonthResponseModel prepareFailureView(String errorMessage);
}
