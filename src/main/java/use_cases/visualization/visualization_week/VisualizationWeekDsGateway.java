package use_cases.visualization.visualization_week;

/**
 * Interface used by interactor, implemented by database. Used to obtain stored data to visualize
 * progression of habits during the week
 */
public interface VisualizationWeekDsGateway {

    /**
     * Create the chart requested for in the request model
     * @param requestModel
     */
    void createChart(VisualizationWeekDsRequestModel requestModel);

    /**
     * check that the habit exists for the current user
     * @param habitName
     * @return
     */
    boolean habitExistsByName(String habitName);

    /**
     * check that there is enough data to meaningfully visualize data. Enough data is
     * characterised by presence of at least one record of compleion of habit
     * @param habitName
     * @return
     */
    boolean checkRecordsExist(String habitName);
}
