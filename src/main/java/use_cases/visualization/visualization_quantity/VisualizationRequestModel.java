package use_cases.visualization.visualization_quantity;

import java.util.Date;

public class VisualizationRequestModel {

    private String habitName;
    private Date startDate;
    private Date endDate;
    public VisualizationRequestModel(String habitName, Date startDate, Date endDate) {
        this.habitName = habitName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    String getHabitName(){return this.habitName;}

    Date getStartDate(){return this.startDate;}

    Date getEndDate(){return this.endDate;}

    void setHabitName(String habitName){this.habitName = habitName;}

    void setStartDate(Date startDate){this.startDate = startDate;}

    void setEndDate(Date endDate){this.endDate = endDate;}
}
