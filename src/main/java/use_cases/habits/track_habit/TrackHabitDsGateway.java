package use_cases.habits.track_habit;

import use_cases.habits.edit_habit.EditHabitDsRequestModel;

public interface TrackHabitDsGateway {

    void save(TrackHabitDsRequestModel requestModel);
}
