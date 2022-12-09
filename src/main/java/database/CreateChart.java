package database;

import entities.Habit;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class CreateChart extends ApplicationFrame{

    DefaultCategoryDataset dataset;

    public CreateChart(String applicationTitle, String chartTitle, ArrayList<Habit> habits){ // , Date startDate, Date endDate implement startDate and endDate functionality later
        super(applicationTitle);
        this.dataset = createDataset(habits);
        JFreeChart lineChart = ChartFactory.createLineChart(
                chartTitle,
                "Date","Frequency",
                this.dataset
                ,
                PlotOrientation.VERTICAL,
                true,true,false);

        ChartPanel chartPanel = new ChartPanel( lineChart );
        chartPanel.setPreferredSize( new Dimension( 560 , 367 ) );
        setContentPane( chartPanel );
    }

    private DefaultCategoryDataset createDataset(ArrayList<Habit> habits){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        for (Habit habit: habits){
            habit.getFrequencyMap().forEach((date, frequency) -> {
                dataset.addValue(frequency, habit.getName(), date);
            });
        }
        return dataset;
    }

    public DefaultCategoryDataset getDataset(){
        return this.dataset;
    }



}
