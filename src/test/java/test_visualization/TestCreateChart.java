package test_visualization;

import entities.Habit;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.junit.Test;
import use_cases.visualization.CreateChart;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class TestCreateChart {

    @Test
    public void TestChartCreation() throws IOException {
        Habit habit1 = new Habit("Running", "number of minutes", true);
        Habit habit2 = new Habit("Running Faster", "number of minutes", true);
        habit1.markFrequency();
        habit2.markFrequency();
        ArrayList habitList = new ArrayList();
        habitList.add(habit1);
        habitList.add(habit2);
        CreateChart chart = new CreateChart("frequency of habits",
                "frequency of each habit wrt to date", habitList);

        JFreeChart lineChartObject = ChartFactory.createLineChart(
                "Schools Vs Years","Year",
                "Schools Count",
                chart.getDataset(), PlotOrientation.VERTICAL,
                true,true,false);

        int width = 640;    /* Width of the image */
        int height = 480;   /* Height of the image */
        File lineChart = new File( "LineChart.jpeg" );
        ChartUtilities.saveChartAsJPEG(lineChart ,lineChartObject, width ,height);

    }
}
