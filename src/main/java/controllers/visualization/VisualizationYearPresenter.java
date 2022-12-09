package controllers.visualization;

import use_cases.visualization.visualization_week.VisualizationWeekInteractor;
import use_cases.visualization.visualization_week.VisualizationWeekResponseModel;
import use_cases.visualization.visualization_year.VisualizationYearOutputBoundary;
import use_cases.visualization.visualization_year.VisualizationYearResponseModel;

public class VisualizationYearPresenter implements VisualizationYearOutputBoundary {


    /**
     * return response model for successful use case execution
     *
     * @param visualizationYearResponseModel
     * @return
     */
    @Override
    public VisualizationYearResponseModel prepareSuccessView(VisualizationYearResponseModel visualizationYearResponseModel) {
        return null; // need to implement
    }

    /**
     * Return response model for unsuccessful use case execution
     *
     * @param errorMessage
     * @return
     */
    @Override
    public VisualizationYearResponseModel prepareFailureView(String errorMessage) {
        return null; // need to implement
    }
}
