package use_cases.visualization.visualization_quantity;

public class VisualizationInteractor implements VisualizationInputBoundary{

    final VisualizationDsGateway visualizationDsGateway;
    final VisualizationPresenter visualizationPresenter;

    public VisualizationInteractor(VisualizationDsGateway visualizationDsGateway, VisualizationPresenter visualizationPresenter) {
        this.visualizationDsGateway = visualizationDsGateway;
        this.visualizationPresenter = visualizationPresenter;
    }

    final
    @Override
    public VisualizationResponseModel showQuantityVisual(VisualizationRequestModel requestModel) {
        return null;
    }
}
