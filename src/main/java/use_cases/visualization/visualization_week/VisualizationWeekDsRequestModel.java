package use_cases.visualization.visualization_week;

import java.util.Date;

public class VisualizationWeekDsRequestModel {
    private String habitName;
    private Date startDate;

    public VisualizationWeekDsRequestModel(String habitName, Date startDate){
        this.habitName = habitName;
        this.startDate = startDate;
    }

    public String getHabitName(){return this.habitName;}
    public Date getStartDate(){return  this.getStartDate();}

    public void setHabitName(String newHabitName){this.habitName = newHabitName;}

    public void setStartDate(Date newStartDate){this.startDate = newStartDate;}


}
