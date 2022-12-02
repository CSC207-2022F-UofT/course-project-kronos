package use_cases.visualization.visualization_week;

import java.util.HashMap;

/**
 * Interface used by interactor, implemented by database. Used to obtain stored data to visualize
 */
public interface VisualizationWeekDsGateway {

    void createChart(VisualizationWeekDsRequestModel requestModel);

    boolean existsByName(String habitName);

    boolean checkRecordsExist(String habitName);
}
