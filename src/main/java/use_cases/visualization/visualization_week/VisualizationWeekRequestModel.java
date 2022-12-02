package use_cases.visualization.visualization_week;

import java.util.Date;

public class VisualizationWeekRequestModel {

    private String habitName;
    private Date startDate;

    /**
     * Create a request model for visualize week use case
     * @param habitName
     * @param startDate - first day of week is passed, and all habit data in selected week is visualized
     * @param imagePath
     */
    public VisualizationWeekRequestModel(String habitName, Date startDate, String imagePath) {
        this.habitName = habitName;
        this.startDate = startDate;
    }

    String getHabitName(){return this.habitName;}

    Date getStartDate(){return this.startDate;}

    void setHabitName(String habitName){this.habitName = habitName;}

    void setStartDate(Date startDate){this.startDate = startDate;}
}
