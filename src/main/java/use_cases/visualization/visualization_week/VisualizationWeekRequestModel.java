package use_cases.visualization.visualization_week;

import java.util.Date;

public class VisualizationWeekRequestModel {

    private String habitName;
    private Date startDate;
    
    public VisualizationWeekRequestModel(String habitName, Date startDate) {
        this.habitName = habitName;
        this.startDate = startDate;
    }

    String getHabitName(){return this.habitName;}

    Date getStartDate(){return this.startDate;}

    void setHabitName(String habitName){this.habitName = habitName;}

    void setStartDate(Date startDate){this.startDate = startDate;}

}