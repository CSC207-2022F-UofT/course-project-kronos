package use_cases.visualization.visualization_month;

/**
 * Interface used by use case interactor and implemented by database. Use to obtain stored data in
 * database and visualize the progression of habits during the month
 */
public interface VisualizationMonthDsGateway {

    /**
     * Create the chart requested for in the request model
     * @param requestModel
     */
    void createChart(VisualizationMonthDsRequestModel requestModel);
    
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
