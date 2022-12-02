package use_cases.visualization.visualization_year;


/**
 * Interface implemented by Presenter to display information to the ui from the interactor in use case layer.
 */
public interface VisualizationYearOutputBoundary {

    /**
     * return response model for successful use case execution
     * @param visualizationYearResponseModel
     * @return
     */
    VisualizationYearResponseModel prepareSuccessView(VisualizationYearResponseModel visualizationYearResponseModel);

    /**
     * Return response model for unsuccessful use case execution
     * @param errorMessage
     * @return
     */
    VisualizationYearResponseModel prepareFailureView(String errorMessage);
}
