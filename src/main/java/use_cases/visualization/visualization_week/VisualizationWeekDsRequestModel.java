package use_cases.visualization.visualization_week;

import java.util.Calendar;

public class VisualizationWeekDsRequestModel {
    private String habitName;
    private Calendar startDate;
    private String imagePath;

    public VisualizationWeekDsRequestModel(String habitName, Calendar startDate, String imagePath) {
        this.habitName = habitName;
        this.startDate = startDate;
        this.imagePath = imagePath;
    }

    public String getHabitName(){return this.habitName;}

    public Calendar getStartDate(){return this.startDate;}

    public String getImagePath(){return this.imagePath;}

    public void setHabitName(String habitName){this.habitName = habitName;}

    public void setStartDate(Calendar startDate){this.startDate = startDate;}

    public void setImagePath(String imagePath){this.imagePath = imagePath;}


}
