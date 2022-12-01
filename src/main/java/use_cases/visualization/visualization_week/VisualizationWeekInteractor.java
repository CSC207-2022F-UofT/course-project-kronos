package use_cases.visualization.visualization_week;

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
        if (visualizationWeekDsGateway.existsByName(requestModel.getHabitName())) {

        } else {
            return visualizationWeekPresenter.prepareFailureView("Habit Name does not exist");
        }
    }
}
