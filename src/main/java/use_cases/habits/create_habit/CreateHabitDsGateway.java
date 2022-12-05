package use_cases.habits.create_habit;

/**
 * Gateway for creating a habit.
 */
public interface CreateHabitDsGateway {

    void save(CreateHabitDsRequestModel requestModel);
}
