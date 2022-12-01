package use_cases.visualization.visualization_week;

import java.util.HashMap;

public class VisualizationWeekInteractor implements VisualizationWeekInputBoundary {

    final VisualizationWeekDsGateway visualizationWeekDsGateway;
    final VisualizationWeekOutputBoundary visualizationWeekPresenter;

    public VisualizationWeekInteractor(VisualizationWeekDsGateway visualizationWeekDsGateway, VisualizationWeekOutputBoundary visualizationWeekPresenter) {
        this.visualizationWeekDsGateway = visualizationWeekDsGateway;
        this.visualizationWeekPresenter = visualizationWeekPresenter;
    }

    final
    @Override
    public VisualizationWeekResponseModel showQuantityVisual(VisualizationWeekRequestModel requestModel) {
        if (!visualizationWeekDsGateway.existsByName(requestModel.getHabitName())) {
            return visualizationWeekPresenter.prepareFailureView("Habit Name does not exist");
        }
        VisualizationWeekDsRequestModel dsRequestModel = new VisualizationWeekDsRequestModel(requestModel.getHabitName(), requestModel.getStartDate());
        HashMap data = visualizationWeekDsGateway.createChart(dsRequestModel);
        
    }
}
