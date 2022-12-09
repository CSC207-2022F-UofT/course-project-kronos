package use_cases.habits.create_habit;

/**
 * Gateway for creating a habit.
 */
public interface CreateHabitDsGateway {

    /**
     * Saves the habit related the data in the request model to the database.
     * @param requestModel - a data structure that contains data about the new habit that should be saved in the database.
     */

    void save(CreateHabitDsRequestModel requestModel);
}
