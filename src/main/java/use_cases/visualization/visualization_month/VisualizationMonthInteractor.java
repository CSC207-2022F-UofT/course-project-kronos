package use_cases.visualization.visualization_month;

public class VisualizationMonthInteractor implements VisualizationMonthInputBoundary{

    final VisualizationMonthDsGateway visualizationMonthDsGateway;
    final VisualizationMonthOutputBoundary visualizationMonthPresenter;

    public VisualizationMonthInteractor(VisualizationMonthDsGateway visualizationMonthDsGateway, VisualizationMonthOutputBoundary visualizationMonthPresenter) {
        this.visualizationMonthDsGateway = visualizationMonthDsGateway;
        this.visualizationMonthPresenter = visualizationMonthPresenter;
    }

    /**
     * Interface used by the Controller, implemented by interactor. Used by controller to call interactor to show visual
     * habit progression in the month
     *
     */
    @Override
    public VisualizationMonthResponseModel showVisual(VisualizationMonthRequestModel requestModel) {
        return null; // need to implement
    }
}
