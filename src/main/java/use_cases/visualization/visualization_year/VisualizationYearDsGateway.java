package use_cases.visualization.visualization_year;




/**
 * Interface used by interactor, implemented by database. Used to obtain stored data to visualize
 */
public interface VisualizationYearDsGateway {

    void createChart(VisualizationYearDsGateway requestModel);

    boolean existsByName(String habitName);
}

