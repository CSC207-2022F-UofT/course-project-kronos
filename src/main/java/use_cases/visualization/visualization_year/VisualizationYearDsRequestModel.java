package use_cases.visualization.visualization_year;

import java.util.Date;

/**
 * The Request model is used to pass in requests for data and creation of charts to the database and controllers layer
 */
public class VisualizationYearDsRequestModel {

    private String habitName;
    private Date startDate;
    private String imagePath;

    /**
     * Create a request model for visualization of Habit progression in the month, with habitName corresponding to that stored
     * in database, selected month's first day passed to startDate, and imagePath being the path of resulting chart being creted
     */
    public VisualizationYearDsRequestModel(String habitName, Date startDate, String imagePath){
        this.habitName = habitName;
        this.startDate = startDate;
        this.imagePath = imagePath;
    }

    // Getters and setter methods for parameters
    public String getHabitName(){return this.habitName;}

    public Date getStartDate(){return this.startDate;}

    public String getImagePath(){return this.imagePath;}

    public void setHabitName(String habitName){this.habitName = habitName;}

    public void setStartDate(Date startDate){this.startDate = startDate;}

    public void setImagePath(String imagePath){this.imagePath = imagePath;}
}

