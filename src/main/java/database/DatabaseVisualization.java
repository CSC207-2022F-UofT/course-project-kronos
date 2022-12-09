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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class DatabaseVisualization implements VisualizationWeekDsGateway, VisualizationMonthDsGateway, VisualizationYearDsGateway {

    private final HashMap<String, Habit> collection;

    public DatabaseVisualization(DatabaseUser database){
        this.collection = database.currUser.getHabitCollection().getCollection();
    }

    /**
     *  Create chart for week-wise visualization
     * @param requestModel - Ds RequestModel used to store data required to create week-wise visualization
     */
    @Override
    public void createChart(VisualizationWeekDsRequestModel requestModel) {

        ArrayList<Habit> habitList = new ArrayList<>();
        HashMap<String, Integer> fullHabitData = this.collection.get(requestModel.getHabitName()).getFrequencyMap();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal  = Calendar.getInstance();
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        fullHabitData.forEach((date, frequency) -> {
                    try {
                        cal.setTime(sdf.parse(date));
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
            Calendar.getInstance();



        });
        Habit habit = new Habit(requestModel.getHabitName(), "");
        habit.getFrequencyMap().putAll(frequencyMap);
        habitList.add(habit);


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
            File lineChart = new File(requestModel.getImagePath());
            ChartUtilities.saveChartAsJPEG(lineChart, lineChartObject, width, height);
        } catch(IOException ignored){

        }
    }


    /**
     *  Create chart for Month-wise visualization
     * @param requestModel - Ds RequestModel used to store data required to create week-wise visualization
     */
    @Override
    public void createChart(VisualizationYearRequestModel requestModel) {

    }

    /**
     *  Create chart for year-wise visualization
     * @param requestModel - Ds RequestModel used to store data required to create year-wise visualization
     */
    @Override
    public void createChart(VisualizationMonthDsRequestModel requestModel) {

    }

    /**
     * return true if habit exists in the collection of habits for database
     * @param habitName - name of habit
     * @return whether habit with given name exists
     */
    @Override
    public boolean habitExistsByName(String habitName) {
        return collection.containsKey(habitName);
    }

    /**
     * return whether at least one record exists in the specified time period
     * @return whether any records exist for meaningful visualization
     */
    @Override
    public boolean checkRecordsExist(String habitName) {
        return collection.get(habitName).getFrequencyMap().size() > 0;
    }
}
