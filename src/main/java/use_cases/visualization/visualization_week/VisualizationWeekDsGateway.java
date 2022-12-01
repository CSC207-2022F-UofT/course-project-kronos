package use_cases.visualization.visualization_week;

import java.util.HashMap;

public interface VisualizationWeekDsGateway {
    /**
     * Interface used by interactor, implemented by database. Used to obtain stored data to visualize
     * @param requestModel
     * @return
     */
    HashMap createChart(VisualizationWeekDsRequestModel requestModel);

    boolean existsByName(String habitName);
}
