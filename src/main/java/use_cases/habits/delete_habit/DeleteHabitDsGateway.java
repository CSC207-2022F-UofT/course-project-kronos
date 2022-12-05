package use_cases.habits.delete_habit;


/**
 * Gateway for deleting a habit.
 */
public interface DeleteHabitDsGateway {

    void deleteHabit(DeleteHabitDsRequestModel requestModel);
}
