package use_cases.habits.edit_habit;

/**
 * Gateway for editing a habit.
 */
public interface EditHabitDsGateway {

    void save(EditHabitDsRequestModel requestModel);
}
