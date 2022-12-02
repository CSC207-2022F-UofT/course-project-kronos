package database;

import entities.Habit;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import use_cases.visualization.visualization_month.VisualizationMonthDsGateway;
import use_cases.visualization.visualization_month.VisualizationMonthDsRequestModel;
import use_cases.visualization.visualization_week.VisualizationWeekDsGateway;
import use_cases.visualization.visualization_week.VisualizationWeekDsRequestModel;
import use_cases.visualization.visualization_year.VisualizationYearDsGateway;
import use_cases.visualization.visualization_year.VisualizationYearRequestModel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class DatabaseVisualization implements VisualizationWeekDsGateway, VisualizationMonthDsGateway, VisualizationYearDsGateway {

    private HashMap<String, Habit> collection;

    public DatabaseVisualization(DatabaseUser database){
        this.collection = database.currUser.getHabitCollection().getCollection();
    }

    @Override
    public void createChart(VisualizationWeekDsRequestModel requestModel) {

        ArrayList habitList = new ArrayList();
        habitList.add(this.collection.get(requestModel.getHabitName()));
        CreateChart chart = new CreateChart("frequency of habits",
                "frequency of habits", habitList);

        JFreeChart lineChartObject = ChartFactory.createLineChart(
                "Day vs Completion","Date",
                "Completion",
                chart.getDataset(), PlotOrientation.VERTICAL,
                true,true,false);
        try {
            int width = 640;    /* Width of the image */
            int height = 480;   /* Height of the image */
            File lineChart = new File("LineChart.jpeg");
            ChartUtilities.saveChartAsJPEG(lineChart, lineChartObject, width, height);
        } catch(IOException e){

        }
    }

    @Override
    public void createChart(VisualizationYearRequestModel requestModel) {

    }

    /**
     * Create the chart requested for in the request model
     *
     * @param requestModel
     */
    @Override
    public void createChart(VisualizationMonthDsRequestModel requestModel) {

    }

    @Override
    public boolean habitExistsByName(String habitName) {
        return collection.containsKey(habitName);
    }

    @Override
    public boolean checkRecordsExist(String habitName) {
        return collection.get(habitName).getFrequencyMap().size() > 0;
    }
}
