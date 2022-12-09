package use_cases.visualization.visualization_week;

import java.util.Calendar;
import java.util.Date;

public class VisualizationWeekResponseModel {
    private String habitName;
    private Calendar startDate;

    private String imagePath;

    /**
     * Create a request model for visualize year use case
     * @param habitName - name of habit
     * @param startDate - first day of year is passed, and all habit data in selected month is visualized
     * @param imagePath - the path where the chart is stored
     */
    public VisualizationWeekResponseModel(String habitName, Calendar startDate, String imagePath){
        this.habitName = habitName;
        this.startDate = startDate;
        this.imagePath = imagePath;
    }

    // setter and getter methods

    String getHabitName(){return this.habitName;}

    Calendar getStartDate(){return this.startDate;}

    String getImagePath(){return this.imagePath;}

    void setHabitName(String habitName){this.habitName = habitName;}

    void setStartDate(Calendar startDate){this.startDate = startDate;}

    void setImagePath(String imagePath){this.imagePath = imagePath;}
}
