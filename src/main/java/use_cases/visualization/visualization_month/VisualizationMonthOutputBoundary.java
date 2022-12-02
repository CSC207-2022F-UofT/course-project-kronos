package use_cases.visualization.visualization_month;

public interface VisualizationMonthOutputBoundary {

    /**
     * return response model for successful use case execution
     * @param visualizationMonthResponseModel
     * @return
     */
    VisualizationMonthResponseModel prepareSuccessView(VisualizationMonthResponseModel visualizationMonthResponseModel);

    /**
     * Return response model for unsuccessful use case execution
     * @param errorMessage
     * @return
     */
    VisualizationMonthResponseModel prepareFailureView(String errorMessage);
}
