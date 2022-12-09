package use_cases.visualization.visualization_month;

import java.util.Date;


/**
 * Request model passed from controller to Inputboundary interface, implemented by interactor
 */
public class VisualizationMonthRequestModel {
    private String habitName;
    private Date startDate;

    /**
     * Create a request model for visualize month use case
     * @param habitName
     * @param startDate - first day of month is passed, and all habit data in selected month is visualized
     * @param imagePath
     */
    public VisualizationMonthRequestModel(String habitName, Date startDate, String imagePath) {
        this.habitName = habitName;
        this.startDate = startDate;
    }

    // setter and getter methods

    String getHabitName(){return this.habitName;}

    Date getStartDate(){return this.startDate;}

    void setHabitName(String habitName){this.habitName = habitName;}

    void setStartDate(Date startDate){this.startDate = startDate;}
}
