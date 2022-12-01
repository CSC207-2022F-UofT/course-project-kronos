package use_cases.visualization.visualization_week;


/**
 * Interface implemented by Presenter to display information to the ui from the interactor in use case layer.
 */
public interface VisualizationWeekOutputBoundary {


    /**
     * return
     * @param visualizationWeekResponseModel
     * @return
     */
    VisualizationWeekResponseModel prepareSuccessView(VisualizationWeekResponseModel visualizationWeekResponseModel);

    VisualizationWeekResponseModel prepareFailureView(String errorMessage);
}
