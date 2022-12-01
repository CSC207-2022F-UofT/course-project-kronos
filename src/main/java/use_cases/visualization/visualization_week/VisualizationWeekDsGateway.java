package use_cases.visualization.visualization_week;

import java.util.HashMap;

public interface VisualizationWeekDsGateway {

    HashMap getData(VisualizationWeekDsRequestModel requestModel);

    boolean existsByName(String habitName);
}
