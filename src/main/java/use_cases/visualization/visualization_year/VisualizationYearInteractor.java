package use_cases.visualization.visualization_year;


import use_cases.visualization.visualization_week.VisualizationWeekRequestModel;
import use_cases.visualization.visualization_week.VisualizationWeekResponseModel;

public class VisualizationYearInteractor implements VisualizationYearInputBoundary{

    final VisualizationYearDsGateway visualizationYearDsGateway;
    final VisualizationYearOutputBoundary visualizationYearOutputBoundary;

    public VisualizationYearInteractor(VisualizationYearDsGateway visualizationYearDsGateway, VisualizationYearOutputBoundary visualizationYearOutputBoundary){
        this.visualizationYearDsGateway = visualizationYearDsGateway;
        this.visualizationYearOutputBoundary = visualizationYearOutputBoundary;
    }

    /**
     * Interface used by the Controller, implemented by interactor. Used by controller to call interactor to show visual
     * habit progression in the Year
     *
     * @param requestModel
     * @return
     */
    @Override
    public VisualizationWeekResponseModel showVisual(VisualizationWeekRequestModel requestModel) {
        return null; // need to implement
    }
}
