package use_cases.visualization.visualization_quantity;

import java.util.Date;
import java.util.HashMap;

public interface VisualizationDsGateway {

    HashMap getData(String habitName, Date startDate, Date endDate);
}
