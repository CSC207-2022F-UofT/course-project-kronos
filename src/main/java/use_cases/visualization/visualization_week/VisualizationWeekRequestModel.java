package use_cases.visualization.visualization_week;

import java.util.Date;

public class VisualizationWeekRequestModel {

    private String habitName;
    private Date startDate;

    private String imagePath;
    
    public VisualizationWeekRequestModel(String habitName, Date startDate, String imagePath) {
        this.habitName = habitName;
        this.startDate = startDate;
        this.imagePath = imagePath;
    }

    String getHabitName(){return this.habitName;}

    Date getStartDate(){return this.startDate;}

    String getImagePath(){return this.imagePath;}

    void setHabitName(String habitName){this.habitName = habitName;}

    void setStartDate(Date startDate){this.startDate = startDate;}

    void setImagePath(String imagePath){this.imagePath = imagePath;}
}
