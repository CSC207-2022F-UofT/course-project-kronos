package use_cases.visualization.visualization_week;

import java.util.Date;

public class VisualizationWeekDsRequestModel {
    private String habitName;
    private Date startDate;

    private String imagePath;

    public VisualizationWeekDsRequestModel(String habitName, Date startDate, String imagePath) {
        this.habitName = habitName;
        this.startDate = startDate;
        this.imagePath = imagePath;
    }

    public String getHabitName(){return this.habitName;}

    public Date getStartDate(){return this.startDate;}

    public String getImagePath(){return this.imagePath;}

    public void setHabitName(String habitName){this.habitName = habitName;}

    public void setStartDate(Date startDate){this.startDate = startDate;}

    public void setImagePath(String imagePath){this.imagePath = imagePath;}


}
