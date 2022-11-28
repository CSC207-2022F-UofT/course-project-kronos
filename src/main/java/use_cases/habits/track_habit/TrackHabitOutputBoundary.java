package use_cases.habits.track_habit;

import use_cases.habits.edit_habit.EditHabitOutputData;

public interface TrackHabitOutputBoundary {

    TrackHabitOutputData prepareSuccessView(TrackHabitOutputData outputData);
    TrackHabitOutputData prepareFailView(TrackHabitOutputData outputData);
}
