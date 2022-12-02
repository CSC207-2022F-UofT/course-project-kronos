package use_cases.visualization.visualization_year;

import java.util.Date;

public class VisualizationYearResponseModel {
    private String habitName;
    private Date startDate;


    /**
     * Create a request model for visualize year use case
     * @param habitName - name of habit
     * @param startDate - first day of year is passed, and all habit data in selected month is visualized
     * @param imagePath - the path where the chart is stored
     */
    public VisualizationYearResponseModel(String habitName, Date startDate, String imagePath) {
        this.habitName = habitName;
        this.startDate = startDate;
    }

    // setter and getter methods

    String getHabitName(){return this.habitName;}

    Date getStartDate(){return this.startDate;}

    void setHabitName(String habitName){this.habitName = habitName;}

    void setStartDate(Date startDate){this.startDate = startDate;}
}
