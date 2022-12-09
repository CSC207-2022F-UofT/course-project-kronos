package use_cases.habits.edit_habit;


/**
 * Gateway for editing a habit.
 */
public interface EditHabitDsGateway {

    /**
     * Saves the data about the task after edition to the database.
     * @param requestModel - a data structure that contains data about the task after edition.
     */
    void save(EditHabitDsRequestModel requestModel);
}
