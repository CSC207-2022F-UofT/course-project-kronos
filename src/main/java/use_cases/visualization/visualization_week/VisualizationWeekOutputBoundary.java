package use_cases.visualization.visualization_week;


/**
 * Interface implemented by Presenter to display information to the ui from the interactor in use case layer.
 */
public interface VisualizationWeekOutputBoundary {


    /**
     * return response model for successful use case execution
     * @param visualizationWeekResponseModel
     * @return
     */
    VisualizationWeekResponseModel prepareSuccessView(VisualizationWeekResponseModel visualizationWeekResponseModel);

    /**
     * Return response model for unsuccessful use case execution
     * @param errorMessage
     * @return
     */
    VisualizationWeekResponseModel prepareFailureView(String errorMessage);
}
