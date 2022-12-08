package use_cases.habits.delete_habit;


/**
 * Gateway for deleting a habit.
 */
public interface DeleteHabitDsGateway {

    /**
     * Deletes the habit based on data in the request model from the database.
     * @param requestModel - a data structure that contains data about the habit that should be removed from the database.
     */

    void deleteHabit(DeleteHabitDsRequestModel requestModel);
}
