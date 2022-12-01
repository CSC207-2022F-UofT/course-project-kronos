package use_cases.visualization.visualization_week;

import java.util.Date;
import java.util.HashMap;

public class VisualizationWeekResponseModel {
    private HashMap habitData;
    private Date startDate;

    public VisualizationWeekResponseModel(HashMap habitData, Date startDate){
        this.habitData = habitData;
        this.startDate = startDate;
    }

    public void setHabitData(HashMap habitData) {
        this.habitData = habitData;
    }

    public HashMap getHabitData() {
        return habitData;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
