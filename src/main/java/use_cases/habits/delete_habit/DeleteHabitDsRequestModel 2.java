package use_cases.habits.delete_habit;

import entities.Habit;


/**
 * Request Model class for deleting a habit.
 */
public class DeleteHabitDsRequestModel {

    private String habitName;


    /**
     * Constructor for this class.
     * @param habitName - Name of habit to be deleted.
     */
    public DeleteHabitDsRequestModel(String habitName) {
        this.habitName = habitName;
    }

    /**
     * @return habit to be deleted
     */
    public String getHabitName() {
        return this.habitName;
    }

    /**
     * @param habitName - name of habit
     */
    public void setHabitName(String habitName){this.habitName = habitName;}
}
