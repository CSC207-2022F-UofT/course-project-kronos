package use_cases.visualization.visualization_year;

import java.util.Date;

public class VisualizationYearRequestModel {
    private String habitName;
    private Date startDate;


    /**
     * Create a request model for visualize year use case
     * @param habitName - name of habit
     * @param startDate - first day of year is passed, and all habit data in selected month is visualized
     * @param imagePath - the path where the chart will be stored
     */
    public VisualizationYearRequestModel(String habitName, Date startDate, String imagePath) {
        this.habitName = habitName;
        this.startDate = startDate;
    }


    String getHabitName(){return this.habitName;}

    Date getStartDate(){return this.startDate;}

    void setHabitName(String habitName){this.habitName = habitName;}

    void setStartDate(Date startDate){this.startDate = startDate;}
}
